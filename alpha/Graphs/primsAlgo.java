package Graphs;
import java.util.*; 
public class primsAlgo {
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
        graph[0].add(new Edge(0 , 1, 10));
        graph[0].add(new Edge(0 , 2, 15));
        graph[0].add(new Edge(0 , 3, 30));

        graph[1].add(new Edge(1 , 0, 10));
        graph[1].add(new Edge(1 , 3, 40));

        graph[2].add(new Edge(2 , 1, 15));
        graph[2].add(new Edge(2 , 1, 50));

        graph[3].add(new Edge(3 , 1, 40));
        graph[3].add(new Edge(3 , 1, 50));
        
    }

    static class Pair implements Comparable<Pair> {
        int v; 
        int cost; 

        public Pair(int v, int c){
            this.v = v; 
            this.cost = c; 
        }

        public int compareTo(Pair p2){
            return this.cost - p2.cost; 
        }
    }

    public static void finalCost(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length]; 
        PriorityQueue<Pair> pq = new PriorityQueue<>(); 
        pq.add(new Pair(0, 0)); 
        int finalCost= 0; 

        while(!pq.isEmpty()){
            Pair curr = pq.remove(); 
            if(!vis[curr.v]){
                vis[curr.v] = true; 
                finalCost  += curr.cost; 
            }
            for(int i = 0; i<graph[curr.v].size(); i++){
                Edge e = graph[curr.v].get(i); 
                pq.add(new Pair(e.dest, e.wit)); 
            }
        }

        System.out.println(finalCost);
    }
    public static void main(String[] args) {
        int v =4; 
        ArrayList<Edge> graph[] = new ArrayList[v]; 
        create(graph);
        finalCost(graph);
    }
}
