import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        
        int[] arr = new int[k];
        
        for(int i = 0; i < k; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        int m = scan.nextInt();
        
    }
    
    public static void split(int[] arr, int n){
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        
        
    }

    
}
