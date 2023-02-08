package Graphs;
import java.util.*; 
public class directedCycleDetection{
    static class Edge{
        int src; 
        int dest; 

        public Edge(int s, int d){
            this.src = s; 
            this.dest = d; 
        }
    }

    public static void create(ArrayList<Edge> graph[]){
        for(int i= 0; i<graph.length; i++){
            graph[i] = new ArrayList<>(); 
        }

        graph[0].add(new Edge(0, 1)); 
        graph[0].add(new Edge(0, 2)); 

        graph[1].add(new Edge(1, 3)); 

        graph[2].add(new Edge(2, 3)); 


    } 
    public static boolean iscycle(ArrayList<Edge> graph[]){
        boolean stack[] = new boolean[graph.length]; 

        boolean vis[] = new boolean[graph.length]; 
        for(int i= 0; i<graph.length; i++){
            if(!vis[i]){
                if(iscycleUtil(graph, vis, stack, i)){
                    return true; 
                }
            }
        }

        return false; 
    }
    public static boolean iscycleUtil(ArrayList<Edge> graph[], boolean vis[], boolean stack[], int curr){

        stack[curr] = true; 
        vis[curr]= true; 

        for(int i = 0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i); 
            if(stack[e.dest]){
                return true; 
            }if(!vis[e.dest] && iscycleUtil(graph, vis, stack, e.dest)){
                return true; 
            }
        }
        stack[curr] = false; 
        return false; 
    }
    public static void main(String[] args) {
        int v = 4; 
        ArrayList<Edge> graph[] = new ArrayList[v]; 
        create(graph);
        System.out.println(iscycle(graph));
    }
}