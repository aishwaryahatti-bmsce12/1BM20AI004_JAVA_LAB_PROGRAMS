
//Cat.java

public class Cat extends Animal implements Pet {
    public String name;

    
    protected Cat(String name) {
        super(4);
        this.name = name;
    }
    protected Cat() {
        this("");
    }

    @Override
    public String getNaame() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Playing cat");

    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");

    }

}

