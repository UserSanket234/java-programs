package strings;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="programming";
        int vowel=0;
        int consonent=0;
        for (int i=0; i<str.length();i++ ) {
        	char ch= Character.toLowerCase(str.charAt(i));
        	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
        		vowel++;
        	}
        	else {
        		consonent++;
        	}
        }
        System.out.println("No Of Vowels:"+vowel);
        System.out.println("No Of Consonent:"+consonent);

	}

}
