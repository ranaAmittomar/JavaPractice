package onlyjava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetFunc {
    public static void main(String[] args) {
        HashSet<String> i = new HashSet<>();
        i.add("Amit");
        i.add("Tomar");
        i.add("Amit");
        int count = 0;
        Iterator<String> s = i.iterator();
        while(s.hasNext()){ //the count will only increment , if we use any other data structure , WHY?
            //Because , in HashSet() , the data will not be added if it is duplicated.
            String current = s.next()
;           if (current.equals("Amit")) {
                count++; //so , it'll only increment once.
            }
        }
        System.out.println(count);
      /*  i.add(1);
        i.add(2);
        i.add(3);
        i.add(1);
        Iterator<Integer> h = i.iterator();
        while (h.hasNext()) {
            System.out.println(h.next()); // only print non duplicate.
        }*/

    }

}
