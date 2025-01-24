package tz.ac.udsm.dsa;
/**
  * A linked list is data structure, in which a node consist of data and the address of the next the node successor.
  * This in turn can have a variable length of collection compared to arrays
  */
class Node<T> {
    Node next;
    T value;

    Node(T value, Node next){
        this.value = value;
        this.next = next;
    }

    public void printAllElements(){
        /**
         * Accessing all elements
         */
        Node node = this;
        while(node != null){
            System.out.println(node.value + ", ");
            node = node.next;
        }
    }

    /**
     * Inserting a node into a SSL
     * 
     * As a new first element
     * As the new last element
     * Before a given node (specifies by reference)
     * After a given node
     * Before a given value
     * After a given value
     */

    // Insert at first location
    public Node<T> insertAtFirst(T value){
        Node newNode = new Node(value, this);
        return newNode;
    }

    // insert a node after a given value
    public void insertAfterValue(Object beforeValue, Object afterValue){
        // for (Node node = this; node != null; node = node.next){
        //     if(node.value.equals(beforeValue)){
        //         Node newNode = new Node(afterValue, node.next);
        //         node.next = newNode;
        //         return;
        //     }
        // }

        Node node = this;
        while(node != null){
            if(node.value.equals(beforeValue)){
                Node newNode = new Node(afterValue, node.next);
                node.next = newNode;
                return;
            }
            node = node.next;
        }
        System.out.println("Value " + beforeValue + " not found. No changes made!");
    }

    public void deleteValue(Object value){
        Node currentNode = this;
        Node previousNode = null;

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

        // Node firstNode = this; // its predesessor
        
        // while(firstNode != null){

        //     Node nextNode = firstNode.next; // node to be checked
        //     // find occurence
        //     // change the reference of its predesessor

        //     if(firstNode.value.equals(value)){
        //         // if it is the first element
        //         // change the header link
        //         firstNode = nextNode;
        //         return;
        //     }

        //     if(nextNode != null){
        //         if(nextNode.value.equals(value)){
        //             // if it is other elements
        //             // change the link of the predesessor
        //             firstNode = nextNode.next;
        //             return;
        //         }
        //     }
        //     // iterate to next
        //     firstNode = firstNode.next;
        // }

        // // after all conditions not met output a message
        // System.out.println("There is no " + value);
    }
}