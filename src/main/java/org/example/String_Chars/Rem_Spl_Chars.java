package org.example.String_Chars;

public class Rem_Spl_Chars {

    public static void main (String args[]){
        String a = "&%&^&*UGHG&R^&&||}}{{::<>???++--Meghana-gmerkerfsEEEEwe";
        String h="";
        for(int i=0;i<a.length();i++){

            if(a.charAt(i)>=65 && a.charAt(i)<=90){
                h=h+a.charAt(i);
                }

            else if (a.charAt(i)>=97 && a.charAt(i)<=122){
                h=h+a.charAt(i);
            }
            }


System.out.println("String after removing - " + h);

    }




}
