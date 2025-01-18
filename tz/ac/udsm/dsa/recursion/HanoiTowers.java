package tz.ac.udsm.dsa.recursion;

public class HanoiTowers {
    /**
     * Rules
     * Only one disc could be moved once at a time
     * A larger disc must never be stacked above a smaller one
     * One and only one extra pole could be used for intermediate storage of discs
     */
    public void hanoi(int num, char fromPeg, char toPeg, char auxPeg){
        if(num == 1){
            System.out.println("Move disc 1 from peg " + fromPeg + " to peg " + toPeg);
            return;
        }
        else{
            hanoi(num - 1, fromPeg, auxPeg, toPeg);
            System.out.println("Move disc " + num + " from peg " + fromPeg + " to peg " + toPeg);
            hanoi(num - 1, auxPeg, toPeg, fromPeg);
        }
    }
}