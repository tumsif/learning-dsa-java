package tz.ac.udsm.dsa;

class RaggedArray {
    public boolean isRagged(int arr[][]){
        /**
         * A ragged array is an array in which all rows do not have the same length
         * 
         */
        if (arr == null && arr.length == 0){
            // if an array is empty it means it is not ragged
            return false;
        }

        int fLen = arr[0].length; // get length of initial row for comparison
        
        for(int i=0; i<arr.length; i++){
            // compare every row length with the initial length
            // if the initial length does match it is a ragged
            if(fLen != arr[i].length){
                return true;
            }
        }

        return false;
    }
}