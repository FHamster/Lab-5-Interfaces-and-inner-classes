package test2.question2;

import java.util.Calendar;

public class Employee extends Person
{
    int salary;
    Calendar dateHired;

    public Employee(String name, int age, int salary, Calendar dateHired)
    {
        super(name, age);
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public Calendar getDateHired()
    {
        return dateHired;
    }

    public void setDateHired(Calendar dateHired)
    {
        this.dateHired = dateHired;
    }
}
