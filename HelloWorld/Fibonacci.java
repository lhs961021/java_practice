
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 1;
		int c = 0;

		for(int i = 0; i < 8; i++) {
			
			c = a + b;
			
			a = b;
			
			b = c;
			
		}
		
		System.out.println(c);

	}

}
