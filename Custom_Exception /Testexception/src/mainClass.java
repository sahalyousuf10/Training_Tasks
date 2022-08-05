public class mainClass {

    public static void main(String[] args) {

        TestException test = new TestException();

        String a= "";
        try {
            test.check(a);  //pass the string in TestException class
        }
        catch (NullStringException ex){

            System.out.println("There is an exception"); //If exception caught then print this statement
            System.out.println("Exception is: "+ex);

        }
    }
}
