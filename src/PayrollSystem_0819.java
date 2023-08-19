import java.util.Scanner;

public class PayrollSystem_0819
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Employee_0819[] emps = new Employee_0819[2];
        emps[0] = new SalariedEmployee_0819("Jake",12,
                new MyDate_0819(1997,12,3),6777);
        emps[1] = new HourlyEmployee_0819("Tom",45,
                new MyDate_0819(2003,5,8),60,7);

        System.out.println("Input month");
        int month = scan.nextInt();
        for(int i = 0;i < emps.length;i++)
        {
            System.out.println(emps[i].toString());
            if(month == emps[i].getBirthday().getMonth())
            {
                System.out.println("Happy Birthday");
            }
        }


    }



}
