package Graphs;
import java.util.*; 
public class hasPath {
    static class Edge{
        int src; 
        int wig; 
        int dest; 
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d; 
            this.wig = w; 

        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i= 0 ; i<graph.length ; i++){
            graph[i] = new ArrayList<>(); 
        }
        graph[0].add(new Edge(0,1,1)); 
        graph[0].add(new Edge(0,2,1)); 

        graph[1].add(new Edge(1,0,1)); 
        graph[1].add(new Edge(1,3,1)); 

        graph[2].add(new Edge(2,0,1)); 
        graph[2].add(new Edge(2,4,1)); 

        graph[3].add(new Edge(3,1,1)); 
        graph[3].add(new Edge(3,5,1)); 
        graph[3].add(new Edge(3,4,1)); 

        graph[4].add(new Edge(4,2,1)); 
        graph[4].add(new Edge(4,3,1)); 
        graph[4].add(new Edge(4,5,1)); 

        graph[5].add(new Edge(5,3,1)); 
        graph[5].add(new Edge(5,4,1)); 
        graph[5].add(new Edge(5,6,1)); 

        graph[5].add(new Edge(6,5,1)); 
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
        int v = 7; 
        ArrayList<Edge> graph[] = new ArrayList[v]; 
        createGraph(graph);
        System.out.println(isPath(graph, new boolean[v], 0, 7));
    }
}
