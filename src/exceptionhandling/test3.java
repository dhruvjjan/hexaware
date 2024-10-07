package exceptionhandling;

public class test3 {
	
	//calling function
		public static void main(String[] args) {
			
			test2 Test2 = new test2();
			try {
			Test2.division();
			}
			catch(ArithmeticException ae)
			{
				System.out.println("sometng is wrong in division method, check once");
			}
		}
}
