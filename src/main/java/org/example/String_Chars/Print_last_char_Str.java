package org.example.String_Chars;

public class Print_last_char_Str {

    String a ="I love Java";
    char[] b = a.toCharArray();
    String l = "";
    public static void main(String [] args){

        Print_last_char_Str m = new Print_last_char_Str();
        m.str_las();

    }

    public void str_las(){

        for(int i=0;i<a.length();i++ ){

            if(a.charAt(i)==' '){
                l=l+a.charAt(i);
                System.out.print(a.charAt(i - 1) + " ");

            //System.out.println(l);

            }



        }


    }



}
