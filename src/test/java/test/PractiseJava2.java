package test;

import java.util.HashSet;
import java.util.Set;

public class PractiseJava2 {

    public static void main(String args[]){
        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        var i = fruit.iterator();
        while(i.hasNext())
            System.out.println(i.next());
    }
    }
