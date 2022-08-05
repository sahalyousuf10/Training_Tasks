public class Test {

    public static void main(String[] args) {

        String name = "I love to do programming in Java !!";

        String[] arr;
        arr = new String[10];
        arr = name.split(" ");

        for (int i=0; i< arr.length; i++){
            String name3 = arr[i];
            System.out.print(name3);
        }
    }
}
