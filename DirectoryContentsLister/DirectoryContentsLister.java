/*
Created by : Hritam
Objective :  A program that generates a text file listing all files and folders within a specified directory
Date Created : 19-08-2023
Last Modified : 19-08-2023
*/
package DirectoryContentsLister;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DirectoryContentsLister {
    String sourcePath;
    String destinationPath;
    String filename;

    public DirectoryContentsLister(String sourcePath, String destinationPath, String filename) {
        this.sourcePath = sourcePath;
        this.destinationPath = destinationPath;
        this.filename = filename+".txt";
    }

    /*
    method objective: method to create and write to specified file
    input: empty
    return: nothing
    */
    public void createFile() {
        try {
            String fullFilePath = destinationPath + File.separator + filename;
            FileWriter writer = new FileWriter(fullFilePath);
            File directory = new File(sourcePath);
            File[] files = directory.listFiles();

            if (files != null) {
                for (File file : files) {
                    String fileName = file.getName();
                    writer.write(fileName + "\n");
                }
                writer.close();
                System.out.println("File names have been written to the file.");
            }
            else
                System.err.println("Source directory does not exist or is empty.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
