package org.example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateChars_print_char_once_entirestr {

        public static void main(String[] args) {
            System.out.println("Hello, World!");
            Scanner str = new Scanner(System.in);
            String str1 = str.nextLine();
            System.out.println(str1);
            //   str1="Java";
            String x = "";
            char ch;
            LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

            char[] c = str1.toCharArray();

            for (char b : c) {
                if (map.containsKey(b)) {
                    map.put(b, map.get(b) + 1);
                } else {
                    map.put(b, 1);
                }
            }

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        //        System.out.println(entry.getKey()+" "+entry.getValue());
                if (entry.getValue() == 1) {
                    //else{
                    //getting char with one occurence
                    ch = entry.getKey();
                    x = x + String.valueOf(ch);

                } else if (entry.getValue()!=1) {
                    // getting char whose occurence is more than once
                    System.out.println("Duplicates are- " + entry.getKey() + " " + entry.getValue());
                    ch = entry.getKey();
                    x = x + String.valueOf(ch);

                }
            }
            //System.out.println(entry.getKey()+" "+entry.getValue());
            System.out.print(x);
        }
            }

