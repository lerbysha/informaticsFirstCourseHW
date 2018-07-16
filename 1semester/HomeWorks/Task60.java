public class Task60 {

	int a ;
	int amount = 10 ;
	int i = 1 ;
	int n = 0 ;


	public static void main(String[] args) {
			if ( args.length < 1 ){
				System.out.println( "Enter one number, please.");
				System.exit(1);
			}
		    a = Integer.parseInt(args[0]);
		    System.out.println(calcAmount(a));	
		}


	public int calcAmount(int arr ){
		if ( i < arr ){
			if ( i % 2 == 1 ){
				n = n + 1 ;
			} 
			else {
				n = n - 2 ;
			}
			return n ;
			amount = amount + calcAmount( i + 1 ); 
		}
		
	}

	
}