/*1 a. Design and create a class named Retail Item that holds data about an item in a retail store. 
The class should have the following fields:
• Description - The description field references a String object that holds a brief description of the item.
• Units - The units field is an int variable that holds the number of units currently in inventory.
• Price - The price field is a double that holds the item’s retail price.
Write a constructor that accepts arguments for each field, appropriate mutator methods that store values in these fields, and accessor methods that return the values in these fields. 
Write the main method which creates three Retail Item objects and invokes appropriate methods.*/

class retail_item
{
    private String description;
    private int units,price;
    retail_item(String desc,int u,int p)
    {
        this.description = desc;
        this.units = u;
        this.price = p;
    }
    String getDesc()
    {
        return description;
    }
    int getUnits()
    {
        return units;
    }
    int getPrice()
    {
        return price;
    }
    void display()
    {
        System.out.println("In Method");
        System.out.println("Description :" + this.description);
        System.out.println("Units :" + this.units);
        System.out.println("Price :" + this.price);
    }
}

public class program1a 
{
    public static void main(String args[])
    {
        retail_item obj1 = new retail_item("Biscuit",10,10);
        obj1.display();
        System.out.println("Description = "+ obj1.getDesc());
        System.out.println("Units = "+ obj1.getUnits());
        System.out.println("Price = "+ obj1.getPrice());
    }
}