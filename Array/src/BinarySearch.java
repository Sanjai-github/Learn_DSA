import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in an Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the element to be Searched : ");
        int target = in.nextInt();
        int Position = search(arr, target);
        System.out.println("Element found at " + Position + " position ");
    }
    static int search(int []arr, int target){
     int start = 0;
     int end = arr.length -1 ;
     while(start <= end){
         int mid = start + (end - start)/2;
         if (arr[mid] == target){
             return mid+1;
         }
         else if (arr[mid]<target){
             start = mid+1;
         }
         else
             end = mid-1;
     }
        return -1;
    }
}
