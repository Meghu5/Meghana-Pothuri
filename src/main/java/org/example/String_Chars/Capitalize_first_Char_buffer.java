package org.example.String_Chars;

public class Capitalize_first_Char_buffer {

    public static void main(String[] args) {
        String str = "simply easy learning tutorialspoint";
        System.out.println("Before capitalizing: " + str);
        Capital(str); // calling the method to capitalize
    }

    public static String Capital(String str) { // user-defined method
        // store each character to a char array

        StringBuffer s = new StringBuffer();
        for (int i = 1; i < s.length(); i++) {
            // current letter is the starting of the word
            if (str.charAt(i - 1) == ' ' && str.charAt(i) != ' ') {
                s.append(
                        Character.toUpperCase(str.charAt(i)));
                System.out.println(s);
            } else {
                s.append(str.charAt(i));
                System.out.println(s);
            }               //ch = str.charAt(i);
        }
        return s.toString().trim();


    }

}

