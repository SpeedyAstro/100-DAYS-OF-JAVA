/* 
 * Array is collection of Homogenous/similar data types thus strongly typed.
 * data in array are partition in adjacent or contiguous.
 * Size of Array is fixed and elements of array can be accessed by their index
 * Array is dynamically allocated 
 * Array are objects and thus they occupy memory in heap
 * size of array is fixed , that could lead to memory wastage or insufficient memory.
 * if an element of array is inserted or deleted than rest of adjecent elements need to be shift , that also make performance slow
 * Array can be used to implement other data structures like linked list, stacks, queues, trees , graphs etc.
 * Arrays do not have add or remove methods 
 * empty int array contains 0 values and string contains null
 * Array creation:
 *  
 */
class ws_01_introArray{
    public static void main(String[] args) {
        int [] arr; //arr is reference variable
        arr = new int[10]; // dynamically array using new keyword
        int arr1 [] = new int[] {1,2,24,22,23}; // intialize array with values.
        int arr2 [];
        arr2 = new int[10];
        arr2[0] = 1;
        arr[1] = 2;
        arr[2] = 3; 
        System.out.println(arr.length); // length if array
        System.out.println(arr1.length); // length if array
        System.out.println(arr2.length); // length if array
        int [] a,b; //creating/intializing two array in one line
        a = new int[0]; // cam ne declared with length 0
        //b = new int [-1]; // throw an error "NegativeArraySizeException"
        int [] c = {10,21,22}; 

    }
}
