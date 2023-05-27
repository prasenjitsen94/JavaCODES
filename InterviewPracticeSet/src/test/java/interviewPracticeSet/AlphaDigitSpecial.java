package interviewPracticeSet;

public class AlphaDigitSpecial {

	public static void main(String[] args) {
		String str="I Love !nd!@ @ 2023";
		String alpha="";
		String dig="";
		String spc="";
		for(int i = 0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
				dig=dig+str.charAt(i)+" ";
			else if(Character.isAlphabetic(str.charAt(i)))
				alpha=alpha+str.charAt(i)+" ";
			else
				spc=spc+str.charAt(i)+" ";	
		}
		System.out.println("Special Character : "+spc);
		System.out.println("Alphabets : "+alpha);
		System.out.println("Digits : "+dig);
				

	}

}
