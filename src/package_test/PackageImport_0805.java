package package_test;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;
import java.lang.reflect.Field;
import java.util.*;
//*代表导入util包下的全部类,只作用一层,子包里面的不包括

import static java.lang.System.out;
public class PackageImport_0805
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList list = new ArrayList();

        HashMap map = new HashMap();

        HashSet set = new HashSet();

        out.println("Hello");

        String str = "hello";
        out.println(str);

        Person p = new Person();

        Field field = null;

        java.sql.Date date01 = new java.sql.Date(122223456L);
        //使用全类名的方式

        out.println("hello");


    }


}
