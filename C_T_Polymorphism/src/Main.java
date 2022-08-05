public class Main {
    public static void main(String[] args) {

        Area_of_shapes area = new Area_of_shapes();

        System.out.println("Area of Circle is: "+area.calculateArea((float)3.14, (float) 3.5));
        System.out.println("Area of Triangle is: "+area.calculateArea((float)3.8,(float) 4.8,2));
        System.out.println("Area of Rectangle is: "+area.calculateArea((double) 5.2,(float) 3.9));
    }
}
