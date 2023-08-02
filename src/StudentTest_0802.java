public class StudentTest_0802
{
    public static void main(String[] args)
    {
        Student_0802[] students = new Student_0802[20];

        for (int i = 0; i < students.length; i++)
        {
            students[i] = new Student_0802();
            students[i].number = i+1;
            students[i].grade = (int)(Math.random()*6 + 1);
            students[i].score = (int)(Math.random()*101);
        }

        for(int j=0;j<students.length;j++)
        {
            if(students[j].grade == 3)
            {
                Student_0802 stu = students[j];
                System.out.println(stu.showInfo());
            }
        }

        for(int k=0;k<students.length;k++)
        {
            for(int l=0;l< students.length-1-k;l++)
            {
                if(students[k].score>students[k+1].score)
                {
                    Student_0802 temp = students[k];
                    students[k] = students[k+1];
                }
            }

            for(int i=0;i< students.length;i++)
            {
                System.out.println(students[i].showInfo());
            }
        }

    }

}
