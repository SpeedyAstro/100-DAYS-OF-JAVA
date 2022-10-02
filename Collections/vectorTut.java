// package Collections;

import java.util.Vector;

public class vectorTut {
    public static void main(String[] args) {
        /*
         * Vector is an implementation class of List
interface which is present in java.util package
        * Syntax : public class Vector extends
AbstractList implements List, RandomAccess,
Cloneable, Serializable { - }
        * The underline data structure of Vector is
resizable array or growable array
Vector was introduced in JDK 1.0 version
        * Vector class is also known as legacy class.
(Legacy class is the class which was formed in
previous version and was restructured or reengineered in new version)
        *  Properties of Vector :-
        * 1. Vector is an index based Data Structure
        * Vector can store different data types elements
or hetrogeneous elements
        * We can store any number of null values in the
        Vector
        5. Vector follows the insertion order which means the sequence in which we are inserting the
        elements, in the same sequence we can retrieve the elements
        6. Vector does not follow the sorting order (above properties are same as List interface)
        7. Vector is synchronized collection because Vector contains many synchronized method
        8. Vector does not allow more than one thread at one time
        9. Vector does not allow parallel execution or Vector allows sequential execution
        10. Vector increases the execution time which in turn makes the application slow
        11. Vector is threadsafe
        12. Vector gurantee for data consistency    

        -> Working of Vector :-
        1. When we create a vector, a vector of 10 initial capacity is created
        2. When the vector is full, then new vector will be
        created automatically with new capacity = current capacity * 2;
        3. When new vector is created then all the elements from old vector will copied to new vector and then the reference variable will point
        to the new vector and garbage collector will delete the previous vector from the memory-> 

        Constructors of Vector :-
        1. public Vector()
        2. public Vector(int capacity)
        3. public Vector(int capacity, int
        incremental_ratio)
        4. public Vector(Collection c)

        Methods :-
        1. Vector contains all the methods of Collection
        interface
        2. Vector contains all the methods of List
        interface
        1. public synchronized int capacity()
        2. public synchronized void addElement(Object
        obj)
        3. public synchronized Object firstElement()
        4. public synchronized Object lastElement()
        5. public synchronized boolean
        removeElement(Object obj)

        6. public synchronized void
        removeElementAt(int index)
        7. public synchronized void removeAllElements()
         */
        Vector<Integer> v = new Vector<Integer>();
        System.out.println(v.capacity());
        for(int i = 0 ;  i < 11 ; i++){
            v.addElement(i);
        }
        System.out.println(v);
        System.out.println(v.capacity());
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        v.removeElementAt(3);
        System.out.println(v);
        v.removeAllElements();
        System.out.println(v);
        
    }
}
