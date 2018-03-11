package model;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class JavaMainApp
{
	/*
	public static void main(String args[]) throws IOException
	{
        ANTLRInputStream input = new ANTLRFileStream(args[0]);
        JavaLexer lexer = new JavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new JavaListenerApp(),tree);
	} 
	*/

	public static File f;

	public static void traducir(String line) {
		try {
			f = new File("toPython.py");
			FileWriter fr = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fr);
			PrintWriter out = new PrintWriter(bw);
			out.println(line);
			out.close();
			bw.close();
			fr.close();
		}

		catch (Exception e) {
			System.out.println("Error de escritura: " + e.toString());
		}
	}
}