package gmit.ie;


import java.awt.BorderLayout;
import java.awt.Color;
//import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
//import java.awt.GridLayout;

import javax.swing.BoxLayout;
//import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyJFrame extends JFrame {
	JButton button1, button2, button3, button4, button5; 
	Container mainPane;
	 
	public MyJFrame(){
		super();
		initUI();
		placeComponents();
		bindListeners();
		
	}

	private void bindListeners() {
	}
	private void placeComponents() {
		
		JPanel northPanel = new JPanel();
		JPanel eastPanel = new JPanel();
		
		mainPane = this.getContentPane();
		button1 = new JButton("button 1");
		button2 = new JButton("button 2");
		button3 = new JButton("button 3");
		button4 = new JButton("button 4");
		button5 = new JButton("button 5");
		 
		mainPane.add(northPanel,BorderLayout.NORTH );
		northPanel.setLayout(new FlowLayout());
		northPanel.setBackground(Color.ORANGE);
		northPanel.add(button1);
		northPanel.add(button2);
		northPanel.add(button3);
		
		mainPane.add(eastPanel,BorderLayout.EAST );
		eastPanel.setLayout(new BoxLayout(eastPanel, BoxLayout.PAGE_AXIS));
		eastPanel.add(button4);
		eastPanel.add(button5);
		
		
		
		
		//Container mainPane = this.getContentPane();
		//mainPane.setLayout(new FlowLayout());
		//mainPane.setLayout(new GridLayout(1,3));
		
		
		
		//mainPane.add(button1, BorderLayout.NORTH);
		//mainPane.add(button2, BorderLayout.SOUTH);
		//mainPane.add(button3, BorderLayout.EAST);
		//mainPane.add(button4, BorderLayout.WEST);
		//mainPane.add(button5, BorderLayout.CENTER);
	}
	private void initUI() {
		this.setSize(400,300);
		this.setTitle("Its class");
		this.setLocationRelativeTo (null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
