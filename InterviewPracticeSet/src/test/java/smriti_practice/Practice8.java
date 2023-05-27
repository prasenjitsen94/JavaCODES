package smriti_practice;

public class Practice8 {
	int no_of_hand;
	int no_of_eyes;
	static int no_of_nose=1;
	int no_of_finger;
	String  hair_color;
	
	static
	{
		System.out.println("I am inside static ");
	}
	
	public Practice8(int hand, int eyes, int finger, String hair_color )
	{
		no_of_hand=hand;
		no_of_eyes=eyes;
		no_of_finger=finger;
		this.hair_color= hair_color;
	}
	
	public static void main(String[] args) {
		Practice8 obj=new Practice8(2,2,10,"brown");
		
		System.out.println(obj.no_of_finger);
		System.out.println(obj.no_of_hand);
		//System.out.println(no_of_nose);
		obj.eyes();
		//nose();
		obj.haircolor();
		Practice8 obj1= new Practice8(2,2,11,"Black");
		
		System.out.println("obj1 : " + obj1.no_of_finger);
		System.out.println("obj1 : " + obj1.no_of_hand);
		//System.out.println(no_of_nose);
		obj1.eyes();
		//nose();
		obj1.haircolor();
		
		
		
	}
	
	public   void eyes()
	{
		System.out.println("Eyes: " + no_of_eyes);
	}
	
	public static  void nose()
	{
		System.out.println("Nose: " + no_of_nose);
	}
	
	public  void haircolor()
	{
		System.out.println("Hair Color: " + hair_color);
	}
	

}
