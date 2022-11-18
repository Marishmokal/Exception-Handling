package pro.wings.exception;

public class Demo6 {
	public static void main(String[] args)throws InterruptedException {
//		try {
	stuff();
//		}
//		catch(InterruptedException e)
//		{
//			System.out.println("something");
//		}
	}

	private static void stuff()throws InterruptedException {
		dostuff();

	}

	private static void dostuff()throws InterruptedException {
		doMoreStuff();

	}

	private static void doMoreStuff()throws InterruptedException {
//		try {
		Thread.sleep(5000);
//		}catch(InterruptedException e)
//		{
//			System.out.println("something");
//		}
	}
}
