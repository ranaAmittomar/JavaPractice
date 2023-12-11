package Graphs;

import java.util.*;

import Graphs.GraphQues.Edge;
import Graphs.GraphQues.Pair;

public class DfsOfGraph {

    public static void createBasicGraphWithoutWeight(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) { // changing null value with empty arraylist on every index.
            graph[i] = new ArrayList<Edge>(); // if we add directly to null index, then it'll throw error.
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));
        graph[2].add(new Edge(2, 4, 3));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
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

    public static boolean isCycleUndirected(ArrayList<Edge>[] graph, boolean[] visited, int currVert, int parent) {
        visited[currVert] = true;
        for (int i = 0; i < graph[currVert].size(); i++) {
            Edge e = graph[currVert].get(i); // getting neighbor..
            if (visited[e.destination] && e.destination != parent) {
                return true;
            } else if (!visited[currVert]) {
                if (isCycleUndirected(graph, visited, e.destination, currVert))
                    return true;
            }
        }
        return false;
    }

    // Time Complexity -> O( E + ElogV )
    public static void dijKstras(ArrayList<Edge>[] graph, int src, int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(); // importing the Pair from inner class inside GraphQues.java
                                                        // file.
        int dist[] = new int[V];
        for (int i = 0; i < V; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean visited[] = new boolean[V];
        pq.add(new Pair(src, 0)); // check pair inner class in graphques.java file.

        while (!pq.isEmpty()) {
            Pair curr = pq.remove(); // shortest distance pair, bcoj till now,priority queue has already sorted and
                                     // returned.

            if (!visited[curr.node]) {
                visited[curr.node] = true;
                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    int u = e.source;
                    int v = e.destination;
                    if (dist[u] + e.weight < dist[v]) { // relaxation in theory.
                        System.out.println("Value of u " + u + " and v " + v);

                        dist[v] = dist[u] + e.weight;
                        pq.add(new Pair(v, dist[v]));

                    }
                }
            }

        }
        for (int i = 0; i < V; i++) {
            System.out.print(dist[i] + " ");
        }
    }

    public static void bellmanFordAlgo(ArrayList<Edge>[] graph, int src, int V) {
        int[] dist = new int[V]; // distance matrix to keep shortest distance track.
        // distance intialisation with infinity.
        for (int i = 0; i < V; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        // main code for Bellman ford
        for (int k = 0; k < V - 1; k++) { // O ( V ) , for -> no. of nodes
            // O ( E ) for -> no . edges
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < graph[i].size(); j++) { // finding all neighboring edges.
                    Edge e = graph[i].get(j);
                    // getting source and desti.
                    int u = e.source;
                    int v = e.destination;
                    // condtion to update and relaxation for distance.
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + e.weight < dist[v]) {
                        dist[v] = dist[u] + e.weight;
                    }
                }
            }
        }
        // printing all distance...
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
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
        // topoSortPrint(graph, V);
        dijKstras(graph, 0, V);
    }
}
