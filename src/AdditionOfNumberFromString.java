	
	public class AdditionOfNumberFromString {
		
		public static void main(String[] args) {
		
				int num = 4567;
				int rev =0;
				int sum=0;
				while(num!=0) 
				{
					rev= rev*10 + num%10;
					sum = sum+num;
					num = num/10;
				}
				System.out.println(rev);
				System.out.println(sum);
				}
		}
	
