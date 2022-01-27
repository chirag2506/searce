import java.util.HashMap;

class CountPairWithGivenSum{
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int sum = 6;
        System.out.println(countPairs(arr, sum));
    }

    public static int countPairs(int[] arr, int sum){
        HashMap<Integer, Integer> hm = new HashMap<>();
 
        for (int i = 0; i < arr.length; i++) {
            if (!hm.containsKey(arr[i]))
                hm.put(arr[i], 0);
 
            hm.put(arr[i], hm.get(arr[i]) + 1);
        }
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (hm.get(sum - arr[i]) != null)
                count += hm.get(sum - arr[i]);
 
            //ensuring that count is decreased by one such that the (arr[i], arr[i]) pair is not considered
            if (sum - arr[i] == arr[i])
                count--;
        }
 
        // returning half because each pair counted twice
        return count/2;
    }
}