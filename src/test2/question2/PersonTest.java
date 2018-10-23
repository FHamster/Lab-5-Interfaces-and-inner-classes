package test2.question2;

import test2.question2.person.Employee;
import test2.question2.person.Person;

import java.util.Arrays;
import java.util.Comparator;

public class PersonTest
{

    public static void main(String[] args)
    {
        //初始化person[]
        Employee[] employees = new Employee[8];
        int i = 0;
        for (; i < 4; i++)
        {
            employees[i] = Employee.randEmployee();
            employees[i].setName("Smith" + i);
        }
        for (; i < 8; i++)
        {
            employees[i] = Employee.randEmployee();
            employees[i].setName("Jhon" + i);
        }

        System.out.println("sort by salary");
        sortBySalary(employees);
        printSalary(employees);

        System.out.println("sort by name");
        sortByName(employees);
        printName(employees);
    }

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

    private static void sortByDateHired(Employee[] employees)
    {
        Arrays.sort(employees, new Comparator<Employee>()
        {
            @Override
            public int compare(Employee o1, Employee o2)
            {
                return o1.getDateHired().compareTo(o2.getDateHired());
            }
        });
    }

        private static void sortByName (Person[]persons)
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
