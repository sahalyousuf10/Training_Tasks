
import java.util.*;


public class SearchElement {

    public static void main(String[] args) {

        List<String> aList = new ArrayList<>();
        aList.add("");
        aList.add("Sahal");
        aList.add("Yousuf");
        aList.add("Nisum");
        aList.add("E");

        // By using .contains() method

        if (aList.contains("Sahal")){
            System.out.println("Sahal is in the ArrayList");
        }
        else
            System.out.println("Sahal is not in ArrayList");


        // By using .get Method
        System.out.println(aList.get(2));



        // By using .indexOf Method
        int index1 = aList.indexOf("Yousuf");
        int index2 = aList.indexOf("Sahal Yousuf");
        if(index1 == -1)
            System.out.println("The element Yousuf is not in the ArrayList");
        else
            System.out.println("The element Yousuf is in the ArrayList at index " + index1);
        if(index2 == -1)
            System.out.println("The element Sahal Yousuf is not in the ArrayList");
        else
            System.out.println("The element Sahal Yousuf is in the ArrayList at index " + index2);
    }
}



