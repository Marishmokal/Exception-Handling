package pro.wings.exception;

public class Demo3 {
	public static void main(String[] args) {
		System.out.println("main method started");

		int[] x = { 10, 12, 14 };
		int res = 0;

		try {
			res = 10 / 1;
			System.exit(0);
		} catch (ArithmeticException e) {
			System.out.println("arithmetic exception occured");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array exception handle");
		} catch (Exception e) {
			System.out.println("handle by exception");
		} finally {
			System.out.println("finally executed");
		}
		System.out.println("main method ended");
	}
}
