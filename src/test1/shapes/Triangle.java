package test1.shapes;

import java.util.Objects;

public class Triangle extends Shape
{
    private double a;
    private double b;

    public Triangle(double a, double b, double c)
    {
        System.out.printf("初始化Triangle %f %f %f\n", a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double c;

    public double getA()
    {
        return a;
    }

    public void setA(double a)
    {
        this.a = a;
    }

    public double getB()
    {
        return b;
    }

    public void setB(double b)
    {
        this.b = b;
    }

    public double getC()
    {
        return c;
    }

    public void setC(double c)
    {
        this.c = c;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.a, a) == 0 &&
                Double.compare(triangle.b, b) == 0 &&
                Double.compare(triangle.c, c) == 0;
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(a, b, c);
    }

    @Override
    public String toString()
    {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public double getPerimeter()
    {
        return a + b + c;
    }

    @Override
    public double getArea()
    {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }


}
