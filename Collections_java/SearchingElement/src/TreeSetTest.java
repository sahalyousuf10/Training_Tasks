import java.util.*;

public class TreeSetTest {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<String>();

        ts.add("Sahal");
        ts.add("Ahsan");
        ts.add("Ahmed");
        ts.add("Faisal");

        Iterator<String> i1=ts.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }

        ts.add("Sahal");
        ts.add("Ahsan");

        System.out.println("\nAfter adding duplicate values");
        Iterator<String> i2=ts.iterator();
        while(i2.hasNext())
        {
            System.out.println(i2.next());
        }

        System.out.println("\nRecord in descending order");
        Iterator<String> i3=ts.descendingIterator();
        while(i3.hasNext())
        {
            System.out.println(i3.next());
        }


        System.out.println("\nFirst element: "+ts.pollFirst());
        System.out.println("Last element: "+ts.pollLast());
    }
}
