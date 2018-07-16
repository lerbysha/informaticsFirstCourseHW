public class Task26 {

public static void main(String[] args) {

        int rows = Integer.parseInt(args[0]);

        if  ( args.length != 1) {
            System.out.println("Enter one argument");
            System.exit(1);
        }
        if ( rows < 0 || rows >= 14){
            System.out.println("Enter positive number or number smaller than 14");
            System.exit(1);
        }


        for(int i =0;i<rows;i++) {

            int number = 1;

            System.out.printf("%"+(rows-i)*2+"s","");

            for(int j=0;j<=i;j++) {

                System.out.printf("%4d",number);

                number = number * (i - j) / (j + 1);

            }

            System.out.println();

        }


    }

}

