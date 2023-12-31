package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CollectionProgram {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Grapes");
        list.add("Mango");
        list.add("citrus");
        list.add("Grapes");

        System.out.println("Before removal of duplicate fruit : "+list);

        if (list.contains("Grapes")) {
                list.remove("Grapes"); // Index no.1 is removed . because , the arraylist follows insertion order
        } else {
            System.out.println("No presence of duplicate");
        }

        for(String fruit : list) {
            System.out.println("After removal of duplicate fruits : "+fruit);
        }

      /*  Iterator iterate = list.iterator();

        while(iterate.hasNext()) {
            System.out.println("After removal of duplicate : "+iterate.next());
        }*/

    }
}
