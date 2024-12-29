import java.util.ArrayList;
import java.util.Scanner;

public class PrintSubsequence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int arr[] = new int[x];
        for(int i = 0 ; i < x ; i++){
            arr[i] = scanner.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        printSubsequence(0, arr, list);
    }
    public static void printSubsequence(int i, int[] arr, ArrayList<Integer> list){
        if(i == arr.length){
            for(int j : list){
                System.out.print(j + " ");
            }
            System.out.println();
            return;
        }
        list.add(arr[i]);
        printSubsequence(i + 1, arr, list);
        list.remove(list.size() - 1);
        printSubsequence(i + 1, arr, list);
    }
}
