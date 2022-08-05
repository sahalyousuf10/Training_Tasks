import java.util.*;
public class HashTableTest {

    public static void main(String[] args) {

        Hashtable<Integer,String> ht=new Hashtable<>();

        ht.put(100,"Sahal");
        ht.put(102,"Ahsan");
        ht.put(101,"Muneeb");
        ht.put(103,"Shoaib");

        System.out.println(ht);

        ht.remove(102);

        System.out.println("\nAfter remove a record \n"+ht);

        System.out.println("\nGet value of 101: "+ht.get(101));

        ht.put(103,"Shoaib");

        System.out.println("\nAfter adding duplicate values\n"+ht);

        System.out.println(ht.getOrDefault(105, "\nNot Found"));
        System.out.println(ht.getOrDefault(100, "\nNot Found"));

    }
}
