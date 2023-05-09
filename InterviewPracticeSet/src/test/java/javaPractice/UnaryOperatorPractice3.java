package javaPractice;

public class UnaryOperatorPractice3 {

	public static void main(String[] args) {
		int x =3;
		x= ++x + ++x + x++ + ++x + x++;
		//4+5+5+7+7
		System.out.println(x);//28

	}

}
