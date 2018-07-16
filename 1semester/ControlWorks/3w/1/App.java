public class App {
    public static void main (String[] args){
        if (args.length != 1 ){
            System.out.println("Enter 1 number");
            System.exit(1);
        }
        int n = 0;
        n = Integer.parseInt(args[0]);
        System.out.println(Summ(n));
    }
    public static double Summ(int n ) {
        double summ = 0.0;
        for (double i = 1.0; i < n; i++) {
            summ = (Math.pow(i,5-i))/(5-i);

        }
        return summ;
    }

}
