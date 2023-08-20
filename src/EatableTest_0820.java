public class EatableTest_0820
{
    public static void main(String[] args)
    {
        Eatable_0820[] eatable0820s = new Eatable_0820[3];

        eatable0820s[0] = new Chinese_0820();
        eatable0820s[1] = new American_0820();
        eatable0820s[2] = new Indian_0820();

        for(int i = 1;i < eatable0820s.length;i++)
        {
            eatable0820s[i].eat();
        }

    }

}
