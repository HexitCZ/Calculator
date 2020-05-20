package Core;

import javax.swing.JFrame;

import UI.GUI;

public class Main
{
	public static String firstNum = "";
	public static String secondNum = "";

	public enum Operation
	{
		plus, minus, multi, div, nul
	}

	public static Operation operation = Operation.nul;

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new GUI());
		frame.pack();
		frame.setVisible(true);

	}

	public static void SetNum(int num)
	{
		if (operation == Operation.nul)
		{
			setFirst(num);
			UI.GUI.display.setText(firstNum);
		} else if (operation != Operation.nul)
		{
			setSecond(num);
		}

	}

	private static void setFirst(int num)
	{
		firstNum += Integer.toString(num);
		System.out.println(firstNum);
		Draw();
	}

	private static void setSecond(int num)
	{
		secondNum += Integer.toString(num);
		Draw();
	}

	public static void setOperation(Operation op)
	{
		operation = op;
		Draw();
	}

	public static void Equal()
	{

		switch (operation)
		{
		case plus:
			Draw(Operations.Plus(Integer.parseInt(firstNum), Integer.parseInt(secondNum)));
			break;
		case minus:
			Draw(Operations.Minus(Integer.parseInt(firstNum), Integer.parseInt(secondNum)));
			break;
		case multi:
			Draw(Operations.Multi(Integer.parseInt(firstNum), Integer.parseInt(secondNum)));
			break;
		case div:
			Draw(Operations.Division(Integer.parseInt(firstNum), Integer.parseInt(secondNum)));
			break;
		}

		operation = Operation.nul;
		firstNum = "";
		secondNum = "";
	}

	public static void Draw()
	{
		UI.GUI.display.setText(firstNum + " " + operation.toString() + " " + secondNum);
	}

	public static void Draw(int result)
	{
		UI.GUI.display.setText(Integer.toString(result));
	}

}
