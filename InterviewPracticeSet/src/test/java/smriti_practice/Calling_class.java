package smriti_practice;

public class Calling_class {

	public static void main(String[] args) {
		Private_class obj= new Private_class();
		
		System.out.println("Old Value: " + obj.getNum());
		obj.setNum(30);
		System.out.println("New Value: " + obj.getNum());

	}

}
