package interviewPracticeSet;

public class StringRevType1 
{

	public static void main(String[] args)
	{
		String str = "I Love India";
		str=str.trim().replaceAll("\\s+", " ");
		String words[]=str.split(" ");
		String rev="";
		for(int i=0;i<words.length;i++)
		{
			String r="";
			for(int j=0;j<words[i].length();j++)
			{
				r=words[i].charAt(j)+r;
			}
			rev=r+" "+rev;
		}
		System.out.println(rev);

	}

}
