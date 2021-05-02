package code.task.forge.project.utils;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

        public static void printToFile(String name, String content) {
            try {
                FileWriter myWriter = new FileWriter(name+".txt");
                myWriter.write(content);
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
}