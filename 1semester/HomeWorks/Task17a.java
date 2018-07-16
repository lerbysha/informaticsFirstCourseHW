public class Task17a { 

    public static void main(String [] args){  
    long number = 0;
    int basis = 0;
    

    if( args.length != 2){

		System.out.println("Enter two arguments");
		System.exit(1);
    } 
    number = Long.parseLong(args[0]);
    basis = Integer.parseInt(args[1]);

    if ( number < 0 || basis < 2 || basis > 10){
    	System.out.println("Enter positive numbers");
		System.exit(1);
    }
    String str = convertNumberToBasis(number , basis); 
    System.out.println(str + " " + str.length());
    }

    public static String convertNumberToBasis ( long number, int basis){
	    String numInBasis = "";
    	while  (number > 0){
    		numInBasis = number % basis + numInBasis;
    		number /= basis;
        }
        return numInBasis;
    }

    public static int sumOfNumbers (String numInBasis){

	int sum = Integer.parseInt(numInBasis);
	int count = 0;
	while (sum != 0) {
            count++;
            sum /= 10;
        }
        return count;
    }
	

  	






}    

