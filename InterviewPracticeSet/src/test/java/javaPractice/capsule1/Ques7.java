package javaPractice.capsule1;

public class Ques7 
{
	public static void main(String args[])
	{
		System.out.println("Regrow"+1+2);//Regrow12
		
		System.out.println(1+2+"Regrow");//3Regrow
		
		System.out.println(1+2+"Regrow"+1+2);//3Regrow12
		
		System.out.println("Regrow"+1+2+"Tech");//Regrow12Tech
		
		System.out.println("Regrow"+(1+2)+"Tech");//Regrow3Tech
		
		System.out.println(1+2+"Regrow"+1+2+"Tech");//3Regrow12Tech
		
		System.out.println("*********************************************************");
		
		System.out.println('a'+"Regrow"+1+7+3);//aRegrow173
		
		System.out.println('a'+'b'+"Regrow"+1+7+3);//97+98+Regrow+1+7+3 = 195Regrow173
		
		System.out.println('a'+'b'+"Regrow"+1+7+(3+1));//97+98+Regrow+1+7+4 = 195Regrow174
		
		System.out.println('a'+1+"Regrow"+1+7+3);//97+1+Regrow+1+7+3 = 98Regrow173
		
		System.out.println('a'+'b'+"Regrow"+1+7+3+'A');//97+98+Regrow+1+7+3+A = 195Regrow173A
		
		System.out.println('a'+"Regrow"+1+7+(3+'a'));//a+Regrow+1+7+100 = aRegrow17100
		
		System.out.println('a'+'b');//97+98 =195
		System.out.println('a');//a
		System.out.println((int)'Z');
		

	}
}
