import java.util.*;

public class N_Queens_LC_51{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<String>> ans = solveNqueens(n);
        for(List<String> lt : ans){
            for(String s : lt){
                System.out.print(s);
                System.out.println();
            }
            System.out.println();
        }
    }
    public static List<List<String>> solveNqueens(int n){
        char[][] board = new char[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                board[i][j] = '.';
            }
        }
        int[] leftRow = new int[n];
        int[] lowerDiagonal = new int[2 * n - 1];
        int[] upperDiagonal = new int[2 * n - 1];
        List<List<String>> ans = new ArrayList<>();
        solve(0, board, ans, leftRow, lowerDiagonal, upperDiagonal);
        return ans;
    }
    public static void solve(int col, char[][] board, List<List<String>> ans, int[] leftRow, int[] lowerDiagonal, int[] upperDiagonal){
        if(col == board.length){
            ans.add(construct(board));
            return;
        }
        for(int row = 0 ; row < board.length ; row++){
            if(leftRow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[board.length - 1 + col - row] == 0){
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[board.length - 1 + col - row] = 1;
                solve(col + 1, board, ans, leftRow, lowerDiagonal, upperDiagonal);
                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[board.length - 1 + col - row] = 0;
            }
        }
    }
    public static List<String> construct(char[][] board){
        List<String> result = new ArrayList<>();
        for(int i = 0 ; i < board.length ; i++){
            String str = new String(board[i]);
            result.add(str);
        }
        return result;
    }
}