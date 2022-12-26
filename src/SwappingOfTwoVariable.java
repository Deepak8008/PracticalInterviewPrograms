import java.util.Scanner;

public class SwappingOfTwoVariable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of X");
		int x= sc.nextInt();
		System.out.println("Enter the value of Y");
		int y= sc.nextInt();
		System.out.println("After Swapping :"+"X ="+x+" Y =" +y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swapping :"+"X ="+x+" Y =" +y);
	}
}
