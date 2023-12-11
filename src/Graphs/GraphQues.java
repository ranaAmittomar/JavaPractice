package Graphs;

import java.util.*;;

public class GraphQues {
    static class Edge { // basic structure of edge.
        // this is also known as innerClass.
        int source;
        int destination;
        int weight;

        public Edge(int src, int dest) { // constructor for graph without weights.
            this.source = src;
            this.destination = dest;
        }

        public Edge(int src, int dest, int wt) { // another constructor if we want to give weight.
            this.source = src;
            this.destination = dest;
            this.weight = wt;
        }

    }

    static class Pair implements Comparable<Pair> { // for usage of Priority Queue.
        int node;
        int distance;

        public Pair(int n, int d) {
            this.node = n;
            this.distance = d;
        }

        @Override
        public int compareTo(Pair p2) { // this uses the pair type of p2 variable..
            return this.distance - p2.distance; // this will sort on the basis of ascending order
            // return p2.distance - this.distance -> it'll sort in descending order.
        }
    }

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
    }

    public static void createBasicGraphWithWeight(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) { // changing null value with empty arraylist on every index.
            graph[i] = new ArrayList<Edge>(); // if we add directly to null index, then it'll throw error.
        }
        graph[0].add(new Edge(0, 1, 2));

        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 2, 0));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3, -1));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, -1));
    }

    public static void graphAsMatrix() {
        int[][] graph = {
                { 0, 0, 0, 1 },
                { 0, 1, 1, 0 },
                { 0, 1, 1, 0 },
                { 1, 0, 0, 0 } };

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[0].length; j++) {
                if (graph[i][j] == 1 || graph[j][i] == 1) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createBasicGraphWithoutWeight(graph);
        createBasicGraphWithWeight(graph);
        // printing 2's neighbor.
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println("Neighbour of " + e.source + " is " + e.destination);
            System.out.println("Weight of neighbour of " + e.source + " is " + e.weight);
        }
        graphAsMatrix();
    }
}
