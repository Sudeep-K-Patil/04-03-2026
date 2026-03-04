import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10,10,30,30,20};
        Arrays.sort(arr);

        int sec_largest = Integer.MIN_VALUE;
        boolean found = false;

        for(int i = arr.length - 2; i >= 0; i--) {
            if(arr[i] < arr[i+1]) {
                sec_largest = arr[i];
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println("The second largest number is: " + sec_largest);
        } else {
            System.out.println("There is no second largest number.");
        }
    }
}
