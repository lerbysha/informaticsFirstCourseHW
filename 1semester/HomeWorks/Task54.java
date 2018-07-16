public class Task54{

	public static int f(int index) {
        if (index <= 0) {
            return -1;
        } else if (index == 1) {
            return 1;
        } else if (index == 2) {
            return 1;
        } else {
            return f(index - 1) + f(index - 2);
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        if ( args.length < 1 ){
			System.out.println( "Enter one number, please.");
			System.exit(1);
		}

        for (int i = 1; i <= n; i++) {
            System.out.print(f(i) + " ");
        }
    }
}