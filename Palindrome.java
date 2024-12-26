import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int arr[] = new int[x];
        for(int i = 0 ; i < x ; i++){
            arr[i] = scanner.nextInt();
        }
        boolean ans = checkPalindrome(0, arr, x);
        System.out.print(ans);
    }
    public static boolean checkPalindrome(int i, int[] arr, int x){
        if(i >= x/2){
            return true;
        }
        if(arr[i] != arr[x - i - 1]){
            return false;
        }
        return checkPalindrome(i + 1, arr, x);
    }
}
