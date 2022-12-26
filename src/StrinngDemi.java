
public class StrinngDemi {
	
	public static void main(String[] args) {
		
		String str1 ="Hello";
		String str2 ="Java";
		StringBuffer bf = new StringBuffer(str1);
		StringBuffer str3 = bf.append(str2);
		System.out.println(str3);
	}

}
