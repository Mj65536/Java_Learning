public class Cylinder_0807 extends Circle_0807
{
    private double length;
    //写完上面一行后，Alt+Insert可以快捷生成一套get和set方法
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Cylinder_0807()
    {
        length = 1;
    }


    public double findVolume()
    {
        return 3.14*getRadius()*getRadius()*getLength();
    }



}
