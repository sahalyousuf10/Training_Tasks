public class CustomException {

    static void validate(int num) throws GreaterNumber {
        if (num > 100) {

            throw new GreaterNumber("Number is greater than 100");
        } else {
            System.out.println("Number is less than 100");
        }
    }
}
