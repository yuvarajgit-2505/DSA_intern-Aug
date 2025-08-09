import java.util.Arrays;

public class Recursion {
    public  static  int findmin(int[] arr){
        if(arr.length==1)
            return arr[0];
        return Math.max(arr[0],findmin(Arrays.copyOfRange(arr,1,arr.length)));
    }

    public static void main(String[] args) {
        int[] arr={99,22,35,66};
        System.out.println(findmin(arr));
    }

}

