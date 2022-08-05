public class TestException {

    void check(String str) throws NullStringException{

        if (str == null || str == ""){ //Check the string is null or not
            throw new NullStringException("The given string is null"); // if the string is null then throw exception
        }

        else {
            System.out.println("The String is correct"); // throw this string if the string is not null
        }
    }
}
