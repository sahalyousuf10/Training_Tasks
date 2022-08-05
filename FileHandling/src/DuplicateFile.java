import java.io.*;
import java.util.Scanner;

public class DuplicateFile {

    public static void main(String[] args) {

        try {

            File f2 = new File("/Users/msahal/Documents/sahal.txt");

            Scanner read = new Scanner(f2);
            String fileData = null;
            while (read.hasNextLine()) {
                fileData = read.nextLine();
            }
            read.close();

            FileWriter fw2 = new FileWriter("/Users/msahal/Documents/duplicate.txt");
            fw2.write(fileData);
            System.out.println("Duplicate text file is created!");
            fw2.close();
        }

        catch (Exception ex){
            System.out.println("Exception detected: "+ex);
        }
    }
}
