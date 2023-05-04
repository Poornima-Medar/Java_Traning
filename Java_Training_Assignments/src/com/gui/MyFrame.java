package com.gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

public class MyFrame extends Frame{
	
	MyFrame(boolean visible, String title,int width, int height){
		this.setVisible(visible);
		this.setTitle(title);
		this.setSize(width,height);
		this.addWindowListener(new WindowHandler());
		this.setLayout(null);
		
		TextField first = new TextField();
		first.setBounds(100,50,80,30);
		this.add(first);
		

		TextField second = new TextField();
		second.setBounds(200,50,80,30);
		this.add(second);
		
		TextField result = new TextField();
		result.setBounds(150,100,100,40);
		this.add(result);
		
		Button addButton = new Button("add");
		addButton.setBounds(50, 200, 100, 40);
		this.add(addButton);
		
		Button subButton = new Button("sub");
		subButton.setBounds(160, 200, 100, 40);
		this.add(subButton);
		
		Button mulButton = new Button("mul");
		mulButton.setBounds(270, 200, 100, 40);
		this.add(mulButton);
		
		Button divButton = new Button("div");
		divButton.setBounds(380, 200, 100, 40);
		this.add(divButton);
		
		Button resetButton = new Button("ReSet");
		resetButton.setBounds(200, 250, 100, 40);
		this.add(resetButton);
		
		addButton.addActionListener(new ActionHandler(first,second,result));
		subButton.addActionListener(new ActionHandler(first,second,result));
		mulButton.addActionListener(new ActionHandler(first,second,result));
		divButton.addActionListener(new ActionHandler(first,second,result));
		resetButton.addActionListener(new ActionHandler(first,second,result));
		
	}

}
