public class Task17 { 

    public static void main(String [] args){  
    long number = 0;
    int basis = 0;
    String dasns;
    

    if( args.length != 3){

		System.out.println("Enter two arguments");
		System.exit(1);
    } 
    number = Long.parseLong(args[0]);
    basis = Integer.parseInt(args[1]);
    dasns = args[2];

    if ( number < 0 || basis < 2 || basis > 10){
    	System.out.println("Enter positive numbers");
		System.exit(1);
	}
	String numInBasis = "";
	while  (number > 0){
		numInBasis = number % basis + numInBasis;
		number /= basis;
	}
	int sum = Integer.parseInt(numInBasis);
	int count = 0;
	while (sum != 0) {
            count++;
            sum /= 10;
        }
	System.out.println( numInBasis + " " + count);
    System.out.println(dasns);
  	





    }
}    

