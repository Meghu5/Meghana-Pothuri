package org.example.Collections;

import java.util.*;

// To add consecutive numbers in array and find max in it and identify the index which makes the sum highest.
public class Lar_Sum_Array {

// declaring list with multiple ele like this
    List<Integer> listOfIntegers = Arrays.asList(11, 13, 9, 20, 7, 3, 30);

    public static void main(String args[]){

        int sum=0,temp=0;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(10000);
        a.add(2);
        a.add(3);
        a.add(400);
        a.add(5);
        a.add(3200);
        a.add(30);
        a.add(100);
        a.add(1500);
        for(int i=0;i<a.size()-1;i++){
            // adding the consecutive num
          sum=a.get(i)+a.get(i+1);
            b.add(sum);
        }
                //iterate thru sum
                // code not used but kept for Stream usage ref
                Integer max = b
                        .stream()
                        .mapToInt(v -> v)
                        .max().getAsInt();

                // To get max value from array and index of it
                Integer maxValue = Collections.max(b);
                Integer maxIndex = b.indexOf(maxValue);

                System.out.println("Max value - " + maxValue);
                    int v= maxIndex+1;
                    System.out.println("Max indexes - "+maxIndex+" "+v);

                    // break;
                }
            }