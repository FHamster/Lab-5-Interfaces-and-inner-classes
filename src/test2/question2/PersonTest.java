package test2.question2;

import java.lang.reflect.Array;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Comparator;

public class PersonTest
{
    private static void printName(Person[] persons)
    {
        for (Person x : persons)
        {
            System.out.println(x.getName());
        }
    }

    private static void printSalary(Employee[] employees)
    {
        for (Employee x : employees)
        {
            System.out.println(x.getSalary());
        }
    }

    private static void sortBySalary(Employee[] employees)
    {
        Arrays.sort(employees, new Comparator<Employee>()
        {
            @Override
            public int compare(Employee o1, Employee o2)
            {
                return Integer.compare(o1.getSalary(), o2.getSalary());
            }
        });
    }

    private static void sortByAge(Person[] persons)
    {
        Arrays.sort(persons, new Comparator<Person>()
        {
            @Override
            public int compare(Person o1, Person o2)
            {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
    }

    private static void sortByName(Person[] persons)
    {
        Arrays.sort(persons, new Comparator<Person>()
        {
            @Override
            public int compare(Person o1, Person o2)
            {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
