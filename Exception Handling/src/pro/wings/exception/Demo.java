package pro.wings.exception;

public class Demo {
public static void main(String[] args) {
	int i=10;
	int j=20;
	int k=10;
	int result;
	
	try {
	System.out.println(10/0);
	}
	catch(ArithmeticException e)
	{
		System.out.println("exception occured");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		
	}
}
}
