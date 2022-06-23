package week2.Day1.Classroom;

public class ReverseString {

	public static void main(String[] args) {
		String test = "feeling good";
		
			char[] rev = test.toCharArray();

			for (int i=rev.length-1; i>=0; i--) {
			
			System.out.println(rev[i]); 
			}
	}
}
