public class Circle_0811 extends GeometricObject_0811
{
    private double radius;

    public Circle_0811(String color, double weight, double radius)
    {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double findArea()
    {
        return 3.14*radius*radius;
    }



}
