/*
package test3;

import test3.staff.Dean;
import test3.staff.SecurityGuard;
import test3.staff.Staff;
import test3.staff.Teacher;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaTest
{
    public static void main(String[] args)
    {
        Staff[] staff = randStaff();
    }

    private static Staff[] randStaff()
    {
        Staff[] staff = new Staff[30];
        int i = 0;
        for (; i < 10; i++)
        {
            staff[i] = Dean.randDean();
            staff[i].setName("张三" + i);
        }
        for (; i < 20; i++)
        {
            staff[i] = SecurityGuard.randGuard();
            staff[i].setName("张三" + i);
        }
        for (; i < 30; i++)
        {
            staff[i] = Teacher.randTeacher();
            staff[i].setName("张三" + i);
        }
        return staff;
    }

    private static void printName(Staff[] staff)
    {
        for (Staff x : staff)
        {
            System.out.println(x.getName());
        }
    }

    private static void printSalary(Staff[] staff)
    {
        for (Staff x : staff)
        {
            System.out.println(x.getSalary());
        }
    }

    private static void sortBySalary(Staff[] staff)
    {

        Arrays.sort(staff, (o1, o2) -> o1.getSalary() - o2.getSalary());
    }

    private static void sortByAge(Staff[] staff)
    {
        Arrays.sort(staff, (o1, o2) -> o1.getAge() - o2.getAge());
    }

    private static void sortByDateHired(Staff[] staff)
    {
        Arrays.sort(staff, (o1, o2) -> o1.getDateHired().compareTo(o2.getDateHired()));
    }
    private static void sortByName(Staff[] staff)
    {
        Arrays.sort(staff, (o1, o2) -> o1.getName().compareTo(o2.getName()));
    }
}
*/
