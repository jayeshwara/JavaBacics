package hashmap;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {

        HashMap<Integer, String> frt = new HashMap<Integer, String>();

        frt.put(1, "Apple");
        frt.put(2, "Grapes");
        frt.put(3, "Mango");
        frt.put(4, "citrus");
        frt.put(5, "Grapes");


        for (Map.Entry m : frt.entrySet()) {

            System.out.println("Fruits in the basket no.1 : "+m.getKey() + " " + m.getValue());
        }

        frt.put(3,"Apple");

        for (Map.Entry m : frt.entrySet()) {

            System.out.println("Fruits in the basket no.2 : "+m.getKey() + " " + m.getValue());
        }

        frt.remove(1);
        frt.remove(4);
        frt.put(5,"Mango");

        for (Map.Entry m : frt.entrySet()) {

            System.out.println("After removal , Fruits in the basket no.3 : "+m.getKey() + " " + m.getValue());
        }

    }

}
