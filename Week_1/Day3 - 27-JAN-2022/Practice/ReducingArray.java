import java.util.*;

class ReducingArray{
    public static void main(String[] args) {
        /* reducing means convert the given array to a form where all elements are in the range from 0 to n-1. 
        The order of elements is the same, i.e., 0 is placed in the place of the smallest element, 1 is placed for the second smallest element, … n-1
        is placed for the largest element. */

        int arr[] = {10, 20, 15, 12, 11, 50};
        int n = arr.length;
 
        System.out.println("Original");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + "\t");
        }
 
        reduce(arr, n);
        System.out.println("\n");
 
        System.out.println("Reduced");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + "\t");
        }
    }

    public static void reduce(int arr[], int n){
        int temp[] = arr.clone();
        Arrays.sort(temp);
 
        HashMap<Integer, Integer> map = new HashMap<>();
 
        int val = 0;
        for (int i = 0; i < n; i++)
            map.put(temp[i], val++);
 
        // Convert array by taking positions from map
        for (int i = 0; i < n; i++)
            arr[i] = map.get(arr[i]);
    }
}