package test1.version1;

import test1.version1.shapes.*;

import java.util.Arrays;

public class ShapeDemo
{
    public static void main(String[] args)
    {
        Shape[] shapes ;
        shapes = new Shape[5];

        shapes[0] = new Circle(2);
        shapes[1] = new Circle(5);
        shapes[2] = new Rectangle(5, 8);
        shapes[3] = new Rectangle(7, 2);
        shapes[4] = new Triangle(4, 8, 5);

        System.out.println("before sort");
        for (Shape x : shapes)
        {
            System.out.println(x.getArea());
        }

        Arrays.sort(shapes);//排序
        System.out.println("after sort");
        for (Shape x : shapes)
        {
            System.out.println(x.getArea());
        }
    }
}
