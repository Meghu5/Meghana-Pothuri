package org.example.Reading_Files;
// Java program to read and print all files
// from a zip file

// Importing input output classes
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
// Importing zip classes and Scanner class
// from java.util package
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;


/*A zip file is a file where one or more files are compressed together, generally, zip files are ideal for storing large files.  Here the zip file will first read and at the same time printing the contents of a zip file using a java program using the java.util.zip.ZipEntry class for marking the zip file and after reading it, the contents inside it would be printed. If in-case, the zip file is not found the code will throw an input-output exception that FileNotFoundException

        Illustration:

        Considering a system that stores a zip file named

        geekforgeeks.zip at D drive in windows operating system
        D:/geeks.zip in windows operating system
        Archive.zip in macOS operating system
        Case 1: geekforgeeks.zip


        Input  : D:/geekforgeeks.zip
        Output : The files in the Zip are as follows:
        Java program to print a number.java
        Java program to print your name.java
        Java program to calculate.java
        Java program to print a pattern.java
        Now if a system does not store the specific zip file inputted by the user then the code would throw an exception and print a message that the file has not been found.

        Case 2: D:/geeks.zip

        Input  :  D:/geeks.zip
        Output : java.io.FileNotFoundException: D:/geeks.zip (The system cannot find the file specified)
        Case 3: Archive.zip

        It is the same as case 1 so reserving this for the implementation part just on the different operating system as shown in the example with greater depth.

        Approach

        Take the location of the zip file as input in the main method.
        The location of the zip file is now sent to the method.
        In the method, the file is read and its content is printed.
        If in-case the file is not found, the code would throw an exception.
        Example
*/

// Class to Read and print the Zip Files
public class Read_Print_All_Files_Zip {

    // Function to read and print the file names.
    public void printFileContent(String filePath)
    {

        // Creating objects for the classes and
        // initializing them to null
        FileInputStream fs = null;
        ZipInputStream Zs = null;
        ZipEntry ze = null;

        // Try block to handle if exception occurs
        try {

            // Display message when program compiles
            // successfully
            System.out.println(
                    "Files in the zip are as follows: ");

            fs = new FileInputStream(filePath);
            Zs = new ZipInputStream(
                    new BufferedInputStream(fs));

            // Loop to read and print the zip file name till
            // the end
            while ((ze = Zs.getNextEntry()) != null) {
                System.out.println(ze.getName());
            }

            // Closing the file connection
            Zs.close();
        }

        // Catch block to handle if any exception related
        // to file handling occurs
        catch (FileNotFoundException fe) {

            // Print the line line and exception
            // of the program where it occurred
            fe.printStackTrace();
        }

        // Catch block to handle generic exceptions
        catch (IOException ie) {

            // Print the line line and exception
            // of the program where it occurred
            ie.printStackTrace();
        }
    }

    // Main driver method
    public static void main(String[] args)
    {

        // Creating an object of the file
        Read_Print_All_Files_Zip zf = new Read_Print_All_Files_Zip();

        // Taking input of the zip file from local directory
        // Name of the zip file to be read should be entered
        Scanner sc = new Scanner(System.in);

        // Display message asking user to enter
        // zip file local directory
        System.out.println(
                "Enter the location of the zip file: ");
        String str = sc.nextLine();

        // Print the zip files(compressed files)
        zf.printFileContent(str);
    }
}