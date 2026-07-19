package Array;
import java.util.*;

public class Basic {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        swap(arr, 0, 4);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
}
