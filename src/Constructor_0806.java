public class Constructor_0806
{
    String name;
    int age;
    String school;
    String major;

    public Constructor_0806(String n,int a)
    {
        name = n;
        age = a;
    }

    public Constructor_0806(String n,int a,String s)
    {
        name = n;
        age = a;
        school = s;
    }

    public Constructor_0806(String n,int a,String s,String m)
    {
        name = n;
        age = a;
        school = s;
        major = m;
    }

    public String getInfo()
    {
        return "name="+name+"\nage="+age+"\nschool="+school+"\nmajor="+major;
    }





}
