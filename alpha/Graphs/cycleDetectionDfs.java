package Graphs;
import java.util.*; 
public class cycleDetectionDfs {
    static class Edge{
        int src; 
      
        int dest; 
        public Edge(int s, int d){
            this.src = s;
            this.dest = d; 
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i= 0 ; i<graph.length ; i++){
            graph[i] = new ArrayList<>(); 
        }
        graph[0].add(new Edge(0,1)); 
        graph[0].add(new Edge(0,2)); 

        // graph[1].add(new Edge(1,0)); 
        // graph[1].add(new Edge(1,3)); 

        // graph[2].add(new Edge(2,0)); 
        // graph[2].add(new Edge(2,4)); 

        // graph[3].add(new Edge(3,1)); 
        // graph[3].add(new Edge(3,5)); 
        // graph[3].add(new Edge(3,4)); 

        // graph[4].add(new Edge(4,2)); 
        // graph[4].add(new Edge(4,3)); 
        // graph[4].add(new Edge(4,5)); 

        // graph[5].add(new Edge(5,3)); 
        // graph[5].add(new Edge(5,4)); 
        // graph[5].add(new Edge(5,6)); 

        // graph[6].add(new Edge(6,5)); 
       

    }

    public static boolean detectCycle(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length]; 

        for(int i= 0; i<graph.length; i++){
            if(!vis[i]){
                if(cycleDetectionUtil(graph, vis, i, -1)){
                    return true; 
                }
            }
        }
        return false; 
    }
    public static boolean cycleDetectionUtil(ArrayList<Edge> graph[], boolean vis[], int curr, int per){
        vis[curr] = true; 

        for(int i= 0; i<graph[curr].size(); i++){
            Edge e= graph[curr].get(i); 
            if(!vis[e.dest]){
                if(cycleDetectionUtil(graph, vis, e.dest, curr)){
                    return true;
                }
                
            }
            else if(vis[e.dest] && e.dest != per ){
                return true; 
            }
        }
        return false; 
    }
    public static void main(String[] args) {
        int v= 3; 
        ArrayList<Edge> graph[] = new ArrayList[v]; 
       
        createGraph(graph);
        System.out.println(detectCycle(graph));
   
    }
}
