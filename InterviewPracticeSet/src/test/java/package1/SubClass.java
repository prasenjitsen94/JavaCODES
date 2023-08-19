package package1;

public class SubClass extends ParentClass {

	public static void main(String[] args) {
		SubClass obj= new SubClass();
		
		System.out.println("Public: " + obj.n1);
	//	System.out.println("Private: " + obj.n2);
		System.out.println("Default: " + obj.n3);
		System.out.println("Proctected: " + obj.n4);
	}

}
