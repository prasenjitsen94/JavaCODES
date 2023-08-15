package smriti_practice;

public class ParentClass {
	 int no_of_cars= 2;
	 int no_of_house= 3;
	 int no_of_cycle=4;
	 
	 public ParentClass(int car, int house)
	 {
		 no_of_cars= car;
		 no_of_house= house;
		 
	 }
	 
	public static void main(String[] args) {
		ParentClass obj1= new ParentClass(2,4);
		
		System.out.println("Cars:" + obj1.no_of_cars);
		System.out.println("House:" + obj1.no_of_house);
		
         
	}
	
	public void run()
	{
		System.out.println("I am inside parent class");
		System.out.println("Parent car:"+ no_of_cars);
	}

}
