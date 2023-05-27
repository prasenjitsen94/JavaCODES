package interviewPracticeSet;

public class CountWordsInString {

	public static void main(String[] args) {
	String str ="I  Love India             India is Great India is Love";
	str= str.trim().replaceAll("\\s+", " ");
	String word[]= str.split(" ");
	System.out.println("Number of words : "+word.length);
	

	}

}
