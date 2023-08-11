public class GeometricTest_0811
{
    public static void main(String[] args)
    {

        GeometricTest_0811 g1 = new GeometricTest_0811();


        Circle_0811 c1 = new Circle_0811("green",1.0,4.0);
        g1.displayArea(c1);

        MyRectangle_0811 r1 = new MyRectangle_0811("green",1.0,3.14,16);


        System.out.println(g1.equalsArea(c1, r1));


    }
    public boolean equalsArea(GeometricObject_0811 g1,GeometricObject_0811 g2)
    {
        return g1.findArea() == g2.findArea();
    }

    public void displayArea(GeometricObject_0811 g)
    {
        System.out.println("area="+g.findArea());
    }
}
