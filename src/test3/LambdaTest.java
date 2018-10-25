package test3;

import com.sun.corba.se.impl.orbutil.ObjectStreamClass_1_3_1;
import test2.question1.staff.*;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaTest
{
    public static void main(String[] args)
    {
        Staff[] staff = new Staff[5];

        System.out.println("初始化staff");
        for (int i = 0; i < staff.length; i++)
        {
            staff[i] = Staff.randomStaff();
            staff[i].setName("张三" + i);
        }
        printAll(staff);

        System.out.println("sort by age");
        Arrays.sort(staff, (o1, o2) -> (o1.getAge() - o2.getAge()));
//        Arrays.sort(staff, Comparator.comparing(Staff::getAge));
        printAll(staff);

        System.out.println("sort by name");
        Arrays.sort(staff, (o1, o2) -> o1.getName().compareTo(o2.getName()));
//        Arrays.sort(staff, Comparator.comparing(Staff::getName));
        printAll(staff);

        System.out.println("sort by complex");
        Arrays.sort(staff, (o1, o2) ->
        {
            if (Integer.compare(o1.getAge(), o2.getAge()) > 0)
            {
                return 1;
            } else if (Integer.compare(o1.getAge(), o2.getAge()) < 0)
            {
                return -1;
            } else
            {
                return -o1.getName().compareTo(o2.getName());
            }
        });
        printAll(staff);

    }

    public static void printAll(Staff[] staff)
    {
        for (Staff x : staff)
        {
            System.out.println(x);
        }
    }
}
