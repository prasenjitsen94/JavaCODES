package smriti_practice;

public class Practice2 extends Practice1 {
	int no_of_cycle;
	int no_of_house;
	int no_of_car;

	Practice2()
	{
		no_of_cycle=1;
		no_of_house=3;
		no_of_car= 1;
	}


	public static void main(String[] args) {
		System.out.println("I am child class");
		Practice2 obj=new Practice2();
		System.out.println(obj.no_of_car);
		System.out.println(obj.no_of_cycle);
		System.out.println(obj.no_of_house);
		obj.run();
		obj.callParent();
		System.out.println(obj.no_of_car);

	}

	public void callParent()
	{
		super.run();
		System.out.println(super.no_of_house);

	}

	public void run()
	{
		System.out.println("Child runs fast");
	}

}
