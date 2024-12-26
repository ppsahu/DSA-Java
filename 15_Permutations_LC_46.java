import java.util.ArrayList;
import java.util.Scanner;

public class Permutations_LC_46 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int arr[] = new int[x];
        for(int i = 0 ; i < x ; i++){
            arr[i] = scanner.nextInt();
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[arr.length];
        findPermutations(arr, ans, ds, freq);
        for(int i = 0 ; i < ans.size() ; i++){
            for(int j : ans.get(i)){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void findPermutations(int[] arr, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> ds, boolean freq[]){
        if(ds.size() == arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(arr[i]);
                findPermutations(arr, ans, ds, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }
}
