public class ComparableCircle_0821 extends Circle_0821 implements CompareObject_0821
{
    public ComparableCircle_0821()
    {

    }


    public ComparableCircle_0821(double radius)
    {
        super(radius);
    }

    public int compareTo(Object o)
    {
        if(this == o)
        {
            return 0;
        }

        if(o instanceof ComparableCircle_0821)
        {
            ComparableCircle_0821 c = (ComparableCircle_0821) o;
////            return (int)(this.getRadius() - c.getRadius());
            return Double.compare(this.getRadius(),c.getRadius());
        }
        else
        {
            return 2;
        }




    }

}
