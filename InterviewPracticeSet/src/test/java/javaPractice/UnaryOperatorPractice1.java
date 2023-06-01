package javaPractice;

public class UnaryOperatorPractice1 {

	public static void main(String[] args) {
		int x =15;
		System.out.println(x++ +x++ + ++x +1 +x++);
		//x++ = 15[16]
		//x++ = 16[17]
		//++x = 17+1 =18
		//+1 = 1
		//x++ = 18[19]
		//15+16+18+1+18 = 68[Answer]

	}

}
