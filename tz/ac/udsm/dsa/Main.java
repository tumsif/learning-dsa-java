package tz.ac.udsm.dsa;

import tz.ac.udsm.dsa.Ackermann;
import tz.ac.udsm.dsa.Factorial;
import tz.ac.udsm.dsa.arrays.Arrays;
import tz.ac.udsm.dsa.arrays.RaggedArray;
import tz.ac.udsm.dsa.Node;

import tz.ac.udsm.dsa.recursion.Palindrome;
import tz.ac.udsm.dsa.recursion.Fibonacci;
import tz.ac.udsm.dsa.recursion.NumberOfZero;
import tz.ac.udsm.dsa.recursion.HanoiTowers;
import tz.ac.udsm.dsa.recursion.BinarySearch;

import tz.ac.udsm.dsa.iterations.Exponential;


class Main {
    public static void main(String[] args){
        // Ackermann ackerman = new Ackermann();
        // ackerman.run();

        // Factorial factorial = new Factorial();
        // factorial.run();

        // Arrays arr = new Arrays();
        // System.out.println(arr.matrix2[1][2]);

        // int raggedArr[][] = {
        //     {1, 2, 3, 4},
        //     {5, 6, 7},
        //     {8, 9},
        //     {10}
        // };

        // int nonRaggedArr[][] = {
        //     {1, 2, 3, 4},
        //     {5, 6, 7, 8},
        //     {9, 10, 11, 12},
        //     {10, 11, 12, 13}
        // };

        // RaggedArray rgdArr = new RaggedArray();
        // // System.out.println(rgdArr.isRagged(raggedArr));
        // // System.out.println(rgdArr.isRagged(nonRaggedArr));


        // Arrays arr = new Arrays();

        // int arr1[][] = {
        //     {10, 20, 30},
        //     {50, 40}
        // };
        // int arr2[][] = {
        //     {10, 20, 30},
        //     {50, 40}
        // };
        // int arr3[][] = {
        //     {10, 30, 20},
        //     {50, 40, 60}
        // };
        // int arr4[][] = {
        //     {10, 20, 30},
        //     {40, 50, 60}
        // };
        // int arr5[][] = {
        //     {10, 20, 30},
        //     {40, 50},
        //     {60}
        // };
        // int arr6[][] = {
        //     {10, 20, 30},
        //     {40, 50, 60}
        // };
        // System.out.println(arr.equals(raggedArr, nonRaggedArr));
        // System.out.println(arr.equals(arr1, arr2));
        // System.out.println(arr.equals(arr3, arr4));
        // System.out.println(arr.equals(arr5, arr6));

        // int[] linearizedArr = arr.linearize(arr1);
        // for(int i=0; i<linearizedArr.length; i++){
        //     System.out.println(arr.linearize(arr1)[i]);
        // }

        // Node numerals = new Node<String>("one", new Node<String>("two", new Node<String>("three", null)));
        Node<Integer> numerals = new Node<Integer>(1, new Node<Integer>(2, new Node<Integer>(3, null)));

        // numerals is added a new element just before the first element and then reassigned to the numeral value
        numerals = numerals.insertAtFirst(0);
        // numerals.printAllElements(numerals);

        // changes the value a certain value at the node or print not found
        numerals.insertAfterValue(2, 5);
        // numerals.printAllElements(numerals);

        numerals.deleteValue(0);
        numerals.deleteValue(5);
        // numerals.printAllElements();


        // palindrome
        String word = "one";
        String word2 = "ono";

        Palindrome plndr = new Palindrome();
        System.out.println(plndr.isPalindrome(word, 0, (word.length() - 1)));
        System.out.println(plndr.isPalindrome(word2, 0, (word.length() - 1)));

        // fibonacci numbers
        Fibonacci fib = new Fibonacci();
        // System.out.println(fib.fibonacci(8)); // 0, 1, 1, 2, 3, 5, 8, 13, 21

        // numbers of zeros in a digit
        NumberOfZero noOfZero = new NumberOfZero();
        // System.out.println(noOfZero.zeros(10204));

        // implementation of towers of hanoi
        HanoiTowers towers = new HanoiTowers();
        // towers.hanoi(3, 'A', 'C', 'B');
        // towers.hanoi(4, 'A', 'C', 'B');
        BinarySearch bsrc = new BinarySearch();

        int arr2[] = {1, 2, 7, 8, 3, 4, 5, 6, 7, 10}; // 3720.0ns recursive, 5001.0 iterative

        int arr[] = {1, 2, 3, 4, 5}; // 2833.0ns recursive, 3095.0ns. iterative

        /**
         * It is found out that recursive binary search takes less time than iterative approach
         */

        /**
         * For cases where the item is at the center the difference is massive
         * Recursive binary search, 1831.0 ns
         * Iterative binary search, 5003.0 ns
         */

        double startTime, endTime;

        startTime = System.nanoTime();
        bsrc.binSearchRec(arr, 0, arr.length, 3);
        endTime = System.nanoTime();
        System.out.println("Recursive binary search took " + (endTime - startTime) + "ns.");

        
        startTime = System.nanoTime();
        bsrc.binSearchIter(arr, 3);
        endTime = System.nanoTime();
        System.out.println("Iterative binary search took " + (endTime - startTime) + "ns.");

        startTime = System.nanoTime();
        Exponential exp = new Exponential();
        endTime = System.nanoTime();
        System.out.println("The value of e^(3) in taylor series for n = 4 is " + exp.exponent(3, 4));
        System.out.println("It  took a time of " + (endTime - startTime) + "ns");


        /**
         * Creating array of objects
         */
        Node[] intArray = new Node[2];
        intArray[0] = new Node(1, null);
        System.out.println(intArray[0].value);


        /**
         * Simulating deletion of item in an array given its index
         */
        int[] arrayDemo = {1, 2, 4, 10, 20, 30};

        Arrays arrayObjectDemo = new Arrays();
        int aSize = arrayObjectDemo.deleteItem(arrayDemo, 2);

        System.out.println(aSize);

        for(int i = 0; i < aSize; i++){
            System.out.print(arrayDemo[i] + ", ");
        }

        System.out.println();
    }
}