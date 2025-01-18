package tz.ac.udsm.dsa.recursion;

public class Palindrome {
    /**
     * A palindrome problem is too decide whether a given string reads the same in both directions
     * 
     */

    public boolean isPalindrome(String word, int left, int right){
        if(left >= right){ // base case: a word is either empty i.e 0, or the recursion has ended
            return true;
        }
        else if(word.charAt(left) != word.charAt(right)){
            return false;
        }else{
            return isPalindrome(word, left + 1, right - 1);
        }
    }
}