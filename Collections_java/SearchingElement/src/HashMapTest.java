import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(15213,"Sahal"); //Adding values
        hm.put(15355,"Ahsan");
        hm.put(11,"a");
        hm.put(12,"c");
        hm.put(13,"d");

        System.out.println("Before adding duplicate values");

        System.out.println(hm);

        hm.put(14,"Sahal");
        hm.put(15,"Ahsan");

        System.out.println("After adding duplicate values");
        System.out.println(hm);  //Does support duplicate values

        hm.put(12,"f");
        hm.put(13,"g");  //Does not support duplicate values
        System.out.println(hm.get(12));

        System.out.println("After adding duplicate ID");
        System.out.println(hm);

        hm.put(16,null);
        hm.put(17,null);

        System.out.println("After adding null values");
        System.out.println(hm); // Contains more than one Null values

    }
}
