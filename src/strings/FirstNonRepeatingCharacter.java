package strings;

public class FirstNonRepeatingCharacter {
	
	        public static void main(String[] args) {
				String str="programming";
				
				
				for(int i=0;i<str.length();i++) {
					char ch = str.charAt(i);
					boolean found=false;
					
				
				for(int j=0;j<i;j++) {
				
					char ch2=str.charAt(j);
					if(ch==ch2) {
						found=true;
					}
				}
				if(!found) {
					System.out.println(ch+"is first non repeating character");
					break;
				}
			
				
			}
	        }
	}


