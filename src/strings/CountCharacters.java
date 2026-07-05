package strings;


	public class CountCharacters {

	    public static void main(String[] args) {

	        String str = "Java 17@";

	        int upper = 0;
	        int lower = 0;
	        int digits = 0;
	        int spaces = 0;
	        int special = 0;

	        for (int i = 0; i < str.length(); i++) {

	            char ch = str.charAt(i);

	            if (Character.isUpperCase(ch)) {
	                upper++;
	            }
	            else if (Character.isLowerCase(ch)) {
	                lower++;
	            }
	            else if (Character.isDigit(ch)) {
	                digits++;
	            }
	            else if (Character.isWhitespace(ch)) {
	                spaces++;
	            }
	            else {
	                special++;
	            }
	        }

	        System.out.println("Uppercase : " + upper);
	        System.out.println("Lowercase : " + lower);
	        System.out.println("Digits    : " + digits);
	        System.out.println("Spaces    : " + spaces);
	        System.out.println("Special   : " + special);
	    }
	}


