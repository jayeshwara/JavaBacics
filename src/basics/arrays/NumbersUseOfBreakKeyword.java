package basics.arrays;

public class NumbersUseOfBreakKeyword {

    public static void main(String[]args) {

        for(int i = 1 ; i <= 10 ; i ++) {

            if(i==6) {

                break; // when we use the break keyword , it does not give a chance , upto the zth number .

            }
            System.out.println(i+ " ");
        }
    }
}
