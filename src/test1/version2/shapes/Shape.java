package test1.version2.shapes;

public interface Shape extends Comparable<Shape>
{
    double PI = Math.PI;

    double getPerimeter();

    double getArea();

    @Override
    default int compareTo(Shape o)
    {
        return Double.compare(this.getArea(), o.getArea());
    }
}
