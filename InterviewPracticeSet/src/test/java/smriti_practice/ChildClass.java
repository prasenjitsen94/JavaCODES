package smriti_practice;

public class ChildClass  extends ParentClass{
	int no_of_house;
	int no_of_phone;
	
	
	public ChildClass(int chile_house, int child_phone, int car,int house)
	{
		super(car,house);
		no_of_house= chile_house;
		no_of_phone=child_phone;
		
	}

	public static void main(String[] args) {
		ChildClass obj= new ChildClass(4,7,3,5);
		
		System.out.println("no of cars:" + obj.no_of_cars);
		System.out.println("no of house:" + obj.no_of_house);
		System.out.println("no of phone:" + obj.no_of_phone);
		
		obj.callingparent();
//		obj.run();
		
	}
	
	public void callingparent()
	{
		super.run();
		System.out.println("no of parent cycle:" + super.no_of_cycle);
	}
	
	public void run()
	{
		System.out.println("i am inside child class");
	}

}
