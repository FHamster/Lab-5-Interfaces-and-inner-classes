package test2.question1.staff;

public class Staff
{
    //成员变量
    private String name;
    private int age;

    public Staff(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Staff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static Staff randomStaff()
    {
        return new Staff("张三", MyRandom.randNum(20, 22));
    }
}
