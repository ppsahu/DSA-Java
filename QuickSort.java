import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int arr[] = new int[x];
        for(int i = 0 ; i < x ; i++){
            arr[i] = scanner.nextInt();
        }
        quickSort(arr, 0, arr.length - 1);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void quickSort(int [] arr, int low, int high){
        if(low < high){
            int pIndex = partition(arr, low, high);
            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex + 1, high);
        }
    }
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low;
        int j = high;
        while(i < j){
            while(arr[i] >= pivot && i <= high - 1){
                i++;
            }
            while(arr[j] < pivot && j >= low + 1){
                j--;
            }
            if(i < j) swap(arr, i, j);
        }
        swap(arr, low, j);
        return j;
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
