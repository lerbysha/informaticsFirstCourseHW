public class Task3 {

	public static void main(String[] args) {
		int k = 0;
		float x = 0;
		float summ = 0.0f;
		float value = 0.0f;

		if (args.length != 2 ){
			System.out.println("Enter two numbers");
			System.exit(1);
		}

		k = Integer.parseInt(args[0]);
		x = Float.parseFloat(args[1]);

		if (k == 0) {
			summ = 1 + 1/x;
		} 
		else{
			value = k + 1 + 1/x;

			for(int i = k 	; i > 0 ; i--){
				summ =  (1 + (1/x / value)); 
				value = summ;
			}

		}
		System.out.println(summ);

	}
		
}


