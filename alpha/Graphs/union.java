package Graphs;

public class union {
    static int n = 7; 
    static int par[] = new int[n]; 
    static int rank[] = new int[n]; 

    public static void init(){
        for(int i= 0; i<n; i++){
            par[i] = i; 
        }
    }
    public static int para(int a){
        if(a == par[a]){
            return a; 
        }

        return par[a] =  para(par[a]); 
    }
    public static void unions(int a, int b){
        int parA = para(a); 
        int parB = para(b); 

        if(rank[parA] == rank[parB]){
            par[parB] = parA; 
            rank[parA]++; 
        }
        if(rank[parA]> rank[parB]){
            par[parB] = parA; 
        }
        if(rank[parA]< rank[parB]){
            par[parA] = parB; 
        }
    }
    public static void main(String[] args) {
        init();
        System.out.println(para(3));
        unions(1, 3);
        System.out.println(para(3));
        unions(2, 4);
        unions(3, 6);
        unions(1, 4);
        System.out.println(para(3));
        System.out.println(para(4));
        unions(1, 5);
        
        }
}
