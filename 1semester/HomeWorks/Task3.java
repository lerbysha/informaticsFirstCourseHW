

class Task3{
	public static void main(String[] args) {
		float n;
		if (args.length<1 ){
			System.out.println("Enter one number");
			System.exit(1);
		}
		n = Float.parseFloat(args[0]);		if (n<0){
			System.out.println("Error");
			System.exit(1);
		}
		float result = 1;
		for (int i=2;i<n;i+=2){
			result *= i*i/((i-1)*(i+1.0));
		}
		System.out.println(result*2);
	}

}
