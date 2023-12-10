package Graphs;

import java.util.*;

import Graphs.GraphQues.Edge;

public class DfsOfGraph {

    public static void createBasicGraphWithoutWeight(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) { // changing null value with empty arraylist on every index.
            graph[i] = new ArrayList<Edge>(); // if we add directly to null index, then it'll throw error.
        }

        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void dfs(ArrayList<Edge> graph[], int currVert, boolean visted[]) {
        System.out.print(currVert + " ");
        visted[currVert] = true;
        for (int i = 0; i < graph[currVert].size(); i++) {
            Edge e = graph[currVert].get(i);
            if (visted[e.destination] == false)
                dfs(graph, e.destination, visted);
        }
    }

    public static void allPaths(ArrayList<Edge> graph[], boolean visited[], int curr, String path, int target) {
        if (curr == target) {
            System.out.print(path);
            return;
        }
        for (int i = 0; i < graph[curr].size(); i++) { // loop tp get neighboring edges.
            Edge e = graph[curr].get(i);
            if (!visited[e.destination]) {
                visited[curr] = true;
                allPaths(graph, visited, e.destination, path + e.destination, target);
                visited[curr] = false;
            }
        }
    }

    public static boolean cycleDetection(ArrayList<Edge> graph[], boolean visited[], int curr, boolean recStack[]) {
        visited[curr] = true;
        recStack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i); // got all the neighbors.
            if (recStack[e.destination]) {
                return true;
            } else if (!visited[e.destination]) {
                if (cycleDetection(graph, visited, e.destination, recStack)) {
                    return true;
                }
            }
        }
        recStack[curr] = false;
        return false;

    }

    public static void topoSortUtil(ArrayList<Edge> graph[], int currVert, boolean visited[], Stack<Integer> stack) {

        visited[currVert] = true;
        for (int i = 0; i < graph[currVert].size(); i++) {
            Edge e = graph[currVert].get(i);
            if (!visited[currVert]) {
                topoSortUtil(graph, e.destination, visited, stack);
            }
        }
        stack.push(currVert);
    }

    public static void topoSortPrint(ArrayList<Edge> graph[], int V) {
        boolean visited[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topoSortUtil(graph, i, visited, stack);
            }
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        boolean visited[] = new boolean[V];
        boolean recStack[] = new boolean[V];
        createBasicGraphWithoutWeight(graph);
        // for (int i = 0; i < V; i++) {
        // if (!visited[i]) {
        // dfs(graph, i, visited);
        // }
        // }
        // int src = 0, target = 3;
        // allPaths(graph, visited, src, "0", target);
        /*
         * 
         * for (int i = 0; i < V; i++) {
         * if (!visited[i]) {
         * boolean isCycle = cycleDetection(graph, visited, 0, recStack);
         * if (isCycle) {
         * System.out.println(isCycle);
         * break;
         * }
         * }
         * }
         */
        topoSortPrint(graph, V);
    }
}
