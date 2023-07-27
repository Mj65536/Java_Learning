import java.util.Scanner;
class ScannerTest
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Input name:");
		String name = scan.nextLine();

		System.out.println("Input age:");
		int age = scan.nextInt();
		
		System.out.println("Input weight:");
		double weight = scan.nextDouble();
		
		System.out.println("Input statics");
		boolean n = scan.nextBoolean();

		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("weight="+weight);
		System.out.println("n="+n);
		
		scan.close();
	}


}