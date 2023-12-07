package onlyjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOfList {

    public static void listOfList() {
        List<List<Integer>> arrList = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        l1.add(56);
        l1.add(23);
        l2.add(22);
        l2.add(44);
        arrList.add(l1);
        arrList.add(l2);
        System.out.println(arrList);
        for (List<Integer> sublist : arrList) {
            // Iterate over the elements of each sublist
            for (Integer element : sublist) {
                System.out.print(element + " ");
            }
            System.out.println(); // Move to the next line after printing each sublist
        }
        getElements(arrList);
    }

    public static void getElements(List<List<Integer>> arrList) {
        String element = "The first elements at index :- " + arrList.get(0) + " is " + arrList.get(0).get(0);
        System.out.println(element);
        Collections.sort(arrList, (l1, l2) -> l1.get(0).compareTo(l2.get(0)));
        System.out.println("List after sorted :- " + arrList);
    }

    public static void main(String[] args) {
        listOfList();
    }
}
