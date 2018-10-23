package test2.question2.person;

import tool.MyRandom;

import java.util.Calendar;
import java.util.Date;

public class Manager extends Employee
{
    private int bonus;

    public Manager(String name, int age, int salary, Date dateHired, int bonus)
    {
        super(name, age, salary, dateHired);
        this.bonus = bonus;
    }

    public static Manager randManager()
    {
        return
                new Manager("张三", MyRandom.randNum(20, 100),
                        MyRandom.randNum(200, 1000),
                        new Date(
                                MyRandom.randNum(2000, 2020),
                                MyRandom.randNum(1, 12),
                                MyRandom.randNum(1, 29)),
                        MyRandom.randNum(500, 1000));
    }

    public int getSalary()
    {
        return bonus + super.getSalary();
    }

    public void setBonus(int bonus)
    {
        this.bonus = bonus;
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
