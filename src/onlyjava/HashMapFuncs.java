package onlyjava;

import java.util.HashMap;
import java.util.HashSet;
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
            System.out.println(entry.getKey() + "" + entry.getValue() + "s");
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

    public static void isomorphicString() { // function to check if the string is Isomorphic or not.
        int[] map1 = new int[200];
        int[] map2 = new int[200];
        String s = "foo";
        String t = "bar";
        // edge case
        if (s.length() != t.length()) {
            System.out.println("Not possible.");
        }

        for (int i = 0; i < s.length(); i++) {
            if (map1[s.charAt(i)] != map2[t.charAt(i)]) {
                System.out.println("Elements are different.");
            }
            map1[s.charAt(i)] = i + 1;
            map2[t.charAt(i)] = i + 1;
        }
        System.out.println("Done.");
    }

    public static boolean isValidAnagram() {
        String s = "anagram";
        String t = "nagaram";
        if (s.length() != t.length()) {
            return false;
        }
        int[] char_count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char_count[s.charAt(i) - 'a']++;
            char_count[t.charAt(i) - 'a']--;
        }
        for (int count : char_count) {
            if (count != 0)
                return false;
        }
        return true;
    }

    public static boolean isHappyNumber() {

        int n = 61;
        Set<Integer> usedNumber = new HashSet<>();
        while (true) {
            int sum = 0;
            sum += Math.pow(n % 10, 2.0);
            n = n / 10;
            if (n == 1)
                return true;
            n = sum;
            if (usedNumber.contains(n))
                return false;
            usedNumber.add(n);
        }

    }

    public static boolean containsDuplicate() {
        int[] arr = { 1, 2, 3, 2 };
        Set<Integer> presentInteger = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {

            if (presentInteger.contains(arr[i]))
                return true;
            presentInteger.add(arr[i]);
        }
        return false;
    }

    public static boolean containsDuplicateII() {
        int[] nums = { 1, 0, 1, 1 };
        int k = 3;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int in = nums[i];
            if (map.containsKey(in) && i - map.get(in) <= k)
                return true;
            map.put(in, i);
        }
        return false;
    }

    public static int longestLenConsNum() {
        int[] arr = { 0, 1, 6, -1, 2, -2, 3, 4, 5, 6, 7, 8 };
        int longestLen = 0;
        Map<Integer, Boolean> exploredMap = new HashMap<>();
        for (int num : arr) {
            exploredMap.put(num, Boolean.FALSE);
        }
        for (int num : arr) {
            int currentLen = 1;
            // forward number check
            int nextNum = num + 1;
            while (exploredMap.containsKey(nextNum) && exploredMap.get(nextNum) == false) {
                currentLen++;
                exploredMap.put(nextNum, Boolean.TRUE);
                nextNum++;
            }
            // backward number check.
            int prevNum = num - 1;
            while (exploredMap.containsKey(prevNum) && exploredMap.get(prevNum) == false) {
                currentLen++;
                exploredMap.put(prevNum, Boolean.TRUE);
                prevNum--;
            }
            longestLen = Math.max(longestLen, currentLen);
        }
        return longestLen;
    }

    public static void askingNumIndex() {
        int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int nu = 5;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            map.put(i, ar[i]);
        }
        System.out.println(map.get(2));
        if (map.containsValue(nu)) {
            for (int index : map.keySet()) {
                if (map.get(index) == nu) {
                    System.out.println("Present at index :- " + index);
                }
            }
        } else {
            System.out.println("false");
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
        // System.out.println(isValidAnagram());
        // // isomorphicString();
        // // tryingHashMapInLoops();
        // System.out.println("Happy Num: " + isHappyNumber());
        // System.out.println("Contains Duplicate: " + containsDuplicate());
        // System.out.println("contains DuplicateII : " + containsDuplicateII());
        // System.out.println("Longest Number Check: " + longestLenConsNum());
        askingNumIndex();
    }
}
