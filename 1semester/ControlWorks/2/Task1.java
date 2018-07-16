import java.util.Scanner;
import java.util.Arrays;

public class Task1{

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		int k = scan.nextInt();
        
        int[] arr = new int[k];

        for(int i = 0; i < k; i++) {
            arr[i] = scan.nextInt();
        }


		for (int i=0; i < squareOfNextNumber.lenght(); i++){		
			System.out.println(squareOfNextNumber[i] + " ");
		}
		
	}

	public static int[] squareOfNextNumber (int [] arr){
		int[] arr2 = Arrays.copyOf(arr, arr.length);

		arr2[0] = 0;

		for (int i = 0 ; i < arr.length ; i++ ){
			arr2[i+1]= arr[i]*arr[i];

		}
		
		return arr2;
	}
}