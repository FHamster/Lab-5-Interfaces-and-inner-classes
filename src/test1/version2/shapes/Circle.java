package test1.version2.shapes;

public class Circle implements Shape
{
    private double radius;

    public Circle(double radius)
    {
//        System.out.printf("初始化Circle radius = %f\n", radius);
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * PI * radius;
    }

    @Override
    public double getArea()
    {
        return PI * radius * radius;
    }
}
