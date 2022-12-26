import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRemoveNumber {

	public static void main(String[] args) {
		
		String s1 = "Deepak8008";
		
		Pattern pattern= Pattern.compile("[0-9]");
		Matcher mat =pattern.matcher(s1);
		
		System.out.println(mat.toMatchResult());
	}
	
}
