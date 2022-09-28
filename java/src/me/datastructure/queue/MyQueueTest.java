package me.datastructure.queue;

public class MyQueueTest {

    public static void main(String[] args){

        MyQueue queue = new MyQueue();
        queue.enQueue("1");
        queue.enQueue("2");
        queue.enQueue("3");

        queue.printQueue();

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}
