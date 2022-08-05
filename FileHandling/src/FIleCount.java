import java.io.*;
public class FIleCount {

    public static void main(String[] args) {

        try {

            File f1 = new File("/Users/msahal/Documents/");

            int fileCount= f1.list().length;
            System.out.println("Files present in the the folder documents are: "+fileCount);
            System.out.println();

            String[] pathnames = f1.list();

            for (String pathname : pathnames) {
                // Print the names of files and directories
                System.out.println(pathname);
            }

            System.out.println("\nThe .txt files present in the documents folder are\n");
            for (String pathname1 : pathnames) {
                if (pathname1.endsWith(".txt")) {
                    System.out.println(pathname1);
                }
            }
        }

        catch (Exception ex){
            System.out.println(ex);
        }
    }
}
