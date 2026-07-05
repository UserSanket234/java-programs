package strings;

public class RemoveDuplicates {
        public static void main(String[] args) {
			String str="programming";
			
			
			for(int i=0;i<str.length();i++) {
				char ch = str.charAt(i);
				boolean found=false;
				
			
			for(int j=0;j<i;j++) {
			
				if(ch==str.charAt(j)) {
					found=true;
					break;
				}
			}
		
			if(!found) {
				System.out.print(ch);
			}
			
		}
        }
}
