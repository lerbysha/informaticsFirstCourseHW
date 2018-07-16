public class App {
    public static void main (String[] args ){
        if (args.length != 2 ){
            System.out.println("Enter text and number");
            System.exit(1);
        }
        int n = Integer.parseInt(args[1]);
        if(n<=0){
            System.out.println("Enter NUMBER ");
            System.exit(1);
        }
        String k = args[0];
        for( int i =0 ;i <n; i++ ){
            System.out.println(k);

        }
    }
}
