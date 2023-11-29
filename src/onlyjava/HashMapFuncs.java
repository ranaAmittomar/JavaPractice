package onlyjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * The HashMapFuncs class demonstrates the use of the HashMap class to perform
 * various operations such as adding key-value pairs,
 * clearing the map,
 * checking for key or value existence, replacing values, and counting
 * occurrences of elements.
 */
public class HashMapFuncs {

    /**
     * Demonstrates various operations on a HashMap, such as adding key-value pairs,
     * clearing the map, checking for key or value existence, replacing values, and
     * printing the keys and values.
     */
    public static void hashMapFuncs() {

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
        map.replace(1, "Marshmallow"); // replace value at particular key.
        System.out.println(map.values()); // return all values.
    }

    /**
     * Counts the occurrences of numbers in an array using a HashMap and prints the
     * count for each number.
     */
    public static void countingNums() {

        int[] arr = { 1, 2, 3, 4, 4, 5, 5, 5 };
        Map<Integer, Integer> numCount = new HashMap<>();
        for (int num : arr) {
            numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        }

        for (Entry<Integer, Integer> entry : numCount.entrySet()) {
            System.out.println("Number " + entry.getKey() + " occurs " + entry.getValue() + " times.");
        }
    }

    /**
     * Counts the occurrences of strings in an array using a HashMap and prints the
     * count for each string.
     */
    public static void countingStrings() {
        String[] names = { "Amit", "Tomar", "Amit", "Singh" };
        Map<String, Integer> namesCount = new HashMap<>();
        for (String nam : names) {
            namesCount.put(nam, namesCount.getOrDefault(nam, 0) + 1);
        }
        for (Entry<String, Integer> entry : namesCount.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times.");
        }
    }

    public static void tryingHashMapInLoops() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Amit", 29);
        map.put("Tomar", 30);
        System.out.println(map);
        if (map.containsKey("Amit")) {
            System.out.println(map.put("Amit", 34));
        }
        System.out.println(map);

        // another way to iterate for keys or values in map separately.
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

    }

    /**
     * The entry point of the program, which calls the countingStrings() method,and
     * other methods.
     */
    public static void main(String[] args) {
        // countingNums();
        // hashMapFuncs();
        // countingStrings();
        tryingHashMapInLoops();

    }
}
