package stackdemo;


import java.util.Iterator;
import java.util.Stack;

public class UseStack {

    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        int choice = 0; // when you wanna use for loop
        for(int i=1; i<5; i++){
            stack.push("plate: " + i);
        }
        Iterator it = stack.listIterator();
        while(it.hasNext()){
            System.out.println(stack.pop());// this is where the for loop ends
        }
       // stack.push("Plate1"); // use these codes when you need stack class
      //  stack.push("plate2");
      //  stack.push("plate3");

        //System.out.println(stack.peek());
       // System.out.println(stack.pop());
       // System.out.println(stack.pop());
       // System.out.println(stack.peek());

    }
}
