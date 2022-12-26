import java.util.Scanner;

public class PrimeNummber {

	public static void main(String[] args) {
		
		int flag= 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find wheather its a prime or not");
		int num = sc.nextInt();
		
		for (int i = 2; i < num; i++) {
			if(num%i==0)
			{
				System.out.println("It is not a prime number");
				flag = 1;
				break;
			}
		}
			if (flag ==0)
			{
				System.out.println("Given number is prime");
			}
		
	}
	
}
