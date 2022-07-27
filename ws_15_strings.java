public class ws_15_strings {
    /*
     * String is non primitive data type : size is not fixed 
     * string is an sequence of characters [arry of characters]
     * CharSequence interface for represent string in java
     * object class is parent class of all the classed in java  
     * String is a pre-defined final class , extends object class and implement CharSequence , serializable , comparable
     * serializable interface is used when we need to store a copy of object and send them to another process which run on the same system or over the network
     * Comparable interface have method toCompare()
     * Since string is a class , it can have object : String s = new String(); -> it will create an immutable object
     * String s = "yash" , it is also consider as an object 
     * To create String , there are three classes : 1)String     2)StringBuffer      3)StringBuilder 
     * String constant pool is in heap area after 1.7 java version , before it was method area
     * String are immutable in java because string objects are cached in string pool. since cached string literals are shared between multiple persons there is always a risk, where one person's action would affect all all another persons , for example is one person changes its city from "yash" to "anubhav" all other persons will also get affected.
     * String class is final because it make it unaccessable to extend. string class has got speacial features which is not available to other java classes and making the string class final prevents subclasses that could break these assumptions
     */
    public static void main(String[] args) {
        char [] c = {'a', 'n','u','b','h','a','v'};
        String s3 = new String(c);
        String s = new String("yash");   //string object created using new keyword allocate in heap area pointing to s and also another object created in string constant pool pointing to reference variable created by JVM 4 future use  , hence using new keyword there is max 2 object created and there is no garbage collection 
        String s1 = "Yash"; // in this case string literal create a memory in string contant pool only for future use 
        System.out.println(s3);
        System.out.println(s);
        System.out.println(s1);   
        //Difference between "==" operator and ".equals()" method -
        // == operator is used for reference comparison (address comparison) , it means == operator check if both objects points to same memory location    or not.
        // .equals() method is used for constant comparison (in string class), it means .equals() method is used to check object value 
        String s4 = new String("yash"); // s4 refers to two object one in the heap and other one is in string contant pool 
        String s5 = new String("yash"); // s5 refers to two new object one in the heap and do not create other one since there is already same literal object created.. 
        // heap memory have 2 objects with same literals and SCP have only one object refers to jvm pointer
        System.out.println(s4==s5); //return - false  , since both have different memory location and == operator compare addresses
        String s7 = "yash"; // s7 points to only one object created in the string constant pool 
        String s8 = "yash"; // s8 points to same object as of s7 pointing
        // now in the string constant pool there is only one literal pointed by two string object [s7 and s8 pointing to same memory location]
        System.out.println(s7 == s8); // return - true 
        // .equals method of "object class " is used to compare the reference or address of two objects points to same memory location or not
        // .equals method of string class is used for content comparison ie. it is used to check object value (string class override the equals method )
        System.out.println(s4.equals(s5)); // return true
        // string class have different contructor form which commonly are :
        // string with no arguement     string with (string s)  string with (StringBuffer sb)   string with (StringBuilder sb)  string with (char[] ch) string with (byte[] b)
        // StringBuilder and StringBuffer create mutable objects whereas string class create immutable objects 
        char [] c1 = {'y','a','s','h'};
        String a = new String(c);
        System.out.println(a);
        //why character array are more sutaible to store password over string in java
        // string objects are immutable in java therefore if a password is stored as plain text it will be available in memory until Garbage collector clears it , but string objects are stored in string literal pool for re-usability and garbage collection is not applicable for scp, which is security threat.
        //with an array , you can explicitly wipe the data after you have done with it , you can overrite the array with anything , and the password wont be present anywhere in the system , even before garbage collection
        // second reason is printing char array dont print the values 
        System.out.println(c1); // character array 
    }

}
