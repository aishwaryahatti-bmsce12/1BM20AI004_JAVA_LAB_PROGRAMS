
//TestAnimals.java

public class TestAnimals {

    public static void main(String[] args) {
        // Create objects
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        d.play();
        d.walk();

        c.play();
        c.walk();
        c.eat();
        System.out.println("Cat name: " + d.getNaame());

        a.eat();
        a.walk();
        System.out.println("Number of Legs(Fish): " + a.legs);

        e.eat();
        e.walk();
        System.out.println("Number of Legs(Spider): " + e.legs);

        p.play();
        p.setName("Baldu");
        System.out.println("Cat Name: " + p.getNaame());

        Fish fish = (Fish) a;
        Spider spider = (Spider) e;
        Cat cat = (Cat) p;

        fish.play();
        fish.eat();
        spider.eat();
        cat.eat();

    }

}