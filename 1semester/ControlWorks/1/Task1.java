	import java.lang.Math;

public class Task1{

	public static void main(String[] args) {
	
		float x0 = 0.0f;
		float y0 = 0.0f;

		if (args.length != 2 ){
			System.out.println("Enter two numbers");
			System.exit(1);
		}

		x0 = Float.parseFloat(args[0]);
		y0 = Float.parseFloat(args[1]);

		if (x0==0){
			System.out.println("Dividing by zero is forbidden");
			System.exit(1);
		}

		if ( y0==Math.sin(x0)/x0 ){
			System.out.println("The dot lies on the graph");
		}
		else{
			System.out.println("The dot don't lies on the graph");
		}
	
	}
}