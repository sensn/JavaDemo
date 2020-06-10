package at.szf.java.animals;

public class Fish extends Animal implements canSwim{
    private FISHTYPE type = FISHTYPE.UNKNOWN;

    public Fish(String name, float size, float weight, FISHTYPE type) {
        super(name, size, weight);
        this.type = type;
    }

    public FISHTYPE getType() {
        return type;
    }

    @Override
    public void swim() {
        System.out.println("Fish swim....");
    }

    @Override
    public void dive() {
        System.out.println("Fish dive...");
    }
}
