package test1.version1.shapes;

public class Circle extends Shape
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
