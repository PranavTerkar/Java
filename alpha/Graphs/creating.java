package Graphs;

import java.util.*;

import javax.management.Query;

public class creating {
    static class Edge {
        int src;
        int wit;
        int dest;

        public Edge(int s, int d, int w) {
            this.dest = d;
            this.src = s;
            this.wit = w;
        }
    }
    public static void BFSearch(ArrayList<Edge>graph[]){
        System.out.println("euf");
        Queue<Integer> q = new LinkedList<>(); 
        boolean vis[] = new boolean[graph.length]; 

        while(!q.isEmpty()){
            int curr = q.remove(); 

            if(!vis[curr]){
                System.out.print(curr+ " ");
                vis[curr] = true; 
                for(int i =0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i); 
                    q.add(e.dest); 
                }
            }
        }
    }
    public static boolean isPath(ArrayList<Edge> graph[], boolean vis[], int curr, int key){
        if(curr == key){
            return true; 
        }

        vis[curr] = true; 
        for(int i =0; i<graph[curr].size(); i++){
            Edge e  = graph[curr].get(i); 
            if(!vis[e.dest] && isPath(graph, vis, e.dest, key)){
                return true; 
            } 
        }

        return false; 
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,5)); 

        graph[1].add(new Edge(1,0,5)); 
        graph[1].add(new Edge(1,2,1)); 
        graph[1].add(new Edge(1,3,3)); 

        graph[2].add(new Edge(2,1,1)); 
        graph[2].add(new Edge(2,3,1)); 
        graph[2].add(new Edge(2,4,2)); 

        graph[3].add(new Edge(3,2,1)); 
        graph[3].add(new Edge(3,1,3)); 

        graph[4].add(new Edge(4,2,2)); 

        for(int i = 0; i<graph[2].size(); i++){
            Edge e= graph[2].get(i); 
            System.out.println(e.dest);
        }

        BFSearch(graph);
        System.out.println(isPath(graph, new boolean[v], 0, 0));
    }
}
