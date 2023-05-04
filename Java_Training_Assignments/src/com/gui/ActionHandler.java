package com.gui;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

	private TextField first;
	private TextField second;
	private TextField result;

	public ActionHandler(TextField first, TextField second, TextField result) {
		this.first = first;
		this.second = second;
		this.result = result;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button clicked");
		int num1 = Integer.parseInt(first.getText());
		int num2 = Integer.parseInt(second.getText());
		Integer res = 0;

		if (e.getActionCommand().equalsIgnoreCase("add")) {
			System.out.println("add" + (num1 + num2));
			res = num1+num2;
		} else if (e.getActionCommand().equalsIgnoreCase("sub")) {
			System.out.println("sub"+ (num1 - num2));
			res = num1-num2;
		} else if (e.getActionCommand().equalsIgnoreCase("mul")) {
			System.out.println("mul"+ (num1 * num2));
			res = num1*num2;
		} else if (e.getActionCommand().equalsIgnoreCase("div")) {
			System.out.println("div"+ (num1 / num2));
			res = num1/num2;
		}else {
			System.out.println("Reset");
			first.setText("");
			second.setText("");
		}
		
		result.setText("Result is "+res.toString());
	}

}
