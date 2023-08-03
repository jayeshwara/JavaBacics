package basics;

import java.util.Scanner;

public class Foodies {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose the item : ");
        String name = scan.nextLine();

        if (name.equalsIgnoreCase("pizza")) {

            System.out.println("Given amt : ");
            double amt = scan.nextDouble();
            double prize = 250;

            if (amt <= prize) {
                System.out.println("insufficient amt");
            }
            double bal = amt - prize;
            System.out.println("your balance amt is :" + bal);

        } else {
            System.out.println("Invalid Input");
        }
    }
}