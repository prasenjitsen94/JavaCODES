package package2;

import package1.ParentClass;

public class SubClass1  extends ParentClass{

	public static void main(String[] args) {
		SubClass1 obj2 = new SubClass1();

		System.out.println("Public: " + obj2.n1);
//		System.out.println("Private: " + obj2.n2);
//		System.out.println("Default: " + obj2.n3);
		System.out.println("Proctected: " + obj2.n4);
	}

}
