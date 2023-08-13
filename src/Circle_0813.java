public class Circle_0813 extends Geometric_0813
{
    private double radius;

    public Circle_0813()
    {
        color = "white";
        weight = 1.0;
        radius = 1.0;

    }

    public Circle_0813(double radius)
    {
        color = "white";
        weight = 1.0;
        this.radius = radius;
    }

    public Circle_0813(String color, double weight, double radius)
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

    public double findArea()
    {
        return 3.14*radius*radius;
    }

    public boolean equals(Object obj)
    {
        if(this == obj)
        {
            return true;
        }

        if(obj instanceof Circle_0813)
        {
            Circle_0813 c = (Circle_0813) obj;
            return this.radius == c.radius;
        }
        return false;
    }

    public String toString()
    {
        return "Circle[radius="+radius+"]";
    }

}
