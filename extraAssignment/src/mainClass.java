public class mainClass {

    public static void main(String[] args) {

        CustomException ce = new CustomException();
        try
        {
            // calling the method
            ce.validate(500);
        }
        catch (GreaterNumber ex)
        {
            System.out.println("Caught the exception");

            // printing the message from InvalidAgeException object
            System.out.println("Exception occured: " + ex);
        }
    }
}
