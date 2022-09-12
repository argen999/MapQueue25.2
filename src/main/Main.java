package main;

import java.util.*;
import shablon.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<City> linkedList = new LinkedList<>();
        TreeSet<City> treeSet = new TreeSet<>();
        for (int i = 0; i < 20; i++) {
            linkedList.add(new City(random.nextInt(1,999), "Bishkek"+i ) );
            if (linkedList.get(i).getCode() % 2 != 0) {
                treeSet.add(linkedList.get(i) );
            }
        }
        for (City c:treeSet) {
            System.out.println("Code: "+c.getCode() );
        }





    }
}