public class Triangle_0806
{
    private double base;
    private double height;

    public double getBase()
    {
        return base;
    }

    public double getHeight()
    {
        return height;
    }

    public void setBase(double b)
    {
        base = b;
    }

    public void setHeight(double h)
    {
        height = h;
    }

    public Triangle_0806()
    {

    }
    //空参的构造器

    public Triangle_0806(double b,double h)
    {
        base = b;
        height = h;
    }

    public double getArea()
    {
        return base*height*0.5;
    }


}
