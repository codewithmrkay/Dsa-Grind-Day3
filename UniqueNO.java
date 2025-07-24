public class UniqueNO {
    public UniqueNO(){
        
    }
    public int NormalWay(int[] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
               if(arr[i]==arr[j]&&arr[i]!=-1&&i!=j){
                arr[i]=-1;
                arr[j]=-1;
               }
            }
            if(arr[i]!=-1) return arr[i];
        }
        return -1;
    }
    public int NinjaWay(int[] arr){
        int ans = 0;
        for (int i : arr) {
            ans = ans ^ i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] array = {1,2,1,4,2};
        UniqueNO arr = new UniqueNO();
        System.out.println("Normal Way Ans is : "+arr.NormalWay(array));        
        System.out.println("Ninja Way Ans is : "+arr.NinjaWay(array));        
    }
}
