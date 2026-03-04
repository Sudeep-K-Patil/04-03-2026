import java.util.*;

public class duplicate {
    public static void main(String[] args)
    {
        int[] arr = {1,1,3,5,3,3,4,5};
        int n = arr.length;


        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    System.out.print(arr[i]+" ");
                    break; 
                }
            }
        }
    }
}   
