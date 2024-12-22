import java.util.Scanner;

public class SumOneToN {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        printSum(x, 1);
        int sum = returnSum(x);
        System.out.print("Factorial: " + sum);
    }
    public static void printSum(int n, int pro){
        if(n == 1){
            System.out.println("Factorial: " + pro);
            return;
        }
        printSum(n - 1, pro * n);
    }
    public static int returnSum(int n){
        if(n == 1){
            return 1;
        }
        return n * returnSum(n - 1);
    }
}
