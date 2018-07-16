public class Task2 {

	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);
		
		if (args.length!=1 ){
				System.out.println("Enter one number");
				System.exit(1);	
		}

		int abc = n / 1000;	// First 3 numbers
		int def = n % 1000;	// Last 3 numbers 

		abc = (abc / 100) + (abc % 100 / 10) + (abc % 10);
		def = (def / 100) + (def % 100 / 10) + (def % 10);

		if (abc == def) {
			System.out.println("You're lucky");
		}
		else {
			System.out.println("You're not lucky. Sorry.");
		}
	}

}
