package basics.arrays;

public class NumberUseOfContinueKeyword {

    public static void main(String[]args) {

        for(int i = 1 ; i <= 10 ; i ++) {

            // all the i values need to come inside the loop .
            if(i <= 5) {

                continue ;
                                // ie . if the present condition is trued means , when we give continue keyword , on there , it gives a chance to next number . whether the next condition is also in true manner or not .
            }

            System.out.println(i+ " ");


        }
    }
}
