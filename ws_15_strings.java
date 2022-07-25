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
     */
    public static void main(String[] args) {
        char [] c = {'a', 'n','u','b','h','a','v'};
        String s = new String(c);
        System.out.println(c);
        System.out.println(s);        
    }

}
