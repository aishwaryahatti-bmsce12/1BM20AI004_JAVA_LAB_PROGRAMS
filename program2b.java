//2b Java Program
import java.lang.Math;

abstract class shape
{
    abstract void display();
}

class triangle extends shape
{
    double b,h,area;
    triangle(double base,double height)
    {
        b = base;
        h = height;
    }
    void calc_area()
    {
        area = 0.5 * b * h;
    }
    void display()
    {
        System.out.println("Area of Triangle = " + area);
    }
}

class circle extends shape
{
    double r,area;
    circle(){}
    circle(double rad)
    {
        r = rad;
    }
    void calc_area()
    {
        area = 3.14 * r * r;
    }
    void display()
    {
        System.out.println("Area of Circle = " + area);
    }
}

class hexagon extends shape
{
    double a,area;
    hexagon(double side)
    {
        a = side;
    }
    void calc_area()
    {
        area = 3 * Math.sqrt(3.0) * Math.pow(a,2) /2;
    }
    void display()
    {
        System.out.println("Area of Hexagon = " + area);
    }
}

class circle3d extends circle
{
    circle3d(double rad)
    {
        r = rad;
    }
    void calc_area()
    {
        area = 4 * 3.14 * r * r;
    }
    void display()
    {
        System.out.println("Area of Sphere = " + area);
    }
}

public class program2b 
{
    public static void main(String args[])
    {
        triangle t = new triangle(4.0,2.5);
        t.calc_area();
        t.display();
        circle c = new circle(3.0);
        c.calc_area();
        c.display();
        hexagon h = new hexagon(7.5);
        h.calc_area();
        h.display();
        circle3d s = new circle3d(4.0);
        s.calc_area();
        s.display();
    }
}