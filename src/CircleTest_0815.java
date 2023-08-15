public class CircleTest_0815
{
    public static void main(String[] args)
    {
        Circle_0815 c1 = new Circle_0815();


    }
}
    class Circle_0815
    {
        private double radius;
        private int id;
        static int total;

        public Circle_0815()
        {
            this.id = init;
            init++;
        }

        private int init = 1001;

        @Override
        public String   toString() {
            return "Circle_0815{" +
                    "radius=" + radius +
                    ", id=" + id +
                    '}';
        }
    }
