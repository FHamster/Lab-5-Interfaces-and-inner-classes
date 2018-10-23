package test2.question2;

import java.util.Calendar;

public class Manager extends Employee
{
    private int bonus;

    public Manager(String name, int age, int salary, Calendar dateHired, int bonus)
    {
        super(name, age, salary, dateHired);
        this.bonus = bonus;
    }

    public int getSalary()
    {
        return bonus + super.getSalary();
    }

    public void setBonus(int bonus)
    {
        this.bonus = bonus;
    }
}
