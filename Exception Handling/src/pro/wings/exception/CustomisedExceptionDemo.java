package pro.wings.exception;

import java.util.Scanner;

public class CustomisedExceptionDemo {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("enter your age");
	int age=s.nextInt();
	if (age<18)
	{
		throw new ToYoungException("you are not eligible for getting married");
	}
	else if(age>=18 && age<=60)
	{
		throw new ToOldException("You will get married soon");
	}
	else
		System.out.println("you are to old");
}
}
