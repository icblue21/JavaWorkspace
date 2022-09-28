package me.datastructure.stack;

import me.datastructure.array.MyArray;

public class MyStack {

    MyArray arrayStack;
    int top;

    public MyStack(){
        top = 0;
        arrayStack = new MyArray();
    }

    public MyStack(int size){
        top = 0;
        arrayStack = new MyArray(size);
    }

    public void push(int data){

        if( isFull() ){
            System.out.println("Stack is Full");
            return;
        }
        arrayStack.addElement(data);
        top++;
    }

    public int pop(){

        if( isEmpty() ){

            System.out.println("Stack is Empty");
            return MyArray.ERROR_NUM;

        }

        return arrayStack.removeElement(--top);
    }

    public int peek(){
        if( isEmpty()){
            System.out.println("Stack is Empty");
            return MyArray.ERROR_NUM;
        }
        return arrayStack.getElement(--top);
    }

    public boolean isFull(){

        if( top == arrayStack.ARRAY_SIZE ){
            return true;
        } else return false;
    }

    public boolean isEmpty(){

        if( top == 0) return true;
        else return false;
    }

    public void printAll(){
        arrayStack.printAll();
    }
}
