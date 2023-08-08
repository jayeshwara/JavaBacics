package basics;
import java.util.*;
public class ForeignFastFood {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        list.add("pizza");
        list.add("burger");
        list.add("sandwich");

        System.out.println(list);

        System.out.println("Choose the listed item : ");
        String food = scan.nextLine();

        // here customer have may enter any duplicate 5 letters . ie . the pizza word is of 5 letters .
        // so , allowance of exact word is important .

        int pizzaAmount = 100;
        int burgeramt = 200;
        int sandwichamt = 80;
        int balanceamt = 0;


        if (list.contains(food)) {
            switch (food) {
                case "pizza":
                    System.out.println("prize : " + pizzaAmount);

                    int paidamt = scan.nextInt();
                    System.out.println("paid amt : " + paidamt);
                    if (paidamt < pizzaAmount) {
                        System.out.println("Invalid amount");
                    } else {
                        balanceamt = paidamt - pizzaAmount;
                        System.out.println("Wait for the balance amt : " + balanceamt);
                    }
                    break;
                case "burger":
                    System.out.println("prize : " + burgeramt);

                    int burgerc = scan.nextInt(); // In foreign shop , money is getten first itself , from the customer . then only we show the paid amt .
                    System.out.println("paid amt : " + burgerc);
                    if (burgerc < burgeramt) {
                        System.out.println("Invalid amount");
                    } else {
                        balanceamt = burgerc - burgeramt;
                        System.out.println("Wait for the balance amt : " + balanceamt);
                    }
                    break;
                case "sandwich":
                    System.out.println("prize : " + sandwichamt);

                    int sandwichc = scan.nextInt();
                    System.out.println("paid amt : " + sandwichc);
                    if (sandwichc < sandwichamt) {
                        System.out.println("Invalid amount");
                    } else {
                        balanceamt = sandwichc - sandwichamt;
                        System.out.println("Wait for the balance amt : " + balanceamt);
                    }
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }else{
            System.out.println("Sorry sir, this food is not in our menu");
        }
    }
}
