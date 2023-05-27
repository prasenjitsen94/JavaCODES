package interviewPracticeSet;
/*
 * WAP to change the case of the alphabet characters in a sentence using Character classs
 */
public class LowerUpper {

	public static void main(String[] args) {
		String str ="I Love India. INDIA is Gre@t";
		String nstr ="";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
				nstr= nstr+ Character.toLowerCase(str.charAt(i));
			else if(Character.isLowerCase(str.charAt(i)))
				nstr= nstr+ Character.toUpperCase(str.charAt(i));
			else 
				nstr= nstr+ str.charAt(i);
		}
		System.out.println("The new string is :\n"+nstr);
	}

}
