import java.util.Scanner;
class ForTest2
{
	public static void main(String[] args)
	{
		Scanner Input = new Scanner(System.in);

		System.out.println("Input the first num:");
		int num1 = Input.nextInt();

		System.out.println("Input the second num:");
		int num2 = Input.nextInt();

		for(int a = (num1<=num2)?num1:num2;a>=1;a--)
		{
				if(num1 % a == 0 && num2 % a ==0)
				{
						System.out.println(num1+"与"+num2+"的最大公约数为"+a);
						System.out.println(num1+"与"+num2+"的最小公倍数为"+num1*num2/a);
						break;
				}

		}



		Input.close();
	}


}