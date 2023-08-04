public class PassObject_0804
{
    public static void main(String[] args)
    {
        PassObject_0804 obj = new PassObject_0804();
        Circle_0804 c1 = new Circle_0804();
        obj.printArea(c1,5);

    }

    public void printArea(Circle_0804 c,int time)
    {
        System.out.println("Radius\t\tArea");
        for (int i = 1; i <= time; i++)
        {
            c.radius = i;
            System.out.println(c.radius+"\t\t"+c.getArea());
            
        }
    }
}