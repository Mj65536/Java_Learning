public class MyRectangle_0811 extends GeometricObject_0811
{
    private double width;
    private double height;

    public MyRectangle_0811(String color, double weight, double width, double height)
    {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    @Override
    public double findArea()
    {
        return weight*height;
    }


}
