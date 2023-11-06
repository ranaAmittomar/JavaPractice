package onlyjava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetFunc {
    public static void main(String[] args) {
        HashSet<Integer> i = new HashSet<>();
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(1);
        Iterator<Integer> h = i.iterator();
        while (h.hasNext()) {
            System.out.println(h.next()); // only print non duplicate.
        }
    }

}
