import java.util.*;
public class Permutation_Sequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String ans = findPermutaionSequence(n, k);
        System.out.print(ans);
    }
    public static String findPermutaionSequence(int n, int k){
        List<Integer> numbers = new ArrayList<>();
        int fact = 1;
        for(int i = 1 ; i < n ; i++){
            fact = fact * i;
            numbers.add(i);
        }
        numbers.add(n);
        k = k - 1;
        String ans = "";
        while(true){
            ans = ans + numbers.get(k / fact);
            numbers.remove(k / fact);
            if(numbers.size() == 0){
                break;
            }
            k = k % fact;
            fact = fact / numbers.size();
        }
        return ans;
    }
}
