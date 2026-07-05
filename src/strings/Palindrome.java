package strings;

public class Palindrome {
   public static void main(String[] args) {
	String str="madam";
	StringBuilder str2=new StringBuilder();
	for (int i=str.length()-1;i>=0;i--) {
		str2.append(str.charAt(i));
	}
	if(str2.toString().equals(str)) {
		System.out.println("IS PALINDROME");
	}
	else {
		System.out.println("IS NOT PALINDROME");
	}
		
}

  
}
