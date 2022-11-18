package pro.wings.exception;

public class Demo5 {
	public static void main(String[] args) {
		int a=m1();
		System.out.println(a);
	}

	public static int m1() {
	int res=0;
		try {
			res=10/0;
			System.out.println();
				return 10;	
		} catch (Exception e) {
			System.out.println("ghjnhun");
			return 89;	
		}
		finally {
			System.out.println("en");
			return 15;
		}
	}
	

}
