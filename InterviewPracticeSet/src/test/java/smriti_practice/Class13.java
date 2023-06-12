package smriti_practice;
import java.util.Scanner;
public class Class13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String line=sc.nextLine();
		
		String number="";
		String sep_char="";
		String alpha="";
		
		for(int i=0; i<line.length(); i++)
		{
			char ch=line.charAt(i);
			if(Character.isDigit(ch))
			{
				number=number+ch;
			}
			else if(Character.isLetter(ch))
			{
				alpha= alpha+ ch;
			}
			else
			{
				sep_char= sep_char +  ch;
			}
		}
		
		System.out.println("Numbers: " + number);
		System.out.println("Alphabets: " + alpha);
		System.out.println("Special character: " + sep_char);
			
		

	}

}
