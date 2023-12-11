package Graphs;

import java.util.*;;

/**
 * The GraphQues class contains methods for creating and manipulating graphs.
 * It includes methods for creating a basic graph with and without weights,
 * representing a graph as a matrix, and printing the neighbors of a specific node in the graph.
 */
public class GraphQues {
    /**
     * The Edge class represents an edge in the graph.
     * It has fields for the source node, destination node, and weight of the edge.
     */
    static class Edge {
        int source;
        int destination;
        int weight;

        /**
         * Constructs an Edge object without weight.
         * @param src the source node
         * @param dest the destination node
         */
        public Edge(int src, int dest) {
            this.source = src;
            this.destination = dest;
        }

        /**
         * Constructs an Edge object with weight.
         * @param src the source node
         * @param dest the destination node
         * @param wt the weight of the edge
         */
        public Edge(int src, int dest, int wt) {
            this.source = src;
            this.destination = dest;
            this.weight = wt;
        }
    }

    /**
     * The Pair class represents a pair of a node and its distance.
     * It is used for sorting nodes based on their distances in a priority queue.
     */
    static class Pair implements Comparable<Pair> {
        int node;
        int distance;

        /**
         * Constructs a Pair object.
         * @param n the node
         * @param d the distance
         */
        public Pair(int n, int d) {
            this.node = n;
            this.distance = d;
        }

        /**
         * Compares this Pair object with another Pair object.
         * @param p2 the other Pair object
         * @return a negative integer, zero, or a positive integer as this Pair object is less than, equal to, or greater than the other Pair object
         */
        @Override
        public int compareTo(Pair p2) {
            return this.distance - p2.distance;
        }
    }

    /**
     * Creates a basic graph without weights.
     * @param graph the graph represented as an array of ArrayLists
     */
    public static void createBasicGraphWithoutWeight(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
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

    /**
     * Creates a basic graph with weights.
     * @param graph the graph represented as an array of ArrayLists
     */
    public static void createBasicGraphWithWeight(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
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

    /**
     * Represents the graph as a matrix and prints the edges of the graph.
     */
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

    /**
     * The main method creates the graph and prints the neighbors of a specific node.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createBasicGraphWithoutWeight(graph);
        createBasicGraphWithWeight(graph);
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println("Neighbour of " + e.source + " is " + e.destination);
            System.out.println("Weight of neighbour of " + e.source + " is " + e.weight);
        }
        graphAsMatrix();
    }
}
