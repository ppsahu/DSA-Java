import java.util.ArrayList;
import java.util.Scanner;

public class PrintSubsequenceWithSumK {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int x = scanner.nextInt();
        int arr[] = new int[x];
        for(int i = 0 ; i < x ; i++){
            arr[i] = scanner.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        //boolean ans = printSubsequence(0, arr, list, sum, 0);
        System.out.print(printSubsequence(0, arr, list, sum, 0));
    }
    // public static void printSubsequence(int i, int[] arr, ArrayList<Integer> list, int sum, int currSum){
            // return all the subsequences
    //     if(i == arr.length){
    //         if(sum == currSum){
    //             for(int j : list){
    //                 System.out.print(j + " ");
    //             }
    //         }
    //         System.out.println();
    //         return;
    //     }
        
    //     list.add(arr[i]);
    //     currSum += arr[i];
    //     printSubsequence(i + 1, arr, list, sum, currSum);

    //     list.remove(list.size() - 1);
    //     currSum -= arr[i];
    //     printSubsequence(i + 1, arr, list, sum, currSum);
    // }
    // public static boolean printSubsequence(int i, int[] arr, ArrayList<Integer> list, int sum, int currSum){
    //     // return true if there is a subsequence
    //     if(sum == currSum){
    //         for(int j : list){
    //             System.out.print(j + " ");
    //         }
    //         return true;
    //     }
        
        
    //     list.add(arr[i]);
    //     currSum += arr[i];
    //     if(printSubsequence(i + 1, arr, list, sum, currSum) == true){
    //         return true;
    //     }

    //     list.remove(list.size() - 1);
    //     currSum -= arr[i];
    //     if(printSubsequence(i + 1, arr, list, sum, currSum) == true){
    //         return true;
    //     }
    //     return false;
    // }
    public static int printSubsequence(int i, int[] arr, ArrayList<Integer> list, int sum, int currSum){
        // count number of subsequences whose sum is k
        if(i == arr.length){
            if(sum == currSum){
                return 1;
            }
            else{
                return 0;
            }
        }
        
        currSum += arr[i];
        int left = printSubsequence(i + 1, arr, list, sum, currSum);

        currSum -= arr[i];
        int right = printSubsequence(i + 1, arr, list, sum, currSum);

        return left + right;
    }
}
