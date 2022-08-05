import java.io.*;

public class CreateFile {

    public static void main(String[] args) {


        try {
            File f1 = new File("/Users/msahal/Documents/Java.txt");
            if (f1.createNewFile()) {
                System.out.println("File " + f1.getName() + " is created successfully.");
            }
            else {
                System.out.println("File is already exist in the directory.");
            }

            if (f1.exists()){
                System.out.println("The file name is: "+f1.getName());
                System.out.println("The Absolute path of the file is: "+f1.getAbsolutePath());
                System.out.println("The Length of the file is: "+String.valueOf(f1.length()));
                System.out.println("Is file writeable: "+f1.canWrite());
                System.out.println("Is file readable: "+f1.canRead());
            }
            else {
                System.out.println("File Does not exist");
            }
        }
        catch (IOException ex) {

            System.out.println("An unexpected error is occurred: "+ex);
        }

    }
}
