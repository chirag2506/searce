import java.util.Scanner;

class arrayReverse{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int Q;
        Q = scn.nextInt();
        int[] P = new int[Q];
        for(int i = 0; i < Q; i++){
            P[i] = scn.nextInt();
        }

        // array is ready, now, reversing the array
        P = reverse(P);

        for(int i = 0; i < Q; i++){
            System.out.print(P[i] + " ");
        }        
    }

    public static int[] reverse(int[] arr){
        int n = arr.length, temp;
        for(int i = 0; i < n/2; i++){
            temp = arr[i]; 
            arr[i] = arr[n - i - 1]; 
            arr[n - i - 1] = temp;
        }

        return arr;
    }
}