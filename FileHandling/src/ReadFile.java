import java.io.File;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {

        try {

            File f2 = new File("/Users/msahal/Documents/sahal.txt");

            Scanner read = new Scanner(f2);
            String fileData = null;
            while (read.hasNextLine()) {
                fileData = read.nextLine();
            }
            read.close();

            String[] str = fileData.split(" ");
            int freq = 0;
            int freq2 = 0;
            for (String word : str) {
                System.out.println(word);
                word = word.toLowerCase();
                freq++;
                    if (word.equals("is")){
                        freq2 = freq2+1;
                    }
            }
            System.out.println("\nFrequency of all words present in textfile are: "+freq);
            System.out.println("\nFrequency of specific word id: "+freq2);

        }

        catch (Exception ex){
            System.out.println("Exception detected: "+ex);
        }
    }
}
