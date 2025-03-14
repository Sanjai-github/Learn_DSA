import java.util.*;

public class Array_1 {
    public static void main(String []args){
        /*
        Array is the simplest DS which contains the Data of similar data-types.
        arrays are of fixed size and cannot be increase or decrease size.
        Arrays are the linear data type.
        */

        // Declaration of an Array
        int[] arr = new int[5];
        /*
        Here the int-> Data type
        [] -> represents the Array
        arr -> Name of an Array.
        new -> Keyword creates the object of the cls
        int[5] -> represents the Data-type and the Size of an Array.
        */

        int[] arr1 = {1,2,3,4,5,6,7}; //Simple Way to assign the values for array
        System.out.println(arr1.length);
        arr[0]=1; //Assigning values for the index in an array
        System.out.println(Arrays.toString(arr));

        arr1[0]=10; //Re-Assigning values for the index in an array
        System.out.println(Arrays.toString(arr1));
        /*
        Getting input from the User
        for that We have to create an object for the class Scanner
         */
        Scanner in = new Scanner(System.in);// in -> Name of the object created for Scanner Class
        for(int i = 0; i < arr.length ; i++  ){ //for-loop is used in getting input values from user
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));
    }
}
