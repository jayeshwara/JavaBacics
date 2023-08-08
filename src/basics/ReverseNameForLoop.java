package basics;

import java.util.*;

public class ReverseNameForLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name = scan.nextLine();

        int n = name.length();

        for (int i = n - 1; i >= 0; i--) {

            System.out.print(name.charAt(i) + " ");  // the i + " " which presents the 5 to 0 number . the a[i] which presents the array a[] holding consists .

        }
    }
}

