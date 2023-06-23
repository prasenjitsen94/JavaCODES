package smriti_practice;

import java.util.Scanner;

public class Class16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String word=sc.nextLine();
		
		String reverese=palindrome(word);
		
		boolean res=check(word,reverese);
		
		if(res)
		{
			System.out.println("Plaindrome");
		}
		else
		{
			System.out.println("Not a plaindrome");
		}
		
		
		
	}
	
	public static String  palindrome(String str)
	{
		str=str.trim().toLowerCase().replaceAll("\\s+"," ");
		String rev="";
		
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			rev=ch+rev;
		}
		
		return rev;
	}
	
	public static boolean check(String str,String rev)
	{
		boolean result;
		if(rev.equals(str))
		{
			result =true;
		}
		else
		{
			result= false;
		}
		
		return result;
	}

}
