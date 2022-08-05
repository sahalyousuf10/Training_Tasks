import java.io.*;
public class ReadFile {

    public static void main(String[] args) {

                BufferedReader br = null;
                String strLine = "";
                try
                {
                    LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("/Users/msahal/Documents/sahal.txt"), "UTF-8"));
                    while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= 4)
                    {
                        System.out.println(strLine);
                    }
                    reader.close();
                }
                catch (IOException e)
                {
                    System.err.println(e);
                }
            }
        }
