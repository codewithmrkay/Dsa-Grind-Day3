import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] ans(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target && i != j) {
                    return new int[] { arr[i], arr[j] };
                }
            }
        }
        return new int[] { -1, -1 };
    }
    public int[] byPiyush(int [] arr,int target){
        for(int i = 0;i<arr.length;i++){
            int targetNum = target - arr[i];
            for(int j = i+1;j<arr.length;j++){
                if(targetNum==arr[j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public int[] ByPiyush(int[] arr , int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            int targetnum = target - arr[i];
            if(map.containsKey(targetnum)){
                return new int[]{map.get(targetnum),i};
            }
            else{
                map.put(arr[i], i);
            }
        }
        return new int[]{-1,-1}; 
    }
    public static void main(String[] args) {
        int[] array = { 4, 8, 3 ,12};
        int goal = 20;
        TwoSum obj = new TwoSum();
        // int[] result = obj.ans(array, goal);
        // System.out.println(Arrays.toString(result));
        // int[] result2 = obj.byPiyush(array, goal);
        // System.out.println(Arrays.toString(result2));        
        int[] result3= obj.byPiyush(array, goal);
        System.out.println(Arrays.toString(result3));        
    }
    }

