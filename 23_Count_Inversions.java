import java.util.*;

public class Count_Inversions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = new int[x];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        int low = 0;
        int high = arr.length - 1;
        if(low == high){
            return;
        }
        int count = divideArray(arr, low, high);
        System.out.print(count);
    }
    public static int divideArray(int[] arr, int low, int high){
        int count = 0;
        if(low >= high) return count;
        int mid = (low + high) / 2;
        count += divideArray(arr, low, mid);
        count += divideArray(arr, mid + 1, high);
        count += merge(arr, low, mid, high);
        return count;
    }
    public static int merge(int[] arr, int low, int mid, int high){
        int count = 0;
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
                count += mid - left + 1;
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
        return count;
    }
}
