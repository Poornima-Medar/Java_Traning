package Juggler;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JugglerFrame extends Frame {

	public JugglerFrame() {

		setBounds(100, 100, 500, 500);
		setTitle("Juggler");
		setVisible(true);
		this.setLayout(null);

		TextField firstValue = new TextField();
		firstValue.setBounds(120, 100, 100, 40);
		add(firstValue);

		TextField secondValue = new TextField();
		secondValue.setBounds(270, 100, 100, 40);
		add(secondValue);

		TextField thirdValue = new TextField();
		thirdValue.setBounds(200, 200, 100, 40);
		add(thirdValue);

		Button clockWise = new Button("Clock-wise");
		clockWise.setBounds(120, 300, 100, 40);
		add(clockWise);
		clockWise.addActionListener(new JugglerHandler(firstValue,secondValue,thirdValue));

		Button antiClockWise = new Button("Anti-Clock-Wise");
		antiClockWise.setBounds(250, 300, 100, 40);
		add(antiClockWise);
		antiClockWise.addActionListener(new JugglerHandler(firstValue,secondValue,thirdValue));

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				JugglerFrame jf = (JugglerFrame) e.getSource();
				jf.dispose();
			}
		});
	}

}
