public class LargestNumbers {
    public static void main(String[] args) {

        int array[];
        array = new int[] {90, 54, 65, 23, 67, 88};

        int largest1, largest2, temp;

        largest1 = array[0];
        largest2 = array[1];

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > largest1)
            {
                largest2 = largest1;
                largest1 = array[i];
            }
            else if (array[i] > largest2 && array[i] != largest1)
            {
                largest2 = array[i];
            }
        }

        System.out.println ("The First largest is " + largest1);
        System.out.println ("The Second largest is " + largest2);

    }
}
