package smriti_practice;
import java.util.Scanner;
public class Class19 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a line : ");
		String line=sc.nextLine();
	
		//String str="  Rimi Riya   Rick  ";
		line=line.trim().replaceAll("\\s+"," ");
		System.out.println(line);
		
		int no_of_space=0;
		
		for(int i=0; i<line.length(); i++)
		{
			char ch=line.charAt(i);
			
			if(ch==' ')
			{
				no_of_space++;
			}
		}
		
		System.out.println("No of word: " +( no_of_space+1));

	}

}
