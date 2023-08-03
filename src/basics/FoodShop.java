package basics;

import java.util.*;

public class FoodShop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        String pizzaName = "pizza";
        String burgerName = "burger";
        String sandwichName = "sandwich";

        list.add(pizzaName);
        list.add(burgerName);
        list.add(sandwichName);

        int pizzaamt = 100;
        int burgeramt = 200;
        int sandwichamt = 80;
        // now the list consists of not a one data . it have of whole three data .

        // now , to check the customer is a educated or not . if not means , he's not a true customer .
        System.out.println(list);
        System.out.println("Choose the item : ");
        String str = scan.nextLine();

        if (list.contains(str)) {

            switch (str) {
                case "pizza":
                    System.out.println("You have selected the " + "pizza");
                    System.out.println("Amount of pizza is : " + pizzaamt);
                    break;
                case "burger":
                    System.out.println("You have selected the " + "burger");
                    System.out.println("Amount of burger is : " + burgeramt);
                    break;

                case "sandwich":
                    System.out.println("You have selected the " + "sandwich");
                    System.out.println("Amount of sandwich is : " + sandwichamt);
                    break;

                default:
                    System.out.println("Invalid Input");
                    break;

            }
        }

        int useramt = scan.nextInt(); // rearranging the position may takes effect .
        System.out.println("paid amount : " + useramt);

        // three times if and else is also possible . but , the having one problem . you may try out and see .
        int balance = 0;

        if (str.equalsIgnoreCase(pizzaName) && useramt < pizzaamt
                ||str.equalsIgnoreCase(burgerName) &&  useramt < burgeramt
                || str.equalsIgnoreCase(sandwichName) && useramt < sandwichamt) {
            System.out.println("pay the valid amount");
        } else if (useramt > pizzaamt) {
            balance = useramt - pizzaamt;
            System.out.println("Please wait to collect the balance amount : " + balance);
        } else if (useramt > burgeramt) {
            balance = useramt - burgeramt;
            System.out.println("Please wait to collect the balance amount : " + balance);
        } else if (useramt > sandwichamt) {
            balance = useramt - sandwichamt;
            System.out.println("Please wait to collect the balance amount : " + balance);
        }
    }
}

