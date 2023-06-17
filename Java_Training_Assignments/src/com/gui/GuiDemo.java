package com.gui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuiDemo {

	public static void main(String[] args) {
		// JFrame- a GUI window to add component to
		
		//To set lable
		JLabel label = new JLabel();
		label.setText("Hello World");

		JFrame frame = new JFrame();// creates frame
		frame.setTitle("First frame");// to set title

		// close button operation
		// frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		// frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		frame.setResizable(false);//prevent frame from being resize
		
		frame.setSize(420, 420);// sets the x-dimention, and y-dimension of frame
		frame.setVisible(true);// make frame visible
		
		//frame.getContentPane().setBackground(Color.blue);
		frame.getContentPane().setBackground(new Color(123,50,220));
		frame.add(label);		
	}

}
