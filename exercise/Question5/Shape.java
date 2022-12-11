
class Shape
{
   String name;
   public Shape()
   {
       name = "";
   }
   public String getName()
   {
       return name;
   }
}

class Circle extends Shape implements Area
{

   double radius;
   Circle(double r, String n)
   {
       name = n;
       radius = r;
   }
   public double getArea()
   {
       return 3.1415*radius*radius;
   }
}

class Square extends Shape implements Area
{
   double side;
   public Square(double s, String n)
   {
       name = n;
       side = s;
   }
   public double getArea()
   {
       return side * side;
   }
}

class Cylinder extends Circle implements Volume
{
   double height;
   public Cylinder(double h, double r, String n)
   {
       super(r, n);
       height = h;
   }
   public double getVolume()
   {
       return 3.1415 * radius*radius * height;
   }
}

class Sphere extends Circle implements Volume
{
   public Sphere(double r, String n)
   {
       super(r, n);
   }
   public double getVolume()
   {
       return 4*3.1415*radius*radius*radius/3;
   }
}

class Cube extends Square implements Volume
{
   public Cube(double s, String n)
   {
       super(s, n);
   }
   public double getVolume()
   {
       return side*side;
   }
}

class Glome extends Sphere implements Volume
{
   public Glome(double r, String n)
   {
       super(r, n);
   }
   public double getVolume()
   {
       return 0.5*3.1315*3.1415*Math.pow(radius, 4);
   }
}

class Driver
{
   public static void main (String[] args)
   {
       Circle c = new Circle(2, "Circle");
       System.out.println ("Name = " + c.getName());
       System.out.println ("Area = " + c.getArea());
      
       Square s = new Square(2, "Square");
       System.out.println ("Name = " + c.getName());
       System.out.println ("Area = " + s.getArea());
      
       Cylinder c2 = new Cylinder(2, 4, "Cylinder");
       System.out.println ("Name = " + s.getName());
       System.out.println ("Volume = " + c2.getVolume());
      
       Sphere s2 = new Sphere(4, "Sphere");
       System.out.println ("Name = " + c2.getName());
       System.out.println ("Volume = " + s2.getVolume());
      
       Cube c3 = new Cube(2, "Cube");
       System.out.println ("Name = " + s2.getName());
       System.out.println ("Volume = " + c3.getVolume());
      
       Glome g = new Glome(2, "Glome");
       System.out.println ("Name = " + c3.getName());
       System.out.println ("Volume = " + g.getVolume());
   }
}