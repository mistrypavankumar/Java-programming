package com.company;

/*
Write a Java program to list all the files in a directory including the files present in all its
subdirectories.
 */

import java.io.File;
import java.util.Scanner;

public class FindListOfFiles {
    public static void main(String[] args) {

        String path = null;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the root directory name: ");
        path = input.next() + ":\\";

        File file_ref = new File(path);

        if (!file_ref.exists()){
            printLine();
            System.out.println("Root directory does not exit");
        }else{
            String ch = "y";

            while (ch.equalsIgnoreCase("y")){
                printFiles(path);
                System.out.println("Do you want to open any sub-directory (Y/N) : ");

                ch = input.next().toLowerCase();
                if (ch.equalsIgnoreCase("y")){
                    System.out.println("Enter the sub-directory name: ");
                    path = path + "\\\\" + input.next();

                    File file_ref2 = new File(path);
                    if (!file_ref2.exists()){
                        printLine();
                        System.out.println("The sub-directory does not exit");
                        printLine();

                        int lastIndex = path.lastIndexOf("\\");
                        path = path.substring(0,lastIndex);
                    }
                }

            }
        }

        System.out.println("******* Program closed ********");
    }


    public static void printFiles(String path){
        System.out.println("Current Location: " + path);

        File file_ref = new File(path);
        File[] fileList = file_ref.listFiles();

        // showing all the files and directory
        for (File file : fileList) {
            if (file.isFile()){

                // If it is a file than we are representing by - (dash symbol)
                System.out.println("- " + file.getName());
            }else{

                // If it is a directory(folder) than we are representing by > (greater than symbol)
                System.out.println("> " + file.getName());
            }
        }
    }

    public static void printLine(){
        System.out.println("<<<<===================================================>>>>");
    }
}
