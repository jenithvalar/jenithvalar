import java.util.Arrays;
import java.util.List;
public class TwoLargestNumber{

    public static void main(String[] args) {

        int AsList[] = { 11, 22, 45, 92, 21, 54, 79, 11} ;

        int FirstLargestNumber = 0;
        int SecondLargestNumber = 0;

        // Check maximum element using for loop
        for (int i = 0; i < AsList.length; i++) {
            if (FirstLargestNumber < AsList[i]) {
                SecondLargestNumber = FirstLargestNumber;
                FirstLargestNumber = AsList[i];
            } else if (SecondLargestNumber < AsList[i]) {
                SecondLargestNumber = AsList[i];
            }
        }
        System.out.println(" The First largest number : " + FirstLargestNumber + " , The Second largest number : " + SecondLargestNumber);
    }
}