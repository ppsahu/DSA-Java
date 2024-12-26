import java.util.Scanner;

public class OnetoNRecur {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        printforw(x, 1);
    }
    public static void printforw(int x, int y){
        if(x < y){
            return;
        }
        printforw(x-1, y);
        System.out.println(x);
    }
}
