package org.example;

public class Swap_Strings {
    String a = "Java";
    String b = "Selenium";
    public static void main(String args[]){
        Swap_Strings m = new Swap_Strings();
        m.swap();
    }
    public void swap(){
        a=a+b;
        b=a.substring(0,(a.length()-b.length()));
        a=a.substring(b.length());

        System.out.println(a);
        System.out.println(b);

    }


}
