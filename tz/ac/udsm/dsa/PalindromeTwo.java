package tz.ac.udsm.dsa;

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class PalindromeTwo {
    /**
     * Determines palindrome of text using Queue
     * This is because because popping out from stack is done from the last element placed
     * And when dequeue from a queue we select the first element passed to queue
     * 
     * Implementation (Algorithm)
     * 
     * Load the string to inside the Queue
     * Load the string to the Stack
     * Pop a character from a stack
     * Remove/Dequeue a character from A queue
     * Compare them
     * Perform a loop if in any case they do not match return a false (i.e not palindrome)
     * If evrything is ok then at the end return a true value
     */
    public boolean isPalindrome(String text){
        if(text.length() == 1){
            return true;
        }

        Queue<Character> queue = new LinkedList();
        Stack<Character> stack = new Stack();

        for(int i=0; i<text.length(); i++){
           queue.add(text.charAt(i));
           stack.add(text.charAt(i));
        }

        for(int i=0; i<text.length(); i++){
            if(queue.remove() != stack.pop()){
                return false;
            }
        }

        return true;
    }
}