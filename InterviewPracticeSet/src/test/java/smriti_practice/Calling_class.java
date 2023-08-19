package smriti_practice;

public class Calling_Class {

	public static void main(String[] args) {
		Private_Class obj= new Private_Class();
		
		System.out.println("Old number" + obj.getNum());
		
		obj.setNum(20);
		
		System.out.println("New number" + obj.getNum());
		
	}

}
