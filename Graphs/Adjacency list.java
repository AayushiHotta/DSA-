import java.util.*;

public class Main {
    static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        int v = 5; // Number of vertices
        List<Edge>[] graph = new ArrayList[v];

        // Initialize adjacency list
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges
        // Edges connected to vertex 0
        graph[0].add(new Edge(0, 1, 5));

        // Edges connected to vertex 1
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // Edges connected to vertex 2
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 
