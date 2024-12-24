import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class SubsetSum_2_LC_90 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int arr[] = new int[x];
        for(int i = 0 ; i < x ; i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        findSubsetsum(0, arr, ans, new ArrayList<>());
        for(int i = 0 ; i < ans.size() ; i++){
            for(int j : ans.get(i)){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void findSubsetsum(int ind, int[] arr, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> ds){
        ans.add(new ArrayList<>(ds));
        for(int i = ind ; i < arr.length ; i++){
            if(i != ind && arr[i] == arr[i - 1]) continue;
            ds.add(arr[i]);
            findSubsetsum(i + 1, arr, ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
}