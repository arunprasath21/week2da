  package week2.Day1.assignment;

public class FindTypes {

	public static void main(String[] args) {
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char[] tes = test.toCharArray();
	
		for (int i=0;i<tes.length;i++) {
			
			if (Character.isLetter(tes[i])) {
				letter++;
			}
			else if (Character.isDigit(tes[i])) {
				num++;
			}
			else if (Character.isSpaceChar(tes[i])) {
				space++;
			}
			else {
				specialChar++;
			}
		}
   
		System.out.println("Letter: " + letter);
		System.out.println("Space: " + space);
		System.out.println("Number: " + num);
		System.out.println("SpecialCharcter: " + specialChar);
	}
}