package tz.ac.udsm.dsa.stacks;

import tz.ac.udsm.dsa.stacks.Stacks;

public class StacksArray implements Stacks {
    private int stackSize; // maximum stack size
    private int top; // the position of the top element
    private int values[]; // items array

    public StacksArray(int size){
        this.stackSize = size;
        this.top = -1;
        this.values = new int[size];
    }

    @Override
    public boolean isEmpty(){
        return top == -1;
    }

    @Override
    public boolean isFull(){
        return top == this.stackSize - 1;
    }

    @Override
    public int peek(){
        /**
         * Get the value at the reference of top
         */
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        return this.values[top];
    }

    @Override
    public void push(int value){
        /**
         * Push elements to the top of the stack.
         */
        if (this.isFull()){
            System.out.println("Stack is full");
        }else {
            this.values[++this.top] = value;
        }
    }

    @Override
    public int pop(){
        /**
         * Same as peek except it shifts the top reference to previous
         */
        if(isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }
        else {
            return this.values[this.top--];
        }
    }

    @Override
    public void popAll(){
       /**
        * Reset everything
        */
        this.top = -1;
        this.values = new int[this.stackSize];
    }

}