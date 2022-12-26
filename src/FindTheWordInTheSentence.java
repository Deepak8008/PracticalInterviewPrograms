import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class FindTheWordInTheSentence {

	public static void main(String[] args) {
		
//		String str = "Try try try till you reach the goal";
//		char ch = 'l';
//		int count = 0;
//		for (int i = 0; i < str.length(); i++) 
//		{
//			if(str.charAt(i)== ch)
//			count++;			
//		}
//		System.out.println(count);
//	}
//		
//		String str = "Raju bhai is on th way to delever his order";
//		char ch = 'r';
//		int count =0;
//		for (int i = 0; i < str.length(); i++) 
//		{
//			if(str.charAt(i) == ch)
//				count++;
//		}
//			System.out.println(count);
		
		
//		Pattern pattern = Pattern.compile("t");
//		
//		Matcher matccher= pattern.matcher(str);
//		
//		int count = 0;
//		
//		while(matccher.find())
//		{
//			count++;
//		}
//		System.out.println("No of character in the string " + count);

	
	String str = "ADP91766";
	
	Pattern pattern = Pattern.compile("[0-9]");
	
	Matcher mat =pattern.matcher(str);
	
	int sum= 0;
	while(mat.find())
	{
		String value =  mat.group();
		int str1 =Integer.parseInt(value);
		sum = sum+str1;
	}
	System.out.println(sum);
	}
}

