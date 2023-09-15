import java.util.Scanner;

public class question2 {

    static void method(int[]arr, int target){
        int index1 = -1;
        int index2 = -1;
        for (int i = 0; i < arr.length; i++) {
            if (target==arr[i]){
                index1 = i;
                // x = arr[i];
                break;
            }
            
        }
        for (int j=arr.length; j>=0; j--) {
            if ( arr[j]==target){
                index2 = j;
                // y = arr[j];
                break;
            }
           
        }
        // return x;
        if (index1 != -1 && index2 != -1) {
            System.out.println("First Index: " + index1);
            System.out.println("Last Index: " + index2);
        } else {
            System.out.println("Number not found in the array.");
        }
        // return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,4,5,6,7,7,7};
        int target = sc.nextInt();
        // int res = method(target)
        method(arr, target);
        // System.out.println(res);
        
    }

}
