
class Task2	 {
	public static void main(String[] args) {
	    float rad;
	    float PI = 3.14f;
		if (args.length<1 ){
				System.out.println("Enter one number");
				System.exit(1);
			}
			rad = Float.parseFloat(args[0]);
			if (rad<0){
				System.out.println("Don't enter negative number");
				System.exit(1);
				}
	 
	    System.out.println("Length = "+(PI*2*rad))  ;
		System.out.println("Squad = "+PI*(rad*rad));
	}
}