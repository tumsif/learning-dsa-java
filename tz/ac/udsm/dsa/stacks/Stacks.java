package tz.ac.udsm.dsa.stacks;

public interface Stacks {
    public boolean isEmpty();
    public boolean isFull();
    public int peek();
    public void push(int value);
    public int pop();
    public void popAll();
}