package week2.Day1.Classroom;

public class CharOccurance {

	public static void main(String[] args){
		
		String str = "welcome to chennai";
		char search = 'e';
		int count = 0;
		for (int i=0;i<str.length();i++){
			if (str.charAt(i)==search)
			count++;
		}
			System.out.println(count);
	}
}
