package tz.ac.udsm.dsa.lists;

import java.lang.reflect.Array;

/**
 * Implementation of the List interface using an array.
 * As for implementation with multiple data types it is impossible as java arrays does not accept generic types
 * 
 * Arrays are refiable types, means they carry their type information at runtime
 * Generics are non refiable, means their type information is erased after compilation due to erasure.
 * 
 * For more information see the link from stack overflow https://stackoverflow.com/questions/70572512/why-cant-i-create-generic-array-in-java
 * 
 * Generics cannot work with primitive data types such as int, double, long, float, short, byte, boolean etc.
 * 
 * The only way to do this is to instantiate an array of Object.
 * 
 * I will only cover for int data type and if any other data type will be required. A manual implementation for them should be created.
 */

public class ListArray {
    private int size;
    private int[] array;
    private int index; // keeps track of the last element position

    /* Creates array which is full by default */
    public ListArray(int[] array){
        this.array = array;
        this.size = array.length;
        this.index = array.length - 1;
    }

    /* Creates an array with specified size */
    public ListArray(int size){
        this.array = new int[size];
        this.size = size;
        this.index = 0;
    }

    /* Creates an array and prepopulates it but offer specifying the size */
    public ListArray(int[] array, int size){
        this.array = new int[size];
        
        /**
         * Copy all elements of the array provided into this new array.
         * If we use `this.array = array` it will cause the previous initialization to be discarded 
         * and this.array will take the reference of the outside array which causes the array to be what we did not intend.
         */

        for(int i = 0; i < array.length; i++){
            this.array[i] = array[i];
        }

        this.size = size;
        this.index = array.length - 1;
    }

    public boolean isEmpty(){
        return this.array[0] == 0 || this.size == 0;
    }

    public boolean isFull(){
        return this.array[this.size - 1] != 0;
    }

    public int size(){
        return this.size;
    }

    public int get(int position){
        if(position >= this.size){
            System.out.println("Error: Index overflow");
            return -1;
        }
        return this.array[position];
    }

    public int[] insert(int value){
        if(this.isFull()){
            System.out.println("The List is full");
            return this.array;
        }
        this.array[this.index + 1] = value;
        this.index ++; // update the index to point to the next position
        return this.array;
    }

    public int[] replace(int value, int position){
        if(position >= this.size){
            System.out.println("Error: Index overflow");
            return this.array;
        }
        this.array[position] = value;
        return this.array;
    }

    public int[] removeAt(int position){
        if(position >= this.size){
            System.out.println("Error: Index overflow");
            return this.array;
        }
        this.array[position] = 0;
        return this.array;
    }
    
}