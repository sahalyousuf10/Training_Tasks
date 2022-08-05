import java.lang.reflect.Array;
import java.util.*;
public class SearchLastElement {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("0");
        list1.add("9");
        list1.add("18");
        list1.add("27");
        list1.add("36");
        list1.add("45");
        list1.add("54");
        list1.add("63");
        list1.add("72");
        list1.add("81");
        list1.add("90");
        list1.add("99");

        long StartTime = System.currentTimeMillis();

        String Last1 = list1.get(list1.size()-1);

        System.out.println("The last item in ArrayList is: "+ Last1);

        long ArrayListTime = System.currentTimeMillis()-StartTime;

        System.out.println("\nArrayList seatch time is: "+ArrayListTime+" ms");

        LinkedList<String> list2 = new LinkedList<>();

        list2.add("0");
        list2.add("9");
        list2.add("18");
        list2.add("27");
        list2.add("36");
        list2.add("45");
        list2.add("54");
        list2.add("63");
        list2.add("72");
        list2.add("81");
        list2.add("90");
        list2.add("99");

        long StartTime2 = System.currentTimeMillis();

        String Last2 = list2.getLast();

        System.out.println("\nThe last item in LinkedList is: "+Last2);

        long LinkedListTime =System.currentTimeMillis()-StartTime2;

        System.out.println("\nLinkedList search time is: "+LinkedListTime+" ms");

        //Linked list is faster than arraylist!
        //LinkedList does not require bit shifting in memory but the ArrayList required bit shifting in memory
    }
}
