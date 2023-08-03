package basics;

import java.util.Scanner;

public class ReverseNameWhileLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name = scan.nextLine();

        int n = name.length();
        int j = n - 1; // the n gets changed , because involve of - 1 . otherwise , it does not change .
        while (j >= 0) {
            System.out.print(name.charAt(j) + " "); // the i + " " which presents the 5 to 0 number . the a[i] which presents the array a[] holding consists .
            j--;
        }
    }
}