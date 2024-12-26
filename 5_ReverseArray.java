import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int arr[] = new int[x];
        for(int i = 0 ; i < x ; i++){
            arr[i] = scanner.nextInt();
        }
        reverse(0, arr, x);
        for(int i = 0 ; i < x ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverse(int i, int[] arr, int x){
        if(i >= x/2){
            return;
        }
        swap(arr[i], arr[x - i - 1], arr, i, x - i - 1);
        reverse(i + 1, arr, x);
    }
    public static void swap(int a, int b, int[] arr, int p, int q){
        arr[p] = b;
        arr[q] = a;
    }
}
