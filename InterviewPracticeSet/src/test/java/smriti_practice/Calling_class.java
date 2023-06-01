package smriti_practice;

public class Calling_class {

	public static void main(String[] args) {
		Private_class obj=new Private_class();
		
		System.out.println("Old value: " + obj.getNum());
		
		obj.setNum(60);
		System.out.println("New Value : " + obj.getNum());
	}

}
