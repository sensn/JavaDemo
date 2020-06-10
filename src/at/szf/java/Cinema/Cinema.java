package at.szf.java.Cinema;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cinema implements Iterable<Cinemahall>{
    List<Cinemahall> halls = new ArrayList<>();
    String name;

    public Cinema(String name) {
        this.name = name;




    }
    public void addCinemahall(Cinemahall hall){
        this.halls.add(hall);
    }

    @Override
    public Iterator<Cinemahall> iterator() {
        Iterator<Cinemahall> iter = new Iterator<Cinemahall>() {
            int idx = 0;
            @Override
            public boolean hasNext() {
                return idx < halls.size();
            }

            @Override
            public Cinemahall next() {
                Cinemahall hall = halls.get(idx);
                idx++;
                return hall;
            }
        };

        return iter;
    }
}
