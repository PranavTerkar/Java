package Graphs;
import java.util.*; 
public class bellmanFordALgo {
    static class Edge{
        int src; 
        int dest; 
        int wit; 

        public Edge(int s, int d, int w){
            this.dest = d; 
            this.src = s; 
            this.wit = w; 
        }
    }
    public static void create(ArrayList<Edge> graph[]){
        for(int i= 0; i<graph.length; i++){
            graph[i] = new ArrayList<>(); 
        }
        graph[0].add(new Edge(0 , 1, 2));
        graph[0].add(new Edge(0 , 2, 4));

        graph[1].add(new Edge(1 , 2, -4));

        graph[2].add(new Edge(2 , 3, 2));

        graph[3].add(new Edge(3 , 4, 4));

        graph[4].add(new Edge(4 , 1, -1));
    }

    public static void bellmanFord(ArrayList<Edge> graph[], int src){
        int dist[] = new int[graph.length]; 
        for(int i= 0; i<dist.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE; 
            }
        }
        for(int i= 0; i<graph.length; i++){
            for(int j= 0; j<graph[i].size(); j++){
                Edge e = graph[i].get(j); 
                int u = e.src; 
                int v = e.dest; 
                int wt = e.wit; 
                if(dist[u] != Integer.MAX_VALUE && dist[v] > wt + dist[u]){
                    dist[v] = dist[u] + wt; 
                }
            }
        }
        for(int i= 0; i<dist.length; i++){
            System.out.print(dist[i] +  " ");
        }
    }
    public static void main(String[] args) {
        int v = 5; 
        ArrayList<Edge> graph[] = new ArrayList[v]; 
        create(graph);
        bellmanFord(graph, 0);
    }
}
