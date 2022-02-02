import java.util.Scanner;
import java.util.LinkedList;

class linkedListTraversal{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int p;
        p = scn.nextInt();
        LinkedList<Integer> ll = new LinkedList<>();
        for(int i = 0; i < p; i++){
            ll.add(scn.nextInt());
        }

        // the linked list is ready, now, traversing it
        printlinkedlist(ll);
               
    }

    public static void printlinkedlist(LinkedList<Integer> ll){
        for (int i : ll)
            System.out.print(i + " ");
    }
}