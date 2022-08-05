import java.util.HashSet;

public class HashSetTest {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();

        hs.add("Sahal");
        hs.add("Yousuf");
        hs.add("Ahsan");
        hs.add("Subhan");

        System.out.println("Before Adding Duplicate and null values");
        System.out.println(hs);

        hs.add("Sahal");   //Adding duplicate values
        hs.add("Ahsan");

        System.out.println("After Adding Duplicate values");
        System.out.println(hs); //Does not contain duplicate value

        hs.add(null);
        hs.add(null);

        System.out.println("After Adding Null values");
        System.out.println(hs);  // Contains single Null value because does'nt support duplicate values
    }
}
