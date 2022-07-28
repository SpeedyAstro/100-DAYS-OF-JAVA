import java.util.*;
public class ws_17_SearchString {
    public static void main(String[] args) {
        // the indexOf() method returns the position of the first occurence of specified character(s) in a string or return -1, if the character does not found.
        String s = "yash pandey";
        System.out.println(s.indexOf('s')); // return interger value
        System.out.println(s.lastIndexOf('a')); // lastindexOf returns the position of last occurence of the specified characters in a string or return -1 , if character does not found
        // the charAt() method returns the character at specified index position. the index value should between 0 and length-1
        System.out.println(s.charAt(2)); // return string 
        // the contain method searches the sequences of character in the given string. it return true if sequence of char values found in the string else return false.
        System.out.println(s.contains("dey")); // return true 
        // the startWith() method tests if a string starts with the specified prefix begining from the 1st index , if then it return true elsewise false.
        System.out.println(s.startsWith("pan")); // return false
        //the endsWith() method check wheather the string ends with specified suffix , if yes it will return true elsewise false.
        System.out.println(s.endsWith("dey")); // return true
        
        
    }
}
