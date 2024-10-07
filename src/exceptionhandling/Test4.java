package exceptionhandling;

public class Test4 {
	public static void main(String[] args) {

		String s = "rarr";
		if (s.endsWith("r")) {
			try {
				throw new ArithmeticException();
			} catch (ArithmeticException ae) {
				System.out.println("name should not end with r");
			}
		}
	}
}
