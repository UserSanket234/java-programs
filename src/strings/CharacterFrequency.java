package strings;

public class CharacterFrequency {

	public static void main(String[] args) {

	String str = "programming";

	for (int i = 0; i < str.length(); i++) {

	            char ch = str.charAt(i);
				int count = 0;
				boolean found = false;

				for (int j = 0; j < i; j++) {
				    if (ch == str.charAt(j)) {
				        found = true;
				        break;
				    }
				}
				if(found) {
					continue;
				}

				
				// Count frequency
				for (int j = 0; j < str.length(); j++) {
					if (ch == str.charAt(j)) {
						count++;
					}
				}

				System.out.println(ch + " = " + count);
			}
		}
	}


