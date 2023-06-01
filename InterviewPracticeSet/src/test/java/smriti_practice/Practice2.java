package smriti_practice;

public class Practice2 extends Practice1 {
	int no_of_cycle;
	int no_of_childhouse;
	int no_of_car;

	public Practice2(int cars, int houses, int cycle, int childhouse, int bike )
	{
		super(cars,houses,bike);
		no_of_cycle=cycle;
		no_of_childhouse=childhouse;
		no_of_car=5;
	}


	public static void main(String[] args) {
		//System.out.println("I am child class");
		Practice2 obj=new Practice2(3,4,2,1,7);
//		System.out.println(obj.no_of_car);
//		System.out.println(obj.no_of_cycle);
//		System.out.println(obj.no_of_childhouse);
//		obj.run();//
//		obj.callParent();
//		System.out.println(obj.no_of_car);
		
		//obj.talk();
//		int x=15;
//		System.out.println(x++ + x++ + ++x + 1 + x++);
//		
//		int y=3;
//		System.out.println(++y + ++y + y++ + ++y + y++);
		
		System.out.println('a'+"Regrow"+1+7+3);
		System.out.println('a'+ 'b' + "Regrow"+1+7+3);
		System.out.println('a'+ 'b' + "Regrow"+1+7+(3+1));
		System.out.println('a'+1+ "Regrow"+1+7+3+'A');
		System.out.println('a'+"Regrow"+1+7+(3+'a'));

		

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
	
	public void talk()
	{
		System.out.println(super.no_of_bike);
		super.talk();
		System.out.println("child talks fluent");
	}

}
