import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel extends JPanel implements ActionListener {
	
	private static final int WIDTH = 380;
	private static final int HEIGHT = 420;
	JTextField textfield = new JTextField(30);
	JButton[] numButton = new JButton[10];
	
	
	
	JButton deletButton = new JButton("DELETE");
	JButton plusButton = new JButton("+");
	JButton minusButton = new JButton("-");
	JButton divideButton = new JButton("/");
	JButton multButton = new JButton("x");
	JButton dotButton = new JButton(".");
	JButton equalButton = new JButton("=");
	JButton AC = new JButton("AC");
	
	int dotcount = 0;
	char operator;
	double x1,x2 = 0;
	double res = 0;
	String temp = "0";
	
	
	
	

	
	
	public  Panel() {
		this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		this.setBackground(Color.LIGHT_GRAY);
		textfield.setFont(new Font(Font.DIALOG_INPUT, Font.ROMAN_BASELINE, 20));
		textfield.setBounds(40, 50, 300, 50);
		
		this.add(textfield);
		
		
     	this.add(plusButton);
     	plusButton.setBounds(280, 350, 70, 50);
     	
     	this.add(minusButton);
     	minusButton.setBounds(280, 290 , 70, 50);
     	
     	this.add(multButton);
     	multButton.setBounds(280, 230 , 70, 50);
     	
     	this.add(divideButton);
     	divideButton.setBounds(280, 170 , 70, 50);
     	
     	this.add(AC);
     	AC.setBounds(280, 110 , 70, 50);
     	
     	
     	for(int i=0; i<10; i++) {
     		numButton[i] = new JButton();
     		numButton[i].setText(String.valueOf(i));
     	}
     	
     	
     
     	this.add(equalButton);
     	equalButton.setBounds(200, 350 , 70, 50);
     	
     	this.add(dotButton);
     	dotButton.setBounds(120, 350 , 70, 50);
     	
     	this.add(numButton[0]);
     	numButton[0].setBounds(40, 350 , 70, 50);
     	
     	
     	this.add(numButton[3]);
     	numButton[3].setBounds(200, 290 , 70, 50);
     	
     	this.add(numButton[6]);
     	numButton[6].setBounds(200, 230 , 70, 50);
     	
     	this.add(numButton[6]);
     	numButton[6].setBounds(200, 230 , 70, 50);
     	
     	this.add(numButton[9]);
     	numButton[9].setBounds(200, 170 , 70, 50);
     	
     	this.add(numButton[2]);
     	numButton[2].setBounds(120, 290 , 70, 50);
     	
     	this.add(numButton[5]);
     	numButton[5].setBounds(120, 230 , 70, 50);
     
    	this.add(numButton[8]);
     	numButton[8].setBounds(120, 170 , 70, 50);
     	
    	this.add(numButton[1]);
     	numButton[1].setBounds(40, 290 , 70, 50);
    	
     	this.add(numButton[4]);
     	numButton[4].setBounds(40, 230 , 70, 50);

    	this.add(numButton[7]);
     	numButton[7].setBounds(40, 170 , 70, 50);
     	
     	this.add(deletButton);
     	deletButton.setBounds(160, 110, 110, 50);
   
		this.setLayout(null);
		
		for(int i=0; i<10; i++) {
			numButton[i].addActionListener(this);
		}
		
		AC.addActionListener(this);
		plusButton.addActionListener(this);
		minusButton.addActionListener(this);
		deletButton.addActionListener(this);
		divideButton.addActionListener(this);
		multButton.addActionListener(this);
		dotButton.addActionListener(this);
		equalButton.addActionListener(this);
		
		
		
		
		
		
		
		
		
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.setFont(new Font(Font.SANS_SERIF, Font.CENTER_BASELINE,30));
		g.drawString("CALCULATOR", 80, 40);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i=0; i<10; i++) {
			if(e.getSource() == numButton[i]) {
				textfield.setText(textfield.getText().concat(String.valueOf(i)));
			}
		}
		if(e.getSource() == AC) {
			textfield.setText("");
			dotcount = 0;
		}
		
		if(e.getSource() == dotButton)  {
			if(dotcount == 0) {
				textfield.setText(textfield.getText().concat("."));
				dotcount++;
			}
		}
		
		if(e.getSource() == plusButton) {
			operator = '+';
			x1 = Double.parseDouble(textfield.getText());
			textfield.setText("");
			dotcount = 0;
			 
		}
		
		if(e.getSource() == minusButton) {
			operator = '-';
			x1 = Double.parseDouble(textfield.getText());
			textfield.setText("");
			dotcount = 0;
		}
		
		if(e.getSource() == divideButton) {
			operator = '/';
			x1 = Double.parseDouble(textfield.getText());
			textfield.setText("");
			dotcount = 0;
		}
		
		if(e.getSource() == multButton) {
			operator = 'x';
			x1 = Double.parseDouble(textfield.getText());
			textfield.setText("");
			dotcount = 0;
		}
		if(e.getSource() == deletButton && !temp.equals("")) {
			
				temp = textfield.getText();
				int x = temp.length();
				temp = temp.substring(0, x-1);
				textfield.setText(temp);
			
			
		}
		
		if(e.getSource() == equalButton) {
			x2 = Double.parseDouble(textfield.getText());
			textfield.setText("");
			switch(operator) {
			case '+':
				res = x1+x2;
				break;
			case '-':
				res = x1-x2;
				break;
			case 'x':
				res = x1*x2;
				break;
			case '/':
				res = x1/x2;
				break;
			}
			textfield.setText(String.valueOf(res));
		}
		
		
		
		
		
		
		
		
		
		
	}
	

	
	
	
	
	
	
}
