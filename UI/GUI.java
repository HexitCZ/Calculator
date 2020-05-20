package UI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Core.Main;
import Core.Main.Operation;



public class GUI extends JPanel
{
	private JButton numBtn1;
	private JButton numBtn2;
	private JButton numBtn3;
	private JButton numBtn4;
	private JButton numBtn5;
	private JButton numBtn6;
	private JButton numBtn7;
	private JButton numBtn8;
	private JButton numBtn9;
	private JButton numBtn0;
	private JButton operBtnPlus;
	private JButton operBtnMinus;
	private JButton operBtnMulti;
	private JButton opeBtnDiv;
	private JButton delBtn;
	private JButton operBtnEqual;
	
	public static JTextField display;
	
	private JLabel desciption;

	public GUI()
	{
		// construct components
		numBtn1 = new JButton("1");
		numBtn2 = new JButton("2");
		numBtn3 = new JButton("3");
		numBtn4 = new JButton("4");
		numBtn5 = new JButton("5");
		numBtn6 = new JButton("6");
		numBtn7 = new JButton("7");
		numBtn8 = new JButton("8");
		numBtn9 = new JButton("9");
		numBtn0 = new JButton("0");
		
		operBtnPlus = new JButton("+");
		operBtnMinus = new JButton("-");
		operBtnMulti = new JButton("*");
		opeBtnDiv = new JButton("/");
		operBtnEqual = new JButton("=");
		
		delBtn = new JButton("Delete");
		
		
		display = new JTextField(1);
		desciption = new JLabel("Simple Java Calculator");

		
	
		delBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				display.setText("");

			}
		});
		
		
		
		operBtnEqual.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Main.Equal();

			}
		});
		operBtnPlus.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Main.setOperation(Operation.plus);

			}
		});
		operBtnMinus.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Main.setOperation(Operation.minus);

			}
		});
		operBtnMulti.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Main.setOperation(Operation.multi);

			}
		});
		opeBtnDiv.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Main.setOperation(Operation.div);

			}
		});
		
		
		numBtn1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Main.SetNum(1);

			}
		});
		numBtn2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Main.SetNum(2);

			}
		});
		numBtn3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Main.SetNum(3);	

			}
		});
		numBtn4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Main.SetNum(4);

			}
		});
		numBtn5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Main.SetNum(5);

			}
		});
		numBtn6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Main.SetNum(6);

			}
		});
		numBtn7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Main.SetNum(7);

			}
		});
		numBtn8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Main.SetNum(8);

			}
		});
		numBtn9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Main.SetNum(9);

			}
		});
		numBtn0.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Main.SetNum(0);

			}
		});
		
		
		
		// adjust size and set layout
		setPreferredSize(new Dimension(314, 476));
		setLayout(null);

		// add components
		add(numBtn1);
		add(numBtn2);
		add(numBtn3);
		add(numBtn4);
		add(numBtn5);
		add(numBtn6);
		add(numBtn7);
		add(numBtn8);
		add(numBtn9);
		add(display);
		add(desciption);
		add(numBtn0);
		add(operBtnPlus);
		add(operBtnMinus);
		add(operBtnMulti);
		add(opeBtnDiv);
		add(delBtn);
		add(operBtnEqual);

		// set component bounds (only needed by Absolute Positioning)
		numBtn1.setBounds(10, 165, 65, 65);
		numBtn2.setBounds(80, 165, 65, 65);
		numBtn3.setBounds(150, 165, 65, 65);
		numBtn4.setBounds(10, 235, 65, 65);
		numBtn5.setBounds(80, 235, 65, 65);
		numBtn6.setBounds(150, 235, 65, 65);
		numBtn7.setBounds(10, 305, 65, 65);
		numBtn8.setBounds(80, 305, 65, 65);
		numBtn9.setBounds(150, 305, 65, 65);
		display.setBounds(10, 75, 290, 75);
		desciption.setBounds(170, 5, 130, 30);
		numBtn0.setBounds(80, 375, 65, 65);
		operBtnPlus.setBounds(230, 165, 65, 65);
		operBtnMinus.setBounds(230, 235, 65, 65);
		operBtnMulti.setBounds(230, 305, 65, 65);
		opeBtnDiv.setBounds(230, 375, 65, 65);
		delBtn.setBounds(10, 10, 150, 60);
		operBtnEqual.setBounds(165, 40, 135, 30);
	}
}
