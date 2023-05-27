package interviewPracticeSet;

public class NameInitials
{

	public static void main(String[] args) 
	{

		String name = "Mahendra Singh Dhoni";
		name= name.trim().replaceAll("\\s+", " ");
		String namebrk[] = name.split(" ");
		for(int i=0;i<namebrk.length-1;i++)
		{
			System.out.print(namebrk[i].charAt(0)+". ");
		}
		System.out.print(namebrk[namebrk.length-1]);
				

	}

}
