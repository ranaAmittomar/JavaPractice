package leetcode_questions;


import java.util.*;

/*
* You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi.
* Return the destination city, that is, the city without any path outgoing to another city.

It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.



Example 1:

Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
Output: "Sao Paulo"
Explanation: Starting at "London" city you will reach "São Paulo" city which is the destination city.
* Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".
* */
public class DestinationCity {
    public static String destination(List<List<String>> paths) {
        Set<String> cities = new HashSet<>();
        for (List<String> path : paths) {
            cities.add(path.get(0));
        }
        for (List<String> path : paths) {
            String destination = path.get(1); //passing every city in destination
            if (!cities.contains(destination)) { //checking if destination cities are in cities SET.
                return destination;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        List<List<String>> cities = new ArrayList<>();
        cities.add(List.of("London", "New York"));
        cities.add(List.of("New York", "Lima"));
        cities.add(List.of("Lima", "Sao Paulo"));
        System.out.println(destination(cities));

     

    }

}
