import java.util.*;
public class Rat_Maze {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] maze = new int[4][4];
        for(int i = 0 ; i < maze.length ; i++){
            for(int j = 0 ; j < maze[0].length ; j++){
                maze[i][j] = sc.nextInt();
            }
        }
        int[][] vis = new int[4][4];
        ArrayList<String> ans = new ArrayList<>();
        int[] di = {1, 0, 0, -1};
        int[] dj = {0, -1, 1, 0};
        if(maze[0][0] == 1) solve(0, 0, di, dj, maze, vis, "", ans);
        for(String s : ans){
            System.out.print(s + " ");
        }
    }
    public static void solve(int i, int j, int[] di, int[] dj, int[][] maze, int[][] vis, String path, ArrayList<String> ans){
        if(i == 3 && j == 3){
            ans.add(path);
            return;
        }
        String dir = "DLRU";
        for(int ind = 0 ; ind < 4 ; ind++){
            int nexti = i + di[ind];
            int nextj = j + dj[ind];
            if(nexti >= 0 && nextj >= 0 && nexti < 4 && nextj < 4 && vis[nexti][nextj] != 1 && maze[nexti][nextj] == 1){
                vis[i][j] = 1;
                solve(nexti, nextj, di, dj, maze, vis, path + dir.charAt(ind), ans);
                vis[i][j] = 0;
            }
        }
    }
}
