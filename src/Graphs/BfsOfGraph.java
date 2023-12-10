package Graphs;

import java.util.*;

import Graphs.GraphQues.Edge;;

public class BfsOfGraph {

    public static void createBasicGraphWithoutWeight(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) { // changing null value with empty arraylist on every index.
            graph[i] = new ArrayList<Edge>(); // if we add directly to null index, then it'll throw error.
        }
        graph[0].add(new Edge(0, 1));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
        graph[4].add(new Edge(4, 6));
        graph[5].add(new Edge(5, 7));
        graph[6].add(new Edge(6, 4));
        graph[7].add(new Edge(7, 5));
    }

    public static void bfs(ArrayList<Edge> graph[], int V, boolean visited[], int start) {
        // we need to create Queue and Visited node array.
        Queue<Integer> q = new LinkedList<>();

        q.add(start); // it can be anything ( the starting point of graph ).

        while (!q.isEmpty()) {
            int currVert = q.remove();
            if (visited[currVert] == false) {
                System.out.print(currVert + " ");
                visited[currVert] = true;

                // getting all the neighbors of currVertex.
                for (int i = 0; i < graph[currVert].size(); i++) {
                    Edge e = graph[currVert].get(i);
                    q.add(e.destination);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 8;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createBasicGraphWithoutWeight(graph);
        boolean visited[] = new boolean[V]; // visited array of size no. of vertices.
        for (int i = 0; i < V; i++) {
            if (visited[i] == false) {
                bfs(graph, V, visited, i);
            }
        }

    }
}
