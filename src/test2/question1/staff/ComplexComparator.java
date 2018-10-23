package test2.question1.staff;

import java.util.Comparator;

public class ComplexComparator implements Comparator<Staff>
{
    @Override
    public int compare(Staff o1, Staff o2)
    {
        if (Integer.compare(o1.getAge(), o2.getAge()) > 0)
        {
            return 1;
        } else if (Integer.compare(o1.getAge(), o2.getAge()) < 0)
        {
            return -1;
        }else
        {
            return -o1.getName().compareTo(o2.getName());
        }
    }
}
