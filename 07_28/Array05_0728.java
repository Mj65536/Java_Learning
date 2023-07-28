import java.util.Scanner;

public class Array05_0728
{
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        String day[] = {"Monday Left Me Broken","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.print("请输入数字:");
        int opt = Input.nextInt();
        if(opt>=1 && opt<=7)
        {
            System.out.println(day[opt-1]);
        }
        else
        {
            System.out.print("请重新输入数字:");
        }
    }
    //又是一个无聊的映射
}
