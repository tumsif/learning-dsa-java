package tz.ac.udsm.dsa;

import java.util.Scanner;

import tz.ac.udsm.dsa.Ackermann;
import tz.ac.udsm.dsa.Factorial;
import tz.ac.udsm.dsa.Node;
import tz.ac.udsm.dsa.PalindromeTwo;

import tz.ac.udsm.dsa.arrays.Arrays;
import tz.ac.udsm.dsa.arrays.RaggedArray;

import tz.ac.udsm.dsa.lists.ListArray;

import tz.ac.udsm.dsa.recursion.Palindrome;
import tz.ac.udsm.dsa.recursion.Fibonacci;
import tz.ac.udsm.dsa.recursion.NumberOfZero;
import tz.ac.udsm.dsa.recursion.HanoiTowers;
import tz.ac.udsm.dsa.recursion.BinarySearch;

import tz.ac.udsm.dsa.iterations.Exponential;

import tz.ac.udsm.dsa.stacks.StacksArray;
import tz.ac.udsm.dsa.stacks.StacksLinkedList;


class Main {
    public static void main(String[] args){
        System.out.println("Running a program Main");

        System.out.println("Ackermann function running");
        Ackermann ackerman = new Ackermann();
        ackerman.run();
        System.out.println("Factorial function ended \n");

        System.out.println("Factorial function running");
        Factorial factorial = new Factorial();
        factorial.run();
        System.out.println("Factorial function ended \n");

        System.out.println("Arrays implementation running");

        Arrays arr = new Arrays();
        System.out.println(arr.matrix2[1][2]);

        int raggedArr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7},
            {8, 9},
            {10}
        };

        int nonRaggedArr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {10, 11, 12, 13}
        };

        RaggedArray rgdArr = new RaggedArray();
        System.out.println(rgdArr.isRagged(raggedArr));
        System.out.println(rgdArr.isRagged(nonRaggedArr));

        int arr1[][] = {
            {10, 20, 30},
            {50, 40}
        };
        int arr2[][] = {
            {10, 20, 30},
            {50, 40}
        };
        int arr3[][] = {
            {10, 30, 20},
            {50, 40, 60}
        };
        int arr4[][] = {
            {10, 20, 30},
            {40, 50, 60}
        };
        int arr5[][] = {
            {10, 20, 30},
            {40, 50},
            {60}
        };
        int arr6[][] = {
            {10, 20, 30},
            {40, 50, 60}
        };
        System.out.println(arr.equals(raggedArr, nonRaggedArr));
        System.out.println(arr.equals(arr1, arr2));
        System.out.println(arr.equals(arr3, arr4));
        System.out.println(arr.equals(arr5, arr6));

        int[] linearizedArr = arr.linearize(arr1);

        System.out.println("Linearizing array");
        for(int i=0; i<linearizedArr.length; i++){
            System.out.print(arr.linearize(arr1)[i] + ", ");
        }
        System.out.println("\n");

        System.out.println("Node implementation");
        // Node numerals = new Node<String>("one", new Node<String>("two", new Node<String>("three", null)));
        Node<Integer> numerals = new Node<Integer>(1, new Node<Integer>(2, new Node<Integer>(3, null)));

        System.out.println("Printing all elements created at the beginning of node creation");
        numerals.printAllElements();
        System.out.println();

        // numerals is added a new element just before the first element and then reassigned to the numeral value
        System.out.println("Inserting 0 at the first node");
        numerals = numerals.insertAtFirst(0);
        numerals.printAllElements();
        System.out.println();

        // changes the value a certain value at the node or print not found
        System.out.println("Inserting 5 after 2");
        numerals.insertAfterValue(2, 5);
        numerals.printAllElements();
        System.out.println();

        // deletes a value from the node
        System.out.println("Deleting 0 and 5");
        numerals.deleteValue(0);
        numerals.deleteValue(5);
        numerals.printAllElements();
        System.out.println();

        // palindrome
        System.out.println("Palindrome implementation");
        System.out.println("A word is palindrome if it can be spelled backwards and still be the same \n");

        System.out.println("Consider word one and ono");
        String word = "one";
        String word2 = "ono";

        Palindrome plndr = new Palindrome();
        System.out.println("one is palindrome? " + plndr.isPalindrome(word, 0, (word.length() - 1)));
        System.out.println("ono is palindrome? " + plndr.isPalindrome(word2, 0, (word.length() - 1)));

        // fibonacci numbers
        System.out.println("\nFibonacci implementation");
        Fibonacci fib = new Fibonacci();
        System.out.println("Fibonnacci of index 8 is " + fib.fibonacci(8)); // 0, 1, 1, 2, 3, 5, 8, 13, 21

        // numbers of zeros in a digit
        NumberOfZero noOfZero = new NumberOfZero();
        System.out.println("10204 has " + noOfZero.zeros(10204) + " zeroes.");

        // implementation of towers of hanoi
        System.out.println("\nTowers of Hanoi implementation");
        HanoiTowers towers = new HanoiTowers();
        System.out.println("Hanoi towers with 3 disks");
        towers.hanoi(3, 'A', 'C', 'B');
        System.out.println("\n");
        System.out.println("Hanoi towers with 4 disks");
        towers.hanoi(4, 'A', 'C', 'B');
        System.out.println("Hanoi towers ended \n");

        // binary search
        System.out.println("Binary search implementation");
        BinarySearch bsrc = new BinarySearch();

        int largeSizeArr[] = {1, 2, 7, 8, 3, 4, 5, 6, 7, 10}; // 3720.0ns recursive, 5001.0 iterative

        int smallSizeArr[] = {1, 2, 3, 4, 5}; // 2833.0ns recursive, 3095.0ns. iterative

        /**
         * It is found out that recursive binary search takes less time than iterative approach
         */

        /**
         * For cases where the item is at the center the difference is massive
         * Recursive binary search, 1831.0 ns
         * Iterative binary search, 5003.0 ns
         */

        System.out.println("Running a binary search on an array " + smallSizeArr);
        System.out.println("Computing the implementation of binary search on the array\n");
        double startTime, endTime;

        startTime = System.nanoTime();
        bsrc.binSearchRec(smallSizeArr, 0, smallSizeArr.length, 3);
        endTime = System.nanoTime();
        System.out.println("Recursive binary search took " + (endTime - startTime) + "ns.");

        
        startTime = System.nanoTime();
        bsrc.binSearchIter(smallSizeArr, 3);
        endTime = System.nanoTime();
        System.out.println("Iterative binary search took " + (endTime - startTime) + "ns.");

        startTime = System.nanoTime();

        System.out.println("\n Using Taylor series to calculate e^(n)");
        Exponential exp = new Exponential();
        endTime = System.nanoTime();
        System.out.println("The value of e^(3) in taylor series for n = 4 is " + exp.exponent(3, 4));
        System.out.println("It  took an excecution time of " + (endTime - startTime) + "ns\n");


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

        int aSize = arr.deleteItem(arrayDemo, 2);

        System.out.println("Given the array " + arrayDemo.toString() + " and the index 2, the array after deletion is " + arrayDemo.toString() + " and the size of the array is " + aSize);


        /**
         * ListsArray implementation. For interger only
         */
        System.out.println("\nImplementing List ADT using arrays");
        System.out.println("Consider array {1, 2, 3, 4, 5}");
        int[] arrList = {1, 2, 3, 4, 5};
        ListArray listArr = new ListArray(arrList);
        System.out.println("Is array empty " + listArr.isEmpty());

        ListArray emptyListArr = new ListArray(10);
        System.out.println("\nConsider an array with size 10 but empty");
        System.out.println("Is array empty? " + emptyListArr.isEmpty());

        int[] emptyArr = {};
        ListArray empty = new ListArray(emptyArr);
        System.out.println("\nConsider an array with size 0");
        System.out.println("Is array empty? " + emptyListArr.isEmpty());

        System.out.println("\nIs array {1, 2, 3, 4, 5} full " + listArr.isFull());
        System.out.println("Is an array with size 10 full? " + emptyListArr.isFull());

        ListArray longArr = new ListArray(arrList, 10);
        System.out.println(longArr.get(6));

        int[] intermediateArr = longArr.insert(8);
        for(int i = 0; i < intermediateArr.length; i++){
            System.out.print(intermediateArr[i] + ", ");
        }
        System.out.println("\n");

        System.out.println("Stacks implementation for Array");
        StacksArray stack = new StacksArray(5);
        stack.push(10);
        stack.push(5);
        stack.push(4);
        System.out.println(stack.pop()); // 4
        System.out.println(stack.pop()); // 5
        stack.popAll(); // removes everithing
        System.out.println(stack.pop()); // -1

        System.out.println("\nStacks implementation for Linked list");
        StacksLinkedList<Integer> stackLinked = new StacksLinkedList();
        stackLinked.push(10);
        stackLinked.push(5);
        stackLinked.push(4);
        for(int i = 0; i < 10000; i++){
            stackLinked.push(i);
        }
        System.out.println(stackLinked.pop()); // 4
        System.out.println(stackLinked.pop()); // 5
        System.out.println(stackLinked.pop()); // 10
        stackLinked.popAll(); // removes everithing
        System.out.println(stackLinked.pop()); // -1


        System.out.println("\nFinding Palindrome of string");
        System.out.print("Enter your string: ");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        scan.close();
        PalindromeTwo palindromeTester = new PalindromeTwo();
        boolean isPalindrome = palindromeTester.isPalindrome(text);
        System.out.println("Is " + text + " a palindrome " + isPalindrome);
    }
}