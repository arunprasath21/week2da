package week2.Day1.assignment;

public class ReverseEvenNumbers {

	public static void main(String[] args) {
		
		String test = "I am a software tester";  
		 String revstr = "";
		 String temp= "";
		 String[] split = test.split(" ");
		
		 for (int i=0;i<split.length;i++) {
		
			if(i%2==1) {
				
				char[] chartest = split[i].toCharArray();
				
				for (int j=chartest.length-1;j>=0;j--) {
								
					revstr = revstr + chartest[j];
				}
					temp=temp + revstr + "  ";
				}
			
			else { 
					temp = temp + split[i] +"  ";
				} 
		}	
				System.out.println(temp);
		
	}
}