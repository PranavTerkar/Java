package Graphs;
import java.util.*; 
public class topologicalSorting {
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

       graph[2].add(new Edge(2, 3)); 

       graph[3].add(new Edge(3, 1));

       graph[4].add(new Edge(4, 0));
       graph[4].add(new Edge(4, 1));

       graph[5].add(new Edge(5, 0));
       graph[5].add(new Edge(5, 2));

    } 
    public static void sort(ArrayList<Edge> graph[]){
        Stack<Integer> s= new Stack<>(); 
        boolean vis[] = new boolean[graph.length]; 

        for(int i= 0; i<graph.length; i++){
            if(!vis[i]){
                sortUtil(graph, i, s, vis);
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }

    public static void sortUtil(ArrayList<Edge> graph[], int curr, Stack<Integer> s, boolean vis[]){
        vis[curr] = true; 

        for(int i= 0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i); 
            if(!vis[e.dest]){
                sortUtil(graph, e.dest, s, vis);
            }
        }
        s.push(curr); 
    }
    public static void main(String[] args) {
        int v= 6; 
        ArrayList<Edge> graph[] = new ArrayList[v]; 
        create(graph);
        sort(graph);
    }
}
