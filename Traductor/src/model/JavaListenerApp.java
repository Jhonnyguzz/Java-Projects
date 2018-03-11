package model;

import org.antlr.v4.runtime.tree.*;

import java.util.*;

public class JavaListenerApp extends JavaBaseListener
{
	String printRule = "";
	int var = 0;

	List<ParseTree> l = new ArrayList<>();

	@Override 
	public void enterExpression(JavaParser.ExpressionContext ctx) 
	{ 

		l = ctx.children;

		/*
		for(ParseTree x:l)
		{
			System.out.println(x.getText());
			if(x.getText().equals("System.out.println"))
			{
				printRule = "print";
			}
			if(x.getText().equals("("))
			{
				var = 1;
			}
			if(var==1)
			{
				printRule += " "+x.getText();
				var = 0;
			}
		}		*/

		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).getText());
			if(l.get(i).getText().equals("System.out.println"))
			{
				printRule = "print";
			}
			if(l.get(i).getText().equals("("))
			{
				var = 1;
			}
			if(var==1)
			{
				printRule += " "+l.get(i+1).getText();
				var = 0;
			}
		}

		/*
		String s1 = ctx.getStop().getText();

		l=ctx.getTokens(10);

		System.out.println(l);

		for(TerminalNode x:l)
		{
			System.out.println(x.getSymbol().getText());
		}
		/*if (ctx.literal())
		{
			String s2 = ctx.literal().getText();
			System.out.println(s2);
		}

		printRule += s1;

		
		if(s1.equals("System") || s1.equals("out") || s1.equals("println"))
		{
			printRule = "print"; 
		}
		else
		{
			printRule = s1;
		}*/
	}

	@Override 
	public void exitExpression(JavaParser.ExpressionContext ctx) 
	{ 
		//String s1 = ctx.getStop().getText();
		//printRule += s1;
		JavaMainApp.traducir(printRule);
		//printRule = "";
	}
	
	@Override
	public void exitCompilationUnit(JavaParser.CompilationUnitContext ctx)
	{
		//printRule +="\n"+ "raw_input(\"Presione una tecla para continuar\")";
		//JavaMainApp.traducir(printRule);
	}
	
}