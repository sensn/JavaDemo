package at.szf.java.animals;

public class Bird extends Animal  implements canWalk{
    private float wingspan = 1.0f;


    public Bird(String name, float size, float weight, float wingspan) {
        super(name, size, weight);
        this.wingspan = wingspan;
    }

    public float getWingspan() {
        return wingspan;
    }

    @Override
    public void walk() {
        System.out.println("Bird walk...");
    }

    @Override
    public void run() {
        System.out.println("Bird run...");
    }

    @Override
    public void sneek() {
        System.out.println("Bird sneek...");
    }
}
