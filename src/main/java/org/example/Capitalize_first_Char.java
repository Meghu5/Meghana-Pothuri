package org.example;

public class Capitalize_first_Char {
    public static void Capital(String myinput) { // user-defined method
        // store each character to a char array
        char[] charAray = myinput.toCharArray();
        // for loop to capitalize first letter
        for (int i = 0; i < charAray.length; i++) {
            // capitalizing first letter of first word
            charAray[0] = Character.toUpperCase(charAray[0]);
            // loop to check if there is space between two letters
            if (charAray[i] == ' ') {
                // capitalizing first letter of rest of the word
                charAray[i + 1] = Character.toUpperCase(charAray[i + 1]);
            }
        }
        // converting the character array to the string
        String b = new String(charAray);

      //  myinput=myinput.toString();

        myinput = String.valueOf(charAray);
        // to print the final result
        System.out.println("After capitalizing the first letter: " + myinput);
    }

    public static void main(String[] args) {
        String myinput = "simply easy learning tutorialspoint";
        System.out.println("Before capitalizing: " + myinput);
        Capital(myinput); // calling the method to capitalize
    }
}