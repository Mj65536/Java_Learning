public class ConstructorTest_0806
{
    public static void main(String[] args)
    {
        Constructor_0806 c1 = new Constructor_0806("Eleven",11,"Hawkins","magic");
        //填写括号时Ctrl+P可以开启提示

         System.out.println(c1.getInfo());

         Constructor_0806 c2 = new Constructor_0806("Tom",14,"青蛙大学");

         System.out.println(c2.getInfo());
    }
}
