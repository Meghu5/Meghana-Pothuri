package org.example.String_Chars;

public class All_SubStrings {

    public static void main(String args[]){

        String a = "Selenium";
        String b="";

        for(int c=0;c<=a.length();c++){
          b=a.substring(0,c);
          System.out.println(b);
        }
    }
}