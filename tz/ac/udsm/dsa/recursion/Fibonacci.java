package tz.ac.udsm.dsa.recursion;

public class Fibonacci {
    /**
     * Fibonacci is a sequence proposed by a scientist, in which each number in a sequence is a sum
     * of two previous/preceding numbers
     * 
     * example: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
     * 
     * definition:
     * f(n) = f(n-1) + f(n-2), where n > 1
     */

    public int fibonacci(int index){
        if(index == 0) return 0;
        if(index == 1) return 1;

        return fibonacci(index - 1) + fibonacci(index - 2);
    }
}