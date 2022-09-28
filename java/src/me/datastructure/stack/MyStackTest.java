package me.datastructure.stack;

public class MyStackTest {

    public static void main(String[] args){

        MyStack stack = new MyStack(3);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4); // stack is full 출력 됨

        stack.printAll();
        System.out.println(stack.pop()); // 3
        System.out.println(stack.pop()); // 2
        System.out.println(stack.peek()); // 1

    }
}
