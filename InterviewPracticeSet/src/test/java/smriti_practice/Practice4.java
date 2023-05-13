package smriti_practice;

public class Practice4 {

	public static void main(String[] args) {
		String str="Smriti Saha";
		 int i_index=str.indexOf('i');
		 System.out.println(i_index);
		 
		 int a=123;
		 String str1=String.valueOf(a);
		 System.out.println(str1);
		 
		 String str2="Smriti Saha";
		 String sub_text= str2.substring(7);
		 System.out.println(sub_text);
		 
		 String name="Rimi";
		 char ch[]=name.toCharArray();
		 for(int i=0; i<ch.length; i++)
		 {
			 System.out.println(ch[i]);
		 }
		 
		 String email="smritisaha19948@gmail.com";
		 String text=email.replace("smriti", "rimi");
		 System.out.println(text);
	}

}
