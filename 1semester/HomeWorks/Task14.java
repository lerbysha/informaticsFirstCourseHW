public class Task14{
	
	public static void main(String[] args) {
	
		int x;
		x = Integer.parseInt(args[0]);
		int fac =1;
		if (args.length!=1 ){
				System.out.println("Enter one number");
				System.exit(1);	
		}
		for(int i =1 ; i< x+1; i++){
			fac *= i;
		}
		System.out.println (fac);

	}



}