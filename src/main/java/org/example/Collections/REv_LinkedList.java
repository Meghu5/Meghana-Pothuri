package org.example.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class REv_LinkedList {
    public static void main(String args[]){

        LinkedList<Integer> l = new LinkedList<>();
        l.add(2);
        l.add(-1);
        l.add(28);
        l.add(100);
        LinkedList<Integer> l1 = new LinkedList<>();

        l.descendingIterator().forEachRemaining(l1::add);

        Iterator i1 = l1.listIterator();

        while (i1.hasNext()){
            System.out.println(i1.next());
        }
    }   }
