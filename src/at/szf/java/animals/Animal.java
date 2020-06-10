package at.szf.java.animals;

public class Animal {
    private String name;
    private float size = 1.0f;
    private float weight = 1.0f;

    static{
        //System.out.println("Class \'Animal' was loaded into program");
    }

    {
        //System.out.println("Object from type \'Animal' was created....");
    }

    public Animal(String name) {
        this(name,1.0f);
    }
    public Animal(String name, float size) {
        this(name,size,1.0f);
    }



    public Animal(String name, float size, float weight) {
        this.name = name;
        if(size > 0){
            this.size = size;
        }
        if(weight > 0){
            this.weight = weight;
        }
    }



    public String getName() {
        return name;
    }
    public float getSize() {
        return size;
    }
    public float getWeight() {
        return weight;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", weight=" + weight +
                '}';
    }
}
