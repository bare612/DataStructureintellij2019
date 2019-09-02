package queue;


import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("John");
        queue.add("Doe");
        queue.add("Muran");
        queue.add("Silva");

      //  System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }

}
