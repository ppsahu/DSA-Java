import java.util.*;
public class Palindrom_Partitioning {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        findPalindrome(0, res, path, str);
        for(List<String> list : res){
            for(String pal : list){
                System.out.print(pal + " ");
            }
            System.out.println();
        }
    }
    public static void findPalindrome(int index, List<List<String>> res, List<String> path, String s){
        if(index == s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = index ; i < s.length() ; i++){
            if(isPalindrome(s, index, i)){
                path.add(s.substring(index, i + 1));
                findPalindrome(i + 1, res, path, s);
                path.remove(path.size() - 1);
            }
        }
    }
    public static boolean isPalindrome(String s, int start, int end){
        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
