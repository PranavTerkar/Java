package Graphs;

public class floodfillalgo {

    public static void helper(int images[][], int sr, int sc, int color, boolean vis[][], int orgCol){
        if(sr < 0 || sc < 0 || images[sr][sc] != orgCol || sr >= images.length || sc >= images[0].length || vis[sr][sc] ){
            return; 
        }

        images[sr][sc] = color; 
        // left   
        helper(images, sr-1, sc, color, vis, orgCol);
        // right
        helper(images, sr+1, sc, color, vis, orgCol);
        // up
        helper(images, sr, sc-1, color, vis, orgCol);
        // down
        helper(images, sr, sc+1, color, vis, orgCol);
    }

    public static int[][] floofAlgo(int images[][], int sr, int sc, int color){
        boolean vis[][] = new boolean[images.length][images[0].length]; 
        helper(images, sr, sc, color, vis, images[sr][sc]);
        return images;
    }
    public static void main(String[] args) {
        
    }
}
