package smriti_practice;

public class Practice5 {

	public static void main(String[] args) {
		String name="Smriti Saha";
		String word[]=name.split(" ");
		
		for(int i=0; i<(word.length-1); i++)
		{
				System.out.print(word[i].charAt(0) + ".");
		}
			System.out.println(word[word.length-1]);
	}

}
