package test1.version1.shapes;

public abstract class Shape implements Comparable<Shape>
{
    final static double PI = Math.PI;

    abstract public double getPerimeter();

    abstract public double getArea();

    @Override
    public int compareTo(Shape o)
    {
        return Double.compare(this.getArea(), o.getArea());
    }
}
