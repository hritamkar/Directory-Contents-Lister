/*
Created by : Hritam
Objective : Program to print filenames present in a directory into a file
Date Created : 19-08-2023
Last Modified : 19-08-2023
*/
package DirectoryContentsLister;
import java.util.Scanner;

public class DirectoryContentsLister {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter source directory: ");
        String sourcePath = sc.nextLine();

        System.out.print("Enter destintion directory: ");
        String destinationPath=sc.nextLine();

        System.out.print("Enter Filename: ");
        String filename=sc.nextLine();


        FileHandler c = new FileHandler(sourcePath,destinationPath, filename);
        c.createFile();
    }
}
