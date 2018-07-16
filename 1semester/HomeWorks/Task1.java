class Task1 {
	public static void main(String[] args) {
		float stopWatch;
		if (args.length<1 ){
			System.out.println("Enter one number");
			System.exit(1);
		}
		stopWatch = Float.parseFloat(args[0]);
		if (stopWatch<0){
			System.out.println("Time cann't be less than zero");
			System.exit(1);
		} 
		float result = (stopWatch*stopWatch)*9.8f/2f;
    	System.out.printf("%.0f",result);
	}
}