public class TriangleTest_0806
{
    public static void main(String[] args)
    {
        Triangle_0806 t01 = new Triangle_0806();
        //已经有空参的构造器了，可以括号为空

        t01.setBase(1.5);
        t01.setHeight(4.0);

        System.out.println(t01.getArea());

        Triangle_0806 t02 = new Triangle_0806(4.5,6.0);
        System.out.println(t02.getArea());
        
    }


}
