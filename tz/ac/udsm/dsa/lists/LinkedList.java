package tz.ac.udsm.dsa.lists;
/**
  * A linked list is data structure, in which a node consist of data and the address of the next the node successor.
  * This in turn can have a variable length of collection compared to arrays
  */
public class LinkedList<T> {
    private LinkedList next;
    private T value;

    public LinkedList(T value, LinkedList next){
        this.value = value;
        this.next = next;
    }

    public LinkedList(T value){
        this.value = value;
        this.next = null;
    }

    public void setValue(T value){
        /**
         * A setter method for LinkedList
         */
        this.value = value;
    }

    public T getValue(){
        /**
         * Getter value for LinkedList
         */
        return this.value;
    }

    public void setNext(LinkedList nextReference){
        /**
         * Setter method for next reference
         */
        this.next = nextReference;
    }

    public LinkedList getNext(){
        /**
         * 
         */
        return this.next;
    }

    public void printAllElements(){
        /**
         * Accessing all elements
         */
        LinkedList node = this;
        while(node != null){
            System.out.println(node.value + ", ");
            node = node.next;
        }
    }

    /**
     * Inserting a node into a SSL (Singly Linked List)
     * 
     * As a new first element
     * As the new last element
     * Before a given node (specifies by reference)
     * After a given node
     * Before a given value
     * After a given value
     */

    // Insert at first location
    public LinkedList insertAtFirst(Object value){
        LinkedList newNode = new LinkedList(value, this);
        return newNode;
    }

    // insert a node after a given value
    public void insertAfterValue(Object beforeValue, Object afterValue){
        LinkedList node = this;
        while(node != null){
            if(node.value.equals(beforeValue)){
                LinkedList newNode = new LinkedList(afterValue, node.next);
                node.next = newNode;
                return;
            }
            node = node.next;
        }
        System.out.println("Value " + beforeValue + " not found. No changes made!");
    }

    public void deleteValue(Object value){
        LinkedList currentNode = this;
        LinkedList previousNode = null;

        while(currentNode != null){
            if(currentNode.value.equals(value)){
                if(previousNode == null){
                    // this means it is the first element
                    // thus updating the link to point to the next element deletes the node
                    currentNode = currentNode.next;
                    return;
                }else{
                    // this means it is not the first element, and therefore updating the previous link to point to next elment
                    previousNode.next = currentNode.next;
                    return;
                }
            }

            // moving to next node
            previousNode = currentNode;
            currentNode = currentNode.next;
        }

        System.out.println("There is no value " + value);
    }
}