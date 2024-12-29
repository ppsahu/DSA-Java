import java.util.*;
public class M_Coloring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();//nodes
        int m = sc.nextInt();//color
        List<int[]> edges = new ArrayList<>();
        for(int i = 0 ; i < edges.size() ; i++){
            int[] edge = new int[2];
            for(int j = 0 ; j < edge.length ; j++){
                edge[i] = sc.nextInt();
            }
            System.out.println();
        }
        //Adjacency List
        List<Integer>[] G = new ArrayList[v];
        for(int i = 0 ; i < G.length ; i++){
            G[i] = new ArrayList<>();
        }
        for(int[] edge : edges){    
            G[edge[0]].add(edge[1]);
            G[edge[1]].add(edge[0]);
        }
        int[] color = new int[v];
        boolean ans = solve(0, G, color, m);
        System.out.println(ans);
    }
    public static boolean solve(int node, List<Integer>[] G, int[] color, int m){
        if(node == G.length){
            return true;
        }
        for(int i = 1 ; i <= m ; i++){
            if(isSafe(node, G, color, i)){
                color[node] = i;
                if(solve(node + 1, G, color, m) == true) return true;
                color[node] = 0;
            }
        }
        return false;
    }
    public static boolean isSafe(int node, List<Integer>[] G, int[] color, int i){
        for(int curr : G[node]){
            if(color[curr] == i){
                return false;
            }
        }
        return true;
    }
}