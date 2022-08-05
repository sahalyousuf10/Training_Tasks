import java.io.*;
import java.util.Scanner;

public class CreateWriteFile {

    public static void main(String[] args) {

        try {
            File f1 = new File("/Users/msahal/Documents/sahal.txt");

            if (f1.createNewFile()){
                System.out.println("File named "+f1.getName()+" created successfully!");
            }
            else {
                System.out.println("File is already exist in dictionary!");
            }

            FileWriter fw1 = new FileWriter("/Users/msahal/Documents/sahal.txt");

            fw1.write("This is a sample file created for testing file handling!");
            System.out.println("Text is successfully wrote in the file!");

            fw1.append(" This is more text added into file!");
            System.out.println("More text is successfully appended into file");

            System.out.println("\nThe file name is: "+f1.getName());
            System.out.println("The Absolute path of the file is: "+f1.getAbsolutePath());
            System.out.println("The Length of the file is: "+String.valueOf(f1.length())+" bytes");
            System.out.println("Is file writeable: "+f1.canWrite());
            System.out.println("Is file readable: "+f1.canRead());
            fw1.close();

            System.out.println("\nThe content written in file is ");
            Scanner read = new Scanner(f1);
            while (read.hasNextLine()) {
                String fileData = read.nextLine();
                System.out.println(fileData);
            }
            read.close();
        }

        catch (Exception ex){
            System.out.println("Exception detected: "+ex);
        }
    }

}
