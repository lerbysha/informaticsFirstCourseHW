public class Arrays{

	public static void main(String[] args) {


		if (args.length<3 ){
			System.out.println("Enter at least 3 numbers.");
			System.exit(1);	
		}

		int[] sides ;
		int side = args.length;
		sides = new int[side];
		int P = 0;

		for ( int i = 0; i< side;i++ ){
			sides[i] = Integer.parseInt (args[i]);
		}
		for ( int i = 0; i< side;i++ ){
			P += sides[i];
		}
		
		System.out.println(P);
	}



}