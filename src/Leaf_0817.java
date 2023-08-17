class Root
{
    static
    {
        System.out.println("Root的静态初始化块");
    }

    {
        System.out.println("Root的普通初始化块");
    }

    public Root()
    {
        System.out.println("Root的无参数构造器");
    }
}

class Mid extends Root
{
    static
    {
        System.out.println("Mid的静态初始化代码块");
    }

    {
        System.out.println("Mid的普通初始化代码块");
    }

    public Mid()
    {
        System.out.println("Mid的无参数构造器");
    }

}


class Leaf extends Mid
{
    static
    {
        System.out.println("Leaf的静态初始化代码块");
    }

    {
        System.out.println("Leaf的普通初始化代码块");
    }

    public Leaf()
    {
        System.out.println("Leaf的无参数构造器");
    }
}