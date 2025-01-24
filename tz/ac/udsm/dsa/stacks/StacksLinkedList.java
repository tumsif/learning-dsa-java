package tz.ac.udsm.dsa.stacks;

import tz.ac.udsm.dsa.stacks.Stacks;

import tz.ac.udsm.dsa.lists.LinkedList;

public class StacksLinkedList<T> {
    private LinkedList<T> top;

    public StacksLinkedList() {
        top = null;
    }

    public boolean isEmpty(){
        return top == null;
    }
    public boolean isFull(){
        /**
         * Stacks with linkedlist cannot be full
         */
        return false;
    }
    public T peek(){
        if(this.isEmpty()){
            System.out.println("The stack is empty");
            return null;
        }else{
            return top.getValue();
        }
    }
    public void push(T value){
        /**
         * Create a new Object and update the reference to it
         */
        top = new LinkedList(value, top);
    }
    public T pop(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return null;
        }
        LinkedList<T> temp = top;
        top = top.getNext();
        return temp.getValue();
    }
    public void popAll(){
        this.top = null;
    }
}