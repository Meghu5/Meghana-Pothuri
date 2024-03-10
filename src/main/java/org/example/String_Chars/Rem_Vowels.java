package org.example.String_Chars;

public class Rem_Vowels {

    public static void main(String args[]){

        String k= "Meghana PoOOOOthuri";
        String m=k.toLowerCase();
        String t = "";

        for(int i=0;i<m.length();i++){
            if(m.charAt(i)=='a'||m.charAt(i)=='e'||m.charAt(i)=='o'||m.charAt(i)=='i'||m.charAt(i)=='u'){
               System.out.println("Removing vowel - "+m.charAt(i)+" from the String -"+m);
            }
            else {
        t=t+m.charAt(i);
            }
        }
        System.out.println("After Removing Vowels "+t);
    }
}