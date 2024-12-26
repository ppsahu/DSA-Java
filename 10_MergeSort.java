import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int arr[] = new int[x];
        for(int i = 0 ; i < x ; i++){
            arr[i] = scanner.nextInt();
        }
        int low = 0;
        int high = arr.length - 1;
        if(low == high){
            return;
        }
        divideArray(arr, low, high);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void divideArray(int[] arr, int low, int high){
        if(low >= high) return;
        int mid = (low + high) / 2;
        divideArray(arr, low, mid);
        divideArray(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
    public static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }
        for(int i = low ; i <= high ; i++){
            arr[i] = temp.get(i - low);
        }
    }
}
