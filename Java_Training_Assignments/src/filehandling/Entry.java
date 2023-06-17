package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Entry {
	public static void main(String[] args) {

		File f = new File("/home/excellarate/Desktop/filedemo/data.txt");

		/*
		 * if (f.exists()) { // To check whether file exist or not
		 * System.out.println("File already exist");
		 * System.out.println(f.getAbsolutePath()); //to display path //f.delete(); //
		 * To delete the file //System.out.println("File deleted successfully"); } else
		 * { try { f.createNewFile(); // To create new file } catch (IOException e) {
		 * e.printStackTrace(); } }
		 */

		try {
			FileOutputStream fos = new FileOutputStream(f);
			fos.write("Text is added\n".getBytes());
			fos.write("This is my second content in to the file".getBytes());
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fis = new FileInputStream(f);
			int length = fis.read();
			byte[] b = new byte[length];
			fis.read(b);
			String s = new String(b);
			//System.out.println(s);

			FileReader reader = new FileReader(f);
			BufferedReader buffer = new BufferedReader(reader);
			String line = null;
			do {
				line = buffer.readLine();
				if(line!=null)
					System.out.println(line);
			}while(line!=null);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
