public class Task20 {

	public static void main(String[] args) {

		if(args.length<1){

			System.out.println("Enter at least one argument");
			System.exit(1);
		}
		else{

			int n=Integer.parseInt(args[0]);
			if (n<1) {

				System.out.println("Incorrect data");
				System.exit(1);
			}
			
			else {
				for (int i=n; i>=Math.sqrt(n); i--) {
					if (n%i==0) {
						System.out.println(i);
						System.out.println(n/i);
					}
				}
			}
		}
	}
}