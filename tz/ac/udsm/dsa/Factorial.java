package tz.ac.udsm.dsa;

import java.util.*;

class Factorial {
    /**
     * Implementation of factorial using iteration method
     */
    public void run(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number ( >=0 ): ");
        int inputValue = input.nextInt();
        if (inputValue < 0){
            System.out.println("Invalid input");
        }else{
            int value = factorial(inputValue);
            System.out.println("The factorial of " + inputValue + " is " + value);
        }
    }
    private static int factorial(int value){
        // n! = n * (n - 1)! where n >= 1
        // 1! = 1
        // 2! = 1 * 2
        // 3! = 1 * 2 * 3
        if ( value == 0 ){
            return 1;
        }else if ( value >= 1 ){
            int fact = 1;

            // loop invariant 
            // fact = (i-1)! 
            // 1 = (1 - 1)!
            // 1 = (2 - 1)!
            // 2 = (3 - 1)!
            for (int i=1; i<=value; i++){
                fact*=i;
            }
            // 1 = (2 - 1)!
            // 2 = (3 - 1)!
            // 6 = (4 - 1)!
            return fact;
        }else {
            return -1;
        }
    }
}