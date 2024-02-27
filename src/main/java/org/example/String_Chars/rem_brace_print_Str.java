package org.example.String_Chars;

public class rem_brace_print_Str {


    public static void main(String[] args){

    String st= "how are you (Meghana) (Pothuri) (Brilliant)";

    String word="";
    String[] ar= st.split(" ");

for(int i=0;i<ar.length;i++){

        if(ar[i].contains("(")){

            System.out.println(ar[i]);
            //System.out.println(ar[i].length()-1);
           // System.out.println(ar[i].charAt(1));
            word=ar[i].toString().substring(ar[i].charAt(1),ar[i].length()-1);
                    //subString(ar[i].charAt(1),ar[i].length-1);
            System.out.println(word);
        }}

//System.out.println(word);
    }

}
