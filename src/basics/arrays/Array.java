package basics.arrays;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int n = scan.nextInt(); // 3
        System.out.print("Enter the value's : "); // 2 4 1
        int a[] = new int[n];
        int sum = 0;
        int i = 0;
        do {
            a[i] = scan.nextInt();
            sum = sum + a[i];
            i++;
        } while (i < n);
        System.out.println(sum + " ");
    }
}

