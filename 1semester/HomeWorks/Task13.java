
public class Task13{

	public static void main(String[] args) {
	
		int x;
		int y;
		
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);
		
		if (args.length<2 ){
			System.out.println("Enter two numbers");
			System.exit(1);	
		}
		x = x + y;
		y = x - y;
    	x = x - y;
    	System.out.print( x + " " );
    	System.out.print( y);

	}
}