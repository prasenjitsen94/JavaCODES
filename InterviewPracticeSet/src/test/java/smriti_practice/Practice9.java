package smriti_practice;
import java.util.Scanner;
public class Practice9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
		String word[]= name.split(" ");
		
		for(int i=0; i<(word.length-1); i++)
			{
				System.out.print(word[i].charAt(0) + " .");
			}
		System.out.println(word[word.length-1]);
		
		
		
	}

}
