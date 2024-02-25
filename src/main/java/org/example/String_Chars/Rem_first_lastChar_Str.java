package org.example.String_Chars;

public class Rem_first_lastChar_Str {
String a = "MeghanaLasya";
String b= "";
    public static void main(String args[]){

        Rem_first_lastChar_Str m = new Rem_first_lastChar_Str();
m.sta();
    }

    public void sta(){
        for(int i=0;i<a.length();i++){

            if(i==0){
System.out.print("");
            }
            else if(i==a.length()-1){
                System.out.print("");
            }
            else{
             b=b+a.charAt(i);
            }
        }
        System.out.println(b);
    }
}
