import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		int n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of count");
		long count = sc.nextInt();
		for ( int i = 0; i < count; i++) 
		{
			 n3 = n1+n2;
			 n1=n2;
			 n2=n3;
			 System.err.println(" "+n3);
		}
		}
}