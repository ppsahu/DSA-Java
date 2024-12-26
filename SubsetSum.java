import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SubsetSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int arr[] = new int[x];
        for(int i = 0 ; i < x ; i++){
            arr[i] = scanner.nextInt();
        }
        ArrayList<Integer> subsetSum = new ArrayList<>();
        findSubsetsum(0, 0, arr, subsetSum);
        Collections.sort(subsetSum);
        for(int i = 0 ; i < subsetSum.size() ; i++){
            System.out.print(subsetSum.get(i) + " ");
        }
    }
    public static void findSubsetsum(int ind, int sum, int[] arr, ArrayList<Integer> subsetSum){
        if(ind == arr.length){
            subsetSum.add(sum);
            return;
        }
        findSubsetsum(ind + 1, sum + arr[ind], arr, subsetSum);

        findSubsetsum(ind + 1, sum, arr, subsetSum);
    }
}
