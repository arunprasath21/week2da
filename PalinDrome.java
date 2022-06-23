package week2.Day1.assignment;

public class PalinDrome {

	public static void main(String[] args) {
		String s1 = "mada";
		String revs1 = "";
		
		 int s1length = s1.length();
		
		for (int i =s1length-1 ;i>=0; i--) 
		
		{
		
			revs1=revs1+s1.charAt(i);
		}			
		
		if (s1.toLowerCase().equals(revs1.toLowerCase())) {
				
				System.out.println(s1 + " is a palinDrome");
			}
			else {
				System.out.println(s1 + " is not a palinDrome");
			
			}
	}
}