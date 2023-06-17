package Juggler;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JugglerHandler implements ActionListener {

	private TextField firstValue;
	private TextField secondValue;
	private TextField thirdValue;

	public JugglerHandler(TextField firstValue, TextField secondValue, TextField thirdValue) {
		this.firstValue = firstValue;
		this.secondValue = secondValue;
		this.thirdValue = thirdValue;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int a = Integer.parseInt(firstValue.getText());
			int b = Integer.parseInt(secondValue.getText());
			int c = Integer.parseInt(thirdValue.getText());

			if (e.getActionCommand().equalsIgnoreCase("Clock-wise")) {
				System.out.println("Clock wise Button clicked");
				secondValue.setText("" + (a + 1));
				thirdValue.setText("" + (b + 1));
				firstValue.setText("" + (c + 1));

			} else if (e.getActionCommand().equalsIgnoreCase("Anti-Clock-Wise")) {
				System.out.println("Anit clock wise Button Clicked");
				firstValue.setText("" + (b - 1));
				secondValue.setText("" + (c - 1));
				thirdValue.setText("" + (a - 1));

			}
		} catch (Exception exception) {
			System.out.println("Integer value only excepted, Enter integer value insted of charcter "+exception);
		}

	}

}
