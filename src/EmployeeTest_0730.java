public class EmployeeTest_0730
{
    public static void main(String[] args)
    {
        //创建类的实例或对象
        Employee_0730 e01 = new Employee_0730();

        e01.id = 1001;
        e01.name = "x";
        e01.age = 29;
        e01.salary = 89.3;

        //输出对象属性
        System.out.println("id="+e01.id+"  name="+e01.name+"  age="+e01.age+"  salary="+ e01.salary);

        //再创建一个类的实例或对象
        Employee_0730 e02 = new Employee_0730();

        e02.id = 1002;
        e02.name = "y";
        e02.age = 39;
        e02.salary = 99;

        System.out.println("id="+e02.id+"  name="+e02.name+"  age="+e02.age+"  salary="+ e02.salary);
    }
}
