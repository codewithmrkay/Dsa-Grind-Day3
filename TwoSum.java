import java.util.Arrays;

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

    public static void main(String[] args) {
        int[] array = { 4, 6, 3 ,16};
        int goal = 20;
        TwoSum obj = new TwoSum();
        int[] result = obj.ans(array, goal);
        System.out.println(Arrays.toString(result));
    }
}
