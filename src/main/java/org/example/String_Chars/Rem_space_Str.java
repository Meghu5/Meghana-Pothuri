package org.example.String_Chars;

public class Rem_space_Str {

    static String b = "bskfb hsd fijs d  e               we ";

    public static void main(String args[]){
         String m= "";
         String s="";
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)!=' '){
                m=m+b.charAt(i);
            }
        }
        System.out.println("With String remove space with CharAt() - "+m);
        //alternate method
        for(int j=0;j<b.length()-1;j++){
            if(Character.isWhitespace(b.charAt(j))){
            }
            else{
                s=s+b.charAt(j);
               // System.out.println(s);
            }
        }
        System.out.println("With Character.isWhiteSpace() rem char "+s);
            }
}