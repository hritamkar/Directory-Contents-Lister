/*
Created by : Hritam
Objective : A program that generates a text file listing all files and folders within a specified directory
Date Created : 19-08-2023
Last Modified : 19-08-2023
*/
package DirectoryContentsLister;
import java.util.Scanner;

public class DirectoryContentsApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter source directory: ");
        String sourcePath = sc.nextLine();

        System.out.print("Enter destintion directory: ");
        String destinationPath=sc.nextLine();

        System.out.print("Enter Filename: ");
        String filename=sc.nextLine();


        DirectoryContentsLister c = new DirectoryContentsLister(sourcePath,destinationPath, filename);
        c.createFile();
    }
}
