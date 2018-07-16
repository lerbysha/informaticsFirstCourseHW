class Task4 {
	public static void main(String[] args){
		int k = 0;
		int x = 0;
		float summ = 0.0f;
		float value = 0.0f;

		if(args.length < 2){
			System.out.println("Please enter two numbers.");
			System.exit(1);
		}
		if (x==0){
			System.out.println("Dividing by zero is forbidden");
			System.exit(1);
		}
		else{
			k = Integer.parseInt(args[0]);
			x = Integer.parseInt(args[1]);

			if (k == 0) {
				summ = 1 + 1/x;
			} 
			else{
				value = k + 1 + 1/x;

				for(int i = k ; i > 0 ; i--){
					summ =  (i + (x / value)); 
					value = summ;
				}
			}
		}
		System.out.println(summ);
	}
}