package ClassObject;

import java.util.Scanner;

public class ClassSecondWithObject {

    public static void main(String[]args) {

    TwoClassOneObject obj = new TwoClassOneObject();

        int pizzamt = 200;

        Scanner scan = new Scanner(System.in);

        int paidamt = scan.nextInt();
        System.out.println("paid amt : " + paidamt);

        //System.out.println("Balance Amount : "+obj.sub(paidamt, pizzamt));

       int result= obj.sub(paidamt, pizzamt);
        System.out.println("Balance Amount : "+result);
}
}
