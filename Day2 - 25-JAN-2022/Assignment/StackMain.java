import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        StackCustom stack = new StackCustom();
        StackCustom max = new StackCustom();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while(n-- > 0){
            int type = scn.nextInt();
            if(type == 1){
                int x = scn.nextInt();
                if(stack.isEmpty()){
                    stack.push(x);
                    max.push(x);
                }else{
                    stack.push(x);
                    if(max.peek() > x){
                        max.push(max.peek());
                    }else{
                        max.push(x);
                    }
                }

            }else if(type == 2){
                stack.pop();
                max.pop();
            }else if(type == 3){
                System.out.println(max.peek());
            }
        }
    }
}

public class StackCustom {
    static final int MAX_SIZE = 1000;
    private int top;
    private int a[];
 
    public boolean isEmpty(){
        return (top < 0);
    }

    public StackCustom(int size){
        top = -1;
        a = new int[size];
    }

    public StackCustom(){
        this(MAX_SIZE);

    }
 
    public boolean push(int x){
        if (top >= (MAX_SIZE - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }
 
    public int pop(){
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    }
 
    public int peek(){
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top];
            return x;
        }
    }
    
    public void print(){
    for(int i = top;i>-1;i--){
      System.out.print(" "+ a[i]);
    }
  }
}