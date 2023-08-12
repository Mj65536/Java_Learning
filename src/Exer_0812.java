public class Exer_0812
{
    public static void main(String[] args)
    {
        Exer_0812 e1 = new Exer_0812();
        e1.meeting(new Man_0812(),new Woman_0812());

    }
    public static void meeting(Person_0812 ... ps)
    {
        for(int i=0;i<ps.length;i++)
        {
            ps[i].eat();
            ps[i].toilet();
            if(ps[i] instanceof Man_0812)
            {
                Man_0812 man0812 = (Man_0812) ps[i];
                man0812.smoke();
            }

            else if(ps[i] instanceof Woman_0812)
            {
                Woman_0812 woman0812 = (Woman_0812) ps[i];
                woman0812.makeup();
            }
        }



    }

}
