import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int ans = findFibonacci(x);
        System.out.print(ans);
    }
    public static int findFibonacci(int x){
        if(x == 0){
            return 0;
        }
        if(x == 1){
            return 1;
        }
        int last = findFibonacci(x - 1);
        int slast = findFibonacci(x - 2);
        return last + slast;
    }
}

// 0 1 1 2 3 5 8 13
