package methods;

import java.util.Scanner;

public class MethodExample {

    // level 1 - both numbers are provided statically .
   /* public static void sub(int pizzamt, int customeramt) {

        System.out.println(customeramt - pizzamt);

    }


    public static void main(String[] args) {

        sub(400, 200);
    }
} */

    // level 2 - In both numbers , one is static and another is , from the customer bought .
    public static void main(String[] args) {

        int pizzamt = 200;

        Scanner scan = new Scanner(System.in);

        int paidamt = scan.nextInt();
        System.out.println("paid amt : " + paidamt);

        sub(paidamt , pizzamt); // sub(paidamt , 200)

    }

    public static void sub(int paidamt, int pizzamt) {

        System.out.println(paidamt - pizzamt);
    }
}




