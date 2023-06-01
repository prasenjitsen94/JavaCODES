package smriti_practice;

public class Calling_Class {

	public static void main(String[] args) {
		Private_Class obj=new Private_Class();
		
		System.out.println("Old Value : " + obj.getNum());
		
		obj.setNum(40);
		
		System.out.println("New Value: " + obj.getNum());
	}

}
