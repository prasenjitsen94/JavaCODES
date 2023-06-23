package interviewPracticeSet;

public class StringEquals
{
	public static void main(String[] args)
	{
		String str1 = "obj";
		String str2 = "obj";
		if(str1==str2)
			System.out.println(str1+" and "+str2+" are Same objects");
		else 
			System.out.println(str1+" and "+str2+" are Different objects");
		System.out.println("-----------------------------------------------------");

		String str3 = new String("Object1");
		String str4= new String("Object1");
		
		if(str3==str4)
			System.out.println(str3+" and "+str4+" are Same objects");
		else 
			System.out.println(str3+" and "+str4+" are Different objects");
		System.out.println("-----------------------------------------------------");
		
		String str5= new String("xyz");
		String str6= "xyz";
		
		if(str3==str4)
			System.out.println(str5+" and "+str6+" are Same objects");
		else 
			System.out.println(str5+" and "+str6+" are Different objects");		
	}
}
