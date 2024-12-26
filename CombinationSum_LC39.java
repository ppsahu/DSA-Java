import java.util.ArrayList;
import java.util.Scanner;

public class CombinationSum_LC39 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        int x = scanner.nextInt();
        int arr[] = new int[x];
        for(int i = 0 ; i < x ; i++){
            arr[i] = scanner.nextInt();
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        findCombination(0, arr, target, ans, new ArrayList<>());
        for(int i = 0 ; i < ans.size() ; i++){
            for(int j : ans.get(i)){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void findCombination(int ind, int[] arr, int target, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> ds){
        if(ind == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[ind] <= target){
            ds.add(arr[ind]);
            findCombination(ind, arr, target - arr[ind], ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombination(ind + 1, arr, target, ans, ds);
    }
}