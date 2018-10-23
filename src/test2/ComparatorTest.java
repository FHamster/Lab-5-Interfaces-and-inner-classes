/*
package test2;

import test2.question1.staff.Staff;

import java.util.Arrays;

public class ComparatorTest
{
    public static void main(String[] args)
    {
        Staff[] staff = randStaff();


    }

    //随机生成员工数组
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

        Arrays.sort(staff, new Comparator<Staff>()
        {
            @Override
            public int compare(Staff o1, Staff o2)
            {
                return o1.getSalary() - o2.getSalary();
            }
        });
    }

    private static void sortByAge(Staff[] staff)
    {
        Arrays.sort(staff, new Comparator<Staff>()
        {
            @Override
            public int compare(Staff o1, Staff o2)
            {
                return o1.getAge() - o2.getAge();
            }
        });
    }

    private static void sortByDateHired(Staff[] staff)
    {
        Arrays.sort(staff, new Comparator<Staff>()
        {
            @Override
            public int compare(Staff o1, Staff o2)
            {
                return o1.getDateHired().compareTo(o2.getDateHired());
            }
        });
    }
    private static void sortByName(Staff[] staff)
    {
        Arrays.sort(staff, new Comparator<Staff>()
        {
            @Override
            public int compare(Staff o1, Staff o2)
            {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
*/
