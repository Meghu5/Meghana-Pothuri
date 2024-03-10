package org.example.String_Chars;

import java.util.HashMap;
import java.util.Map;

public class Find_upper_lower_chars {
    static String g = "MegHAnaQAtester**@@#$$^&*";

    public static void main(String args[]) {
        HashMap<Character,Integer> upper = new HashMap<Character,Integer>();
        HashMap<Character,Integer> lower = new HashMap<Character,Integer>();
        for (int i = 0; i < g.length(); i++) {

            if (Character.isUpperCase(g.charAt(i))) {
                System.out.println("Uppercase : " + g.charAt(i));
                if(upper.containsKey(g.charAt(i))){
                    upper.put(g.charAt(i), upper.get(g.charAt(i))+1);
                }
                else{
                    upper.put(g.charAt(i),1);
                }

            for(HashMap.Entry<Character,Integer> en : upper.entrySet()){

                System.out.println("UpperCase "+en.getKey()+" "+en.getValue());
}
            } else if (Character.isLowerCase(g.charAt(i))) {
                    System.out.println("Lowercase : " + g.charAt(i));
                            if(lower.containsKey(g.charAt(i))){
                                    lower.put(g.charAt(i), lower.get(g.charAt(i))+1);
                }
                else{
                    lower.put(g.charAt(i),1);
                }
                for(HashMap.Entry<Character,Integer> entry : lower.entrySet()){
                    System.out.println(entry.getKey()+ " " +entry.getValue());
                }
            }
        }
    }
}
