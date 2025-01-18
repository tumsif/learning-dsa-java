package tz.ac.udsm.dsa.iterations;

public class Exponential {
    /**
     * Calculate exponential of x using taylor series e^(x)
     */

    public int exponent(int x, int n){
        int term = 1, sum = 1; // erm will be ermhe term at series, s will hold the sum

        int k = 1;

        while(k <= n){
            term *= x / k; // calculate next term from current term
            sum += term; // add the term to the total sum
            k++; // increment
        }

        return sum;
    }
}