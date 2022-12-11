//Animal.java

public abstract class Animal {
    protected int legs;

   
    protected Animal(int legs) {
        super();
        this.legs = legs;
    }


    protected Animal() {
        this.legs = 0;
    }

    public abstract void eat();

    public void walk() {
        System.out.println("Animal is walking using " + legs + " legs");
    }

}

