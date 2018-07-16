public class Task19 { 

    public static void main(String [] args){    

	    if( args.length < 1){

			System.out.println("Enter at least one argument");
			System.exit(1);
	    } 
		int x = Integer.parseInt(args[0]);
		String  str = "";
		String st = convertToBinary(x,str);
		System.out.println(countNumbers(st));
	}

	 
	public static String convertToBinary(int x , String str){

	    for (int i = x; i!= 0; i/=2) {
	   		str += (i % 2);
	   		x /= 2;
	    }
	    while (x != 0) {
		   	str += (x % 2);
			x /= 2;
   		}
   		return str;
   	}

   	public static int countNumbers ( String st ){
	    String b = new StrnigBuffer(st).reverse().toString();
		int a = Integer.parseInt(b);
		int max = 0;
		int counter = 0;

		while (a != 0) {
			if (a%10 == 1) {
				counter++;
				a /= 10;
				if (a == 0) {
					max = counter;
				}
			}
			else {
				if (counter > max) {
					max = counter;
				}	
				a /= 10;
				counter=0;
			}
		}
	return max;
	}
}