package pro.wings.exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo2 {
public static void main(String[] args)
{
	try {
System.out.println(10/0);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
		System.out.println(e.toString());
		System.out.println(e.getMessage());
	e.printStackTrace();
		
	}
}
}
