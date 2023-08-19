package package1;

public class NonSubClass {
	
	public static int n1=10;
	private static int n2=20;
	static int n3=30;
	protected static int n4=40;
	
	public static void main(String[] args) {
		//ParentClass obj1 = new ParentClass();
		
		System.out.println("Public: " + ParentClass.n1);
	//	System.out.println("Private: " +ParentClass. n2);
		System.out.println("Default: " +ParentClass. n3);
		System.out.println("Proctected: " + ParentClass.n4);
		
		
	}

}
