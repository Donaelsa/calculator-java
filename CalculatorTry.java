package calculatorsample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;


public class CalculatorTry implements ActionListener{
	static double a=0,b=0,result=0;
	static int operator=0;
	
	JFrame jf;
	JLabel displayLabel;
	
	JButton zeroButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	
	JButton equalButton;
	JButton decimalButton;
	JButton clearButton;
	JButton addButton;
	JButton subButton;
	JButton mulButton;
	JButton divButton;
	
	public CalculatorTry() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setVisible(true);
		jf.setLocation(300, 150);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		displayLabel=new JLabel();
		displayLabel.setBounds(30, 50, 540,40);
		displayLabel.setBackground(Color.LIGHT_GRAY);
		displayLabel.setOpaque(true);
		displayLabel.setForeground(Color.WHITE);
		jf.add(displayLabel);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		

		zeroButton=new JButton("0");
		oneButton=new JButton("1");
		twoButton=new JButton("2");
		threeButton=new JButton("3");
		fourButton=new JButton("4");
		fiveButton=new JButton("5");
		sixButton=new JButton("6");
		sevenButton=new JButton("7");
		eightButton=new JButton("8");
		nineButton=new JButton("9");
		
        
        sevenButton.setBounds(30, 130, 80, 80);
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
        sevenButton.addActionListener(this);
    	jf.add(sevenButton);

       /* System.out.println(zeroButton.getText());
		JButton sevenButton=new JButton("7");*/
    	
    	eightButton.setBounds(120, 130, 80, 80);
    	eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
    	eightButton.addActionListener(this);
    	jf.add(eightButton);
    	
    	nineButton.setBounds(210,130,80,80);
    	nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
    	nineButton.addActionListener(this);
    	jf.add(nineButton);
    	
    	fourButton.setBounds(30,220,80,80);
    	fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
    	fourButton.addActionListener(this);
    	jf.add(fourButton);
    	
    	fiveButton.setBounds(120,220,80,80);
    	fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
    	fiveButton.addActionListener(this);
    	jf.add(fiveButton);
    	

    	sixButton.setBounds(210,220,80,80);
    	sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
    	sixButton.addActionListener(this);
    	jf.add(sixButton);
    	
    	
    	oneButton.setBounds(30,310,80,80);
    	oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
    	oneButton.addActionListener(this);
    	jf.add(oneButton);
    	
    	
    	twoButton.setBounds(120,310,80,80);
    	twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
    	twoButton.addActionListener(this);
    	jf.add(twoButton);
    	
    	threeButton.setBounds(210,310,80,80);
    	threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
    	threeButton.addActionListener(this);
    	jf.add(threeButton);
    	
    	zeroButton.setBounds(120, 400,80,80);
    	zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
    	zeroButton.addActionListener(this);
    	jf.add(zeroButton);
    	
    	
    	equalButton = new JButton("=");
    	decimalButton = new JButton(".");
    	divButton = new JButton("/");
    	mulButton = new JButton("*");
    	addButton = new JButton("+");
    	subButton = new JButton("-");
    	clearButton = new JButton("C");
    	
    	clearButton.setBounds(400,400,80,80);
    	clearButton.setFont(new Font("Arial", Font.PLAIN, 40));
    	clearButton.addActionListener(this);
    	jf.add(clearButton);
    	
    	subButton.setBounds(300,310,80,80);
    	subButton.setFont(new Font("Arial", Font.PLAIN, 40));
    	subButton.addActionListener(this);
    	jf.add(subButton);
    	
    	addButton.setBounds(300,400,80,80);
    	addButton.setFont(new Font("Arial", Font.PLAIN, 40));
    	addButton.addActionListener(this);
    	jf.add(addButton);
    	
    	mulButton.setBounds(300, 220, 80, 80);
    	mulButton.setFont(new Font("Arial", Font.PLAIN, 40));
    	mulButton.addActionListener(this);
    	jf.add(mulButton);
    	
    	divButton.setBounds(300, 130, 80, 80);
    	divButton.setFont(new Font("Arial", Font.PLAIN, 40));
    	divButton.addActionListener(this);
    	jf.add(divButton);
    	
    	decimalButton.setBounds(210,400,80,80);
    	decimalButton.setFont(new Font("Arial", Font.PLAIN, 40));
    	decimalButton.addActionListener(this);
    	jf.add(decimalButton);
    	
    	equalButton.setBounds(30,400,80,80);
    	equalButton.setFont(new Font("Arial", Font.PLAIN, 40));
    	equalButton.addActionListener(this);
    	jf.add(equalButton);
    	
    	
	}
 	
	@Override
	public void actionPerformed(ActionEvent e) {
		//e.getActionCommand();
		
		
		if(e.getSource()==sevenButton) {
			displayLabel.setText(displayLabel.getText().concat("7"));
		
	}
		if(e.getSource()==eightButton) {
			displayLabel.setText(displayLabel.getText().concat("8"));
		
	}
			
		if(e.getSource()==nineButton) {
			displayLabel.setText(displayLabel.getText().concat("9"));
		
	}
				
		
		if(e.getSource()==fourButton) {
			displayLabel.setText(displayLabel.getText().concat("4"));
		
	}
		
			
		if(e.getSource()==fiveButton) {
			displayLabel.setText(displayLabel.getText().concat("5"));
		
	}
		
			
		if(e.getSource()==sixButton) {
			displayLabel.setText(displayLabel.getText().concat("6"));
		
	}
			
		if(e.getSource()==oneButton) {
			displayLabel.setText(displayLabel.getText().concat("1"));
		
	}
		if(e.getSource()==twoButton) {
			displayLabel.setText(displayLabel.getText().concat("2"));
		
	}
		if(e.getSource()==threeButton) {
			displayLabel.setText(displayLabel.getText().concat("3"));
		
	}
		if(e.getSource()==zeroButton) {
			displayLabel.setText(displayLabel.getText().concat("0"));
		
	}
		if(e.getSource()==decimalButton) {
			displayLabel.setText(displayLabel.getText().concat("."));
		
	}
		

		
		if(e.getSource()==divButton)
		{
		a=Double.parseDouble(displayLabel.getText());
		operator=1;
		displayLabel.setText("");
		}
		
		if(e.getSource()==mulButton)
		{
		a=Double.parseDouble(displayLabel.getText());
		operator=2;
		displayLabel.setText("");
		}
		if(e.getSource()==addButton)
		{
		a=Double.parseDouble(displayLabel.getText());
		operator=3;
		displayLabel.setText("");
		}
		if(e.getSource()==subButton)
		{
		a=Double.parseDouble(displayLabel.getText());
		operator=4;
		displayLabel.setText("");
		}
		if(e.getSource()==clearButton) {
			displayLabel.setText(" ");
		}
		
		
		if(e.getSource()==equalButton)
		{
		b=Double.parseDouble(displayLabel.getText());
		switch(operator)
		{
		case 1: result=a/b;
		break;
		case 2: result=a*b;
		break;
		case 3: result=a+b;
		break;
		case 4: result=a-b;
		break;
		default: result=0;
		}
		displayLabel.setText(""+result);
		}				
		
	}
	public static void main(String[] args) {    
		new CalculatorTry();
	} 
}

