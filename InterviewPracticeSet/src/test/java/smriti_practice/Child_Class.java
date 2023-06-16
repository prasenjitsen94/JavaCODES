package smriti_practice;

public class Child_Class extends Parent_class {

	public static void main(String[] args) {
		Child_Class obj= new Child_Class();
		
		obj.m1("Rimi");
//		obj.callingParent();

	}
	
//	public  void callingParent()
//	{
//		super.m1("Smriti");
//		System.out.println(super.a);
//	}
	
	public static void m1(String str)
	{
		System.out.println("I am in child class");
	}
	
	

}
