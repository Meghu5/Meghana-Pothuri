package org.example.Collections;

import java.util.*;

public class Count_fre_ele_list {

    public static void countFrequencies(ArrayList<String> list)
    {
        // hash set is created and elements of
        // arraylist are inserted into it
        Set<String> st = new HashSet<String>(list);
        for (String s : st)
            System.out.println(s + ": " + Collections.frequency(list, s));
    }

    //method 2
    public static void countFrequencies1(ArrayList<String> list)
    {
        TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
        for (String t : list) {
            Integer c = tmap.get(t);
            tmap.put(t, (c == null) ? 1 : c + 1);
            System.out.println(t + ": " + Collections.frequency(list, t));
        }
        for (Map.Entry m : tmap.entrySet())
            System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
    }

    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        countFrequencies(list);
        countFrequencies1(list);
    }



}
