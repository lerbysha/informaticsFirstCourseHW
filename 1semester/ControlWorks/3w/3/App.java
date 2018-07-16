public class App {
    public static void main(String[] args) {

        float x0 = 0.0f;
        float y0 = 0.0f;

        if (args.length != 2) {
            System.out.println("Enter two numbers");
            System.exit(1);
        }

        x0 = Float.parseFloat(args[0]);
        y0 = Float.parseFloat(args[1]);

        if (x0 > 0) {
            System.out.println("Enter x more than 0");
            System.exit(1);
        }

        if (y0 == Math.log(x0)) {
            System.out.println("The dot lies on the graph");
        } else {
            System.out.println("The dot don't lies on the graph");
        }

    }
}
