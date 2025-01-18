package tz.ac.udsm.dsa;

class Arrays {
    /**
     * Arrays is a data structure that represents a collection of data with same data type
     * Array declaration
     * datatype[] arrayname; or datatype arrayname[];
     * 
     * Array creation
     * arrayname = new datatype[arraysize];
     * 
     * NOTE: Once an array is created, its size is fixed. It cannot be changed.
     * arrayname.length returns array size
     * 
     */
    double numbers[] = {1.2, 3.2, 9.3, 5.4};
    /**
     * this wont work
     * double numbers[];
     * numbers = {1.2, 3.2, 9.3, 5.4};
     */

    // Creating multidimensional array
    int[][] matrix = new int[5][5];
    //matrix[2][2] = 20;

    // or
    int[][] matrix2 = {
        {1, 2, 3, 4, 5},
        {6, 7, 8, 9, 10},
        {11, 12, 13, 14, 15},
        {16, 17, 18, 19, 20},
        {21, 22, 23, 24, 25}
    };

    public boolean equals(int arrOne[][], int arrTwo[][]){
        /**
         * Checks where two dimensional arrays are equal
         */

        if(arrOne.length != arrTwo.length){
            // if the rows are not equal return false
            return false;
        }

        for(int i=0; i<arrOne.length; i++){
            if(arrOne[i].length != arrTwo[i].length){
                // prevents occations where the length of column are not equal
                return false;
            }
            for(int j=0; j<arrOne[i].length; j++){
                if(arrOne[i][j] != arrTwo[i][j]){
                    return false;
                }
            }
        }

        // if all conditions are passed just return a true
        return true;
    }

    public int[] linearize(int[][] arr){
        if(arr.length == 0 || arr == null){
            return new int[0];
        }

        // calculate total number of elements
        int totalLength = 0;
        for(int i=0; i<arr.length; i++){
            totalLength += arr[i].length;
        }

        // create an instance of one dimensional array
        int[] oneDimensional = new int[totalLength];
        int lastIndex = 0; // kepps track of last position
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                oneDimensional[lastIndex] = arr[i][j];
                lastIndex++;
            }
        }

        return oneDimensional;
    }

    /**
     * Deleting from arrays
     * 
     * Algorithm to delete from arrays
     * 
     * 1. Check if the position to delete an element is valid
     * 2. If the position is invalid, return the original size as no deletion happened
     * 3. If the position is valid then shift the elements to the left to fill the gap.
     * 4. Return the new size of array
     */

    public int deleteItem(int[] arr, int position){

        if (position < 0 || position >= arr.length) {
            System.out.println("Invalid position");
            return arr.length;
        }

        for(int i = position; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }
        return arr.length - 1;
    }
}