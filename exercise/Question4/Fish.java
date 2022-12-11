//Fish.java

public class Fish extends Animal implements Pet {

    @Override
    public String getNaame() {
        return "Fish";
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void play() {
        System.out.println("Fish is playing.");

    }

    @Override
    public void eat() {
        System.out.println("Fish is eating...");

    }

    public void walk() {
        System.out.println("Fish can't walk...and don't have legs");
    }
}
