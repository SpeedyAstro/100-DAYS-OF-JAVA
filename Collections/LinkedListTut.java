package Collections;

import java.util.LinkedList;

public class LinkedListTut {
    public static void main(String[] args) {
        /*
         * LinkedList is an implementation class of list interface..
         * present in java.util package.
         * Syntax : public class Linkedlist extends AbstractSequencetialList implements List , Deque , Clonable , Serializable {-}
         * The underline data Structure of LinkedList is Double LinkedList or Circular LinkedList
         * Introduced in 1.2v
         * 
         * Properties of Linked List
         * Linked list is index based DS 
         * Can store different data types
         * can store duplicate elements
         * can store Null values
         * follows the insertion order
         * Linked list doesn't follow sorting order 
         * [same properties as of list , arraylist]
         * Linked list is non synchroized method  (Non synchronized)
         * Linked list allow more than one thread at one time
         * allows parallel execution
         * Linked list reduces the execution time 
         * linked is not threadsafe
         * linked list does not gurantee for data consistency
         * 
         */
        /*
         * Working of LinkedList
         * 1, Types Of linkedlist
         * a. Single Linked List
         * b. Double Linked List
         * c. Circular Linked List
         * 2. Linked List element are not stored in contigeous memory locations.
         * 3. there is no size limit for linked list 
         */
        /*
         * Constructors :
         * public LinkedList();
         * public LinkedList(Collection C);
         */
        /*
         * Methods in Linkedlist :
         * 1. Method of Collection Interface
         * 2. Methods of List interface
         * 3. public void addFirst(Object obj);
         * 4. public void addLast(Object obj);
         * 5. public Object getFirst();
         * 6. public Object getLast()
         * 7. public Object removeFirst()
         * 8. public Object removeLast();
         */
        // 
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("yash");
        ll.add("pandey");
        ll.add(1,"anubhav");
        //ll.add(4,"ash"); throws error
        ll.addFirst("Mr");
        ll.addLast("ok");
        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
    }
    // When to use 
    // superfast in insertion and deletion 
    // when not to use 
    // worst in reterival or searching operations as linked list does not inherit random access interface
    /*
     * difference between Arraylist and linked list
     * 1. Arraylist underline data structure is dynamic array or resizable array
     * Linkelist underline data structure is double linked list or circular linked list
     * 
     * 2. Arraylist stores element in contigeous memory locations 
     * Linkekd list do not store in contigeous memory locations
     * 
     * 3. Arraylist acts as list
     * Linkedlist can acts list and deque
     * 
     * 4. Arraylist is good in reterival operations 
     * Linkedlist is good in insertion and deletion operations
     */
}