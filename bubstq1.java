import java.util.Arrays;

public class bubstq1 {

    static void mtd(int[] arr){
        int temp = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                    flag =1;
                }
            }
            if (flag == 0){
                break;

            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,44,8,99,5,4,22};
        System.out.println(Arrays.toString(arr));
        mtd(arr);
        System.out.println(Arrays.toString(arr));
    }
}




