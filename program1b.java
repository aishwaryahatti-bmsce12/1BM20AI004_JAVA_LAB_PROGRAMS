/*Write a class named Car that has the following data members:
• model. The model field is an int that holds the car’s year.
• make. The make field references a String object that holds the make of the car.
• speed. The speed field is an int that holds the car’s current speed.
The class should have the following constructor and other methods.
• The constructor should accept the car’s year model, make and speed as arguments.
• Accessor methods should get the values stored in an object’s year model, make, and speed fields.
• Accelerate method should add 5 to the speed field each time it is called.
• Brake method should subtract 5 from the speed field each time it is called.
Demonstrate the class in a program that creates a Car object, and then calls the accelerate method five times. 
After each call to the accelerate method, get the current speed of the car and display it. Call the brake method five times. 
After each call to the brake method, get the current speed of the car and display it.*/
class Car
{
    private int model,speed;
    private String make;
    Car(int model1,int speed1,String make1)
    {
        this.model = model1;
        this.speed = speed1;
        this.make = make1;
    }
    int get_model()
    {
        return model;
    }
    int get_speed()
    {
        return speed;
    }
    String get_make()
    {
        return make;
    }
    void accelerate()
    {
        this.speed += 5;
    }
    void brake()
    {
        this.speed -= 5;
    }
}

public class program1b 
{
    public static void main(String args[])
    {
        Car obj = new Car(2020,120,"Mercedes");
        System.out.println("Model : " + obj.get_model());
        System.out.println("Speed : " + obj.get_speed());
        System.out.println("Make : " + obj.get_make());
        for(int i=1;i<=5;i++)
        {
            obj.accelerate();
            System.out.println("Speed after acceleration : " + obj.get_speed());
        }
        for(int i=1;i<=5;i++)
        {
            obj.brake();
            System.out.println("Speed after braking : " + obj.get_speed());
        }   
    }
}