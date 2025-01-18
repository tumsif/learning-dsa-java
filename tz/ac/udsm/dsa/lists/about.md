# Lists
It is an ADT which consists of elements of the same type arranged in sequential order.
Java implements lists such as LinkedList in `java.utils.LinkedList`

The following operations can be performed on the list.
- insert() - inserts element at a given position on the list.
- get() - return an element from list at a given position.
- removeAt() - removes the element at a specified location from a non-empty list.
- replace() - replace an element at any position by another element.
- size() - return number of elements on a list.
- isEmpty() - return true if the list is empty, otherwise return false.
- isFull() - return true if the list is full, otherwise return true.

Lists interface can be created using Array or LinkedLists.

However It is advised to use Lists created using LinkedList because of the advantages offered by LinkedList

- The List can never be full in LinkedList implementation unlike using array which requires reinitialization of a new array with larger size.

- The deletion of elements in Array takes an operation of O(n^2) because the elements inside the array need to be reshifted to accomodate the removal of the element