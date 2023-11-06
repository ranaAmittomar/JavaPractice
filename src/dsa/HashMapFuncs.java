package dsa;

import java.util.HashMap;
import java.util.Map;

public class HashMapFuncs {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Mang");
        map.put(2, "Amit");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        // No Duplicacy
        map.put(2, "Tomar");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey());
        }

    }
}
