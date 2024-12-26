import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Combination_Sum_LC_40 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        int x = scanner.nextInt();
        int arr[] = new int[x];
        for(int i = 0 ; i < x ; i++){
            arr[i] = scanner.nextInt();
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        findCombination2(0, arr, target, ans, new ArrayList<>());
        for(int i = 0 ; i < ans.size() ; i++){
            for(int j : ans.get(i)){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void findCombination2(int ind, int[] arr, int target, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> ds){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = ind; i < arr.length ; i++){
            if(i > ind && arr[i] == arr[i - 1]) continue;
            if(arr[i] > target) break;

            ds.add(arr[i]);
            findCombination2(i + 1, arr, target - arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
}
