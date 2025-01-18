package tz.ac.udsm.dsa.recursion;

public class NumberOfZero {
    /**
     * Calculating number of zeros in a digit
     */
    public int zeros(int number){
        if(number == 0){ // best case, bottom case
            return 1;
        }
        if(number < 10 && number > -10){
            return 0;
        }
        return zeros(number / 10) + zeros(number % 10);
    }
}