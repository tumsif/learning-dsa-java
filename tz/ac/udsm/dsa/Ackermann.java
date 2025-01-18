package tz.ac.udsm.dsa;

import java.util.Scanner;

class Ackermann {
    /**
     * Ackermann function is defined as;
     * A ( m , n ) = { n + 1 if  m = 0; 		                    
     * A ( m − 1 , 1 ) if  m > 0  and  n = 0;  
     * A ( m − 1 , A ( m , n − 1 ) ) if  m > 0  and  n > 0. }
     * It grows so quickly,
     * It arguments are never negative and it always terminates
     */
    private int ackFunction(int m, int n){
        if (m == 0){
            return n + 1;
        }else if(m > 0 && n == 0){
            return ackFunction(m-1, 1);
        }else {
            return ackFunction(m - 1, ackFunction(m, n - 1));
        }
    }

    public void run(){
        Ackermann ackerman = new Ackermann();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int inp1 = input.nextInt();

        System.out.println("Enter second number: ");
        int inp2 = input.nextInt();

        int value = ackerman.ackFunction(inp1, inp2);
        System.out.println("Value for ackermann is " + value);

    }
}