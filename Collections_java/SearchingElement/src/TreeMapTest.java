import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

    void display(int key, Laptop Laptop) {

        System.out.println(key+". Brand: "+Laptop.brand+" Processor: "+Laptop.processor+" Model: "+Laptop.model+" Ram: "+Laptop.ram+"gb Size: "+Laptop.size+" inches Rom: "+Laptop.rom+"gb");

        }

    public static void main(String[] args) {

        TreeMapTest ts = new TreeMapTest();
        TreeMap<Integer,Laptop> tmap = new TreeMap<>();

        Laptop lp1 = new Laptop(2015, 16, 15, 750, "Apple", "Core i7");
        Laptop lp2 = new Laptop(2012, 8, 12, 500, "HP", "Core i3");
        Laptop lp3 = new Laptop(2017, 12, 15, 750, "Dell", "Core i5");
        Laptop lp4 = new Laptop(2019, 24, 17, 320, "Lenovo", "Core i9");
        Laptop lp5 = new Laptop(2016, 32, 14, 250, "Toshiba", "Core i5");

        tmap.put(1, lp1);
        tmap.put(2, lp2);
        tmap.put(3, lp3);
        tmap.put(4, lp4);
        tmap.put(5, lp5);

        System.out.print("Laptop Details:\n");

        for (Map.Entry<Integer, Laptop> entry:tmap.entrySet()) {
            ts.display(entry.getKey(), entry.getValue());
        }

        tmap.remove(4);
        System.out.println("\nAfter removing record number 4\n\nLaptop Details:");

        for (Map.Entry<Integer, Laptop> entry:tmap.entrySet()) {
            ts.display(entry.getKey(), entry.getValue());
        }

        System.out.println("\nRecord in descending order\n\nLaptop Details:");

        for (Map.Entry<Integer, Laptop> entry:tmap.descendingMap().entrySet()) {
            ts.display(entry.getKey(), entry.getValue());
        }

        System.out.println("\nRecord in Less than equals to 3\n\nLaptop Details:");

        for (Map.Entry<Integer, Laptop> entry:tmap.headMap(3, true).entrySet()) {
            ts.display(entry.getKey(), entry.getValue());
        }

        System.out.println("\nRecord in greater than equals to 2\n\nLaptop Details:");

        for (Map.Entry<Integer, Laptop> entry:tmap.tailMap(2, true).entrySet()) {
            ts.display(entry.getKey(), entry.getValue());
        }

        System.out.println("\nRecord in in between 2 and 4\n\nLaptop Details:");

        for (Map.Entry<Integer, Laptop> entry:tmap.subMap(2, false, 4, true).entrySet()) {
            ts.display(entry.getKey(), entry.getValue());
        }
    }
}