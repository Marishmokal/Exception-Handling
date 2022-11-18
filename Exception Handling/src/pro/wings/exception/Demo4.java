package pro.wings.exception;

public class Demo4 {
public static void main(String[] args) {
	int i=10;
	int j=20;
	int result;
	System.out.println("main method started");
	try {
	result=10/1;
	System.exit(0);
//	}catch(ArithmeticException e)
//	{
//		System.out.println("Arithmetic Exception occured");
//	}
	}
	finally
	{
		System.out.println("finally executed");
	}
	System.out.println("main method ended");
}
}
