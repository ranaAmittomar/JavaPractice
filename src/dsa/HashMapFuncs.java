package dsa;

import java.util.HashMap;
import java.util.Map;

public class HashMapFuncs {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Tomar");
        map.put(2, "AMit");
        map.put(3, "Sw");

        // map.clear(); clearing all the mapping to keys.
        // No Duplicacy
        // map.put(2, "Tomar");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            // System.out.println(m.getKey());
            // System.out.println(map.size());
            // System.out.println(map.isEmpty());
            // System.out.println(map.containsKey(3));
            System.out.println(m.getKey() + " " + m.getValue());
            System.out.println(map.containsValue("AMit"));
        }
        // System.out.println(map.get(1));
        System.out.println(map.keySet());
        map.replace(1, "Marshmallow"); //replace value at particular key.
        System.out.println(map.values()); //return all values.
    }
}
