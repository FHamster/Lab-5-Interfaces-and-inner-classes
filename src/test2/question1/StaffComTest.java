package test2.question1;

import test2.question1.staff.*;

import java.util.Arrays;

public class StaffComTest
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
        Arrays.sort(staff, new AgeComparator());
        printAll(staff);

        System.out.println("sort by name");
        Arrays.sort(staff, new NameComparator());
        printAll(staff);

        System.out.println("sort by complex");
        Arrays.sort(staff, new ComplexComparator());
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
