import java.util.Scanner;
class IsPrime
{
	public static void main(String[] args)
	{
		Scanner Input = new Scanner(System.in);

		System.out.print("Input:");
		int a = Input.nextInt();
		
		if(a==2 || a==3)
		{
			System.out.println("Yes");
		}
		else
		{
			Boolean Flag = true;	
			for(int i = 2;i <= Math.sqrt(a);i++)
			{
				if(a%i==0)
				{
					Flag=false;
					System.out.println("No");
					break;
				}
			}
			if(Flag)
			{
				System.out.println("Yes");
			}
		}
	}
}