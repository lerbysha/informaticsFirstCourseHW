public class Task54a{


	 public static void main(String[] args) {

        int n = Integer.parseInt (args[0]);
        
        if ( args.length < 1 ){
			System.out.println( "Enter one number, please.");
			System.exit(1);
		}

        int a = 1, b = 1;
        System.out.print(a + " " + b);
        int fib = 2, i = 2;
        while (i < n) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(" " + fib);
            i++;
        }
    }
}