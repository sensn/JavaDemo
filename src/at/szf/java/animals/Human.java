package at.szf.java.animals;

public class Human extends Animal implements canSwim,canWalk {
    String country;


    public Human(String name, float size, float weight, String country) {
        super(name, size, weight);
        this.country = country;
    }

    public static void doSomething(){
        System.out.println("Do Something....");
    }

    public String getCountry() {
        return country;
    }

    @Override
    public void swim() {
        System.out.println("Human swim...");
    }

    @Override
    public void dive() {
        System.out.println("Human dive...");
    }

    @Override
    public void walk() {
        System.out.println("Human walk...");
    }

    @Override
    public void run() {
        System.out.println("Human run...");
    }

    @Override
    public void sneek() {
        System.out.println("Human sneek...");
    }
}
