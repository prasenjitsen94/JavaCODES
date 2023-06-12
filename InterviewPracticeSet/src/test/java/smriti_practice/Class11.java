package smriti_practice;
import java.util.Scanner;
public class Class11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a line: ");
		String line=sc.nextLine();
		String str1="";
		char ch_change;
		
		for(int i=0; i<line.length(); i++)
		{
			char ch= line.charAt(i);
			if(Character.isUpperCase(ch))
			{
				ch_change= Character.toLowerCase(ch);
				str1= str1+ ch_change;
			}
			else
			{
				ch_change=Character.toUpperCase(ch);
				str1= str1 + ch_change;
			}
		}
		
		System.out.println(str1);
		
	}

}
