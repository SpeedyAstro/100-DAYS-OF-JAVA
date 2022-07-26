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
     * String contant pool is in heap area after 1.7 java version , before it was method area
     * String are immutable in java because string objects are cached in string pool. since cached string literals are shared between multiple persons there is always a risk, where one person's action would affect all all another persons , for example is one person changes its city from "yash" to "anubhav" all other persons will also get affected.
     */
    public static void main(String[] args) {
        char [] c = {'a', 'n','u','b','h','a','v'};
        String s3 = new String(c);
        String s = new String("yash");   //string object created using new keyword allocate in heap area pointing to s and also another object created in string contant pool pointing to reference variable created by JVM 4 future use  , hence using new keyword there is max 2 object created and there is no garbage collection 
        String s1 = "Yash"; // in this case string literal create a memory in string contant pool only for future use 
        System.out.println(s3);
        System.out.println(s);
        System.out.println(s1);        
    }

}
