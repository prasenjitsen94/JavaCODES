package smriti_practice;

public class Practice6 {

	public static void main(String[] args) {
			String str="I Love India";
			String word[]=str.split(" ");
			String str1="";
			
			for(int i=0; i<word.length; i++)
			{
				String str2="";
				for(int j=0; j<word[i].length(); j++)
				{
					char ch=word[i].charAt(j);
					str2=ch+str2;
				}
				str1=str2+ " " + str1;
			}
			System.out.println(str1);
			
		
	}

}
