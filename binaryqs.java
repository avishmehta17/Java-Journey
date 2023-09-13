import java.util.Scanner;

class binaryqs{

    static int bs(int[]arr, int target){
        int start = 0;
        int end= arr.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if (target==arr[mid]){
                return arr[mid];
            }
            else if(target<arr[mid]){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return arr[end];

    }
    // end of code
    // its not the end

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {19,23,56,61,72,88,92};
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        int x = bs(arr,target);
        System.out.println(x);


    }
}
