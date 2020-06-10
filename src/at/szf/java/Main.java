package at.szf.java;

import at.szf.java.Cinema.Cinema;
import at.szf.java.Cinema.Cinemahall;
import at.szf.java.animals.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

import static java.util.stream.Collectors.toCollection;

public class Main {
    public static void main(String[] args){
        List<String> list = LongStream.range(0, 2)
                .boxed()
                .map(Long::toHexString)
                .collect(toCollection(ArrayList::new));
        List<String> stringsToSearch = new ArrayList<>(list);
        stringsToSearch.addAll(list);
        //stringsToSearch.toString();
        System.out.println(  stringsToSearch );



        ArrayList<Animal> animals = new ArrayList<Animal>(){
            {
                add(new Human("David",10f,20f,"Austria"));
                add(new Human("Alex",10f,20f,"Austria"));
                add(new Human("Markus",10f,20f,"Austria"));
                add(new Human("Julia",10f,20f,"Austria"));
                add(new Bird("Wolfgang",10f,20f,10f));
                add(new Bird("Marko",10f,20f,10f));
                add(new Bird("Adrian",10f,20f,10f));
                add(new Bird("Johannes",10f,20f,10f));
                add(new Fish("Tim",10f,20f, FISHTYPE.SHARK));
                add(new Fish("Fabian",10f,20f, FISHTYPE.SHARK));
                add(new Fish("Sepp",10f,20f, FISHTYPE.SHARK));
                add(new Fish("Christian",10f,20f, FISHTYPE.SHARK));
            }
        };

        for(Animal animal : animals){
            if(animal instanceof Human){
                Human human = (Human)animal;
                human.swim();
            }
        }


        Cinema dieselkino = new Cinema("Dieselkino Fohnsdorf");
        Cinemahall hall1 = new Cinemahall("Hall 01",5,10);
        Cinemahall hall2 = new Cinemahall("Hall 02",10,20);
        Cinemahall hall3 = new Cinemahall("Hall 03",10,8);
        Cinemahall hall4 = new Cinemahall("Hall 04",5,10);
        dieselkino.addCinemahall(hall1);
        dieselkino.addCinemahall(hall2);
        dieselkino.addCinemahall(hall3);
        dieselkino.addCinemahall(hall4);

        int[][] intArr = new int[3][5];
        //intArr[0] = new int[3];
        //intArr[1] = new int[5];
        //intArr[2] = new int[9];

        for(int i = 0; i < intArr.length; i++){
            for(int j = 0; j < intArr[i].length; j++){
                System.out.print("|X");
            }
            System.out.println("|");
        }




        for(Cinemahall hall : dieselkino){
            System.out.println(hall.getName());
        }



        Human humanObj = new Human("David",185,80,"Austria");

        Human.doSomething();
        humanObj.doSomething();
        humanObj = null;
        humanObj.doSomething();
        ((Human)null).doSomething();



        int[] intArr2 = new int[]{-5,20,3,100,-60,70,4000,1};
        DavidClass davidObj = new DavidClass();

        System.out.println("Print Array Version 1:\n------------------------");
       // printIntArray(intArr, davidObj);


        IntFilter filter = new IntFilter() {
            @Override
            public boolean isValid(int number) {
                return number < 20;
            }
        };
        System.out.println("Print Array Version 2:\n------------------------");
        //printIntArray(intArr, filter);


        System.out.println("Print Array Version 3:\n------------------------");
       // printIntArray(intArr, (number) -> number < 0 );

        printIntArray(intArr2, number -> true );
        //printIntArray(intArr, (number) -> number > 0);
        //printIntArray(intArr, (number) -> true );

        for(int i = 0; i < animals.size(); i++){
            Animal animal = animals.get(i);
            System.out.println("Animal-Name: " + animal.getName());
        }

        for (Animal animal: animals ) {
            System.out.println("Animal-Name: " + animal.getName());
        }
        animals.forEach((Animal a) -> System.out.println("Animal-Name: " + a.getName()));

       // System.out.println(calculateLucalsnumberVer1(1000));
       // System.out.println(calculateLucalsnumberVer2(1000));

    }


    public static long calculateLucalsnumberVer1(int idx){
        if(idx == 0) return 2L;
        if(idx == 1) return 1L;
        long lastnumber = 1L;
        long penultimateNumber = 2L;
        long lucasNumber = 0L;

        for(int curIdx = 2; curIdx <= idx; curIdx++){
            lucasNumber = lastnumber + penultimateNumber;
            penultimateNumber = lastnumber;
            lastnumber = lucasNumber;
        }

        return lucasNumber;
    }


    public static long calculateLucalsnumberVer2(int idx){
        if(idx == 0) return 2L;
        if(idx == 1) return 1L;
        return calculateLucalsnumberVer2(idx -2) + calculateLucalsnumberVer2(idx-1);
    }


    public static void printIntArray(int[] intArr, Predicate<Integer> predicate){
        for(int number: intArr){
            if(predicate.test(number)){
                System.out.print(number +" ");
            }
        }
        System.out.println();
    }



}

