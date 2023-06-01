package smriti_practice;

public class Practice1 {

	int no_of_car;
	int no_of_house;
	int no_of_bike;


	public Practice1(int cars, int houses, int bike)
	{
		no_of_car=cars;
		no_of_house=houses;
		no_of_bike=bike;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("I am parent class");

	}

	public void run()
	{
		System.out.println("Father runs slow");
	}
	
	public void talk()
	{
		System.out.println("Father talks scramble");
	}

}
