package test2.question2.person;

import tool.MyRandom;

import java.util.Calendar;
import java.util.Date;

public class Employee extends Person
{
    int salary;
    Date dateHired;

    public Employee(String name, int age, int salary, Date dateHired)
    {
        super(name, age);
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public static Employee randEmployee()
    {
        return
                new Employee("张三", MyRandom.randNum(20, 100),
                        MyRandom.randNum(200, 1000),
                        new Date(
                                MyRandom.randNum(2000, 2020),
                                MyRandom.randNum(1, 12),
                                MyRandom.randNum(1, 29))
                );
    }

    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public Date getDateHired()
    {
        return dateHired;
    }

    public void setDateHired(Date dateHired)
    {
        this.dateHired = dateHired;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "salary=" + this.getSalary() +
                ", dateHired=" + dateHired +
                '}';
    }
}
