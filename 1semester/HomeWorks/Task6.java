public class Task6{
	
	public static void main(String[] args) {
	
		int x;
		x = Integer.parseInt(args[0]);
		if (args.length!=1 ){
				System.out.println("Enter one number");
				System.exit(1);	
		}
		if (x<0){
			System.out.println("Natural number please.");
			System.exit(1);
		} 
		float result = 0;
		int r = 1;
		for (int i = 1; i < x+1; i++){
			for (int j = 0; j < x-2; j++){
				r = r * (i-1);
			}
			int rr = r * r;
			if (r <2){
				rr = 1;
			}
			float den = 0;
			int k = 2 * i;
			for ( int l = 0; l<k-1; l++){
				den = k*(k-1);
			} 
		    float m = rr/den;
		    result = result + m;
		}
		System.out.println(result);
	}
}