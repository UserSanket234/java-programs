package strings;

public class Palindrome2 {
	public static void main(String[] args) {
		String str="madam";
		for (int i=0,j=str.length()-1;i<j;i++,j--) {
		    if(str.charAt(i)!=(str.charAt(j))){
		    	System.out.println("not palindrome");
		    	return;
		    }	
		}
		System.out.println("palindrome");
		
	}

}
