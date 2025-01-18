package tz.ac.udsm.dsa.recursion;

public class BinarySearch {
    /**
     * Search for an item in an array.
     * Compare the search element with the middle element of the array
     * If not equal, then apply a binary search to half the array(if not empty) where the search
     * element would be.
     */

    public int binSearchRec(int[] data, int lowerBound, int upperBound, int value){
        int middleBound = (lowerBound + upperBound) / 2;
        if (data[middleBound] == value){
            return middleBound;
        }
        else if (lowerBound >= upperBound){
            return -1; // not found
        }
        else if (value < data[middleBound]){
            return binSearchRec(data, lowerBound, middleBound - 1, value); // subtract 1 bcs the middle value is already tested therefore going one step less
        }
        else {
            return binSearchRec(data, middleBound + 1, upperBound, value); // same as above but applies to upper margin
        }
    }

    public int binSearchIter(int[] data, int value){
        int firstIndex = 0;
        int lastIndex = data.length - 1;
        int middleIndex;

        while(true){
            middleIndex = (firstIndex + lastIndex) / 2;

            if(data[middleIndex] == value){
                return middleIndex;
            }
            else if(firstIndex >= lastIndex){
                return -1;
            }
            else if(data[middleIndex] < value){
                lastIndex = middleIndex - 1;
            }
            else {
                firstIndex = middleIndex + 1;
            }

        }
    }
}