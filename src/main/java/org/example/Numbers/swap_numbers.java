package org.example.Numbers;

public class swap_numbers {
   static int a=20,b=30,temp;
    public static void main (String args[]){
        swap();
        swapp();
    }
    // with third variable
public static void swap(){
    temp=a;
    a=b;
    b=temp;
    System.out.println(a);
    System.out.println(b);
}

//without third variable
    public static void swapp(){
        a=40;
        b=50;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);

    }















}
