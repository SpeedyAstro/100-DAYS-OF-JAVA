
public class ws_16_StringMethod {
    public static void main(String[] args) {
        /*
         * String methods 
         */
        //the string length() method counts the number of characters in the string and returns it in integer. this method returs it in integer. this method returns the length of string which is equal to the number of 16 bit unicode character in string.
        String s = "yash";
        System.out.println(s.length());
        String s1 = "";
        System.out.println(s1.length());
        String n = null;
        //System.out.println(n.length()); -> return nullpointerException
        // THe isEmpty() method of a strin class is included in java string in jdk 1.6 this method return true if given string is empty , else return false or this method returns true if length of string is 0.
        String s2 = "";
        if(s2.isEmpty()){
            System.out.println("empty string");
        }
        // trim() method of string class eliminated only leading and trailing spaces . the unicode value of space character is "\u0020". the trim() method in java checks the the unicode value before and after the string , if it exists then remove the space and returs the omitted string 
        // trinm() return in string
        String s3 = "      yash pandey   ";
        System.out.println(s3.trim());
        if(s3.trim().length() != 0){
            System.out.println("not null");
        }
        String name = "yash";
        String name1 = "Yash";
        // .equal method is case sensitive , it return false if even if only case dont match
        // to ignore case comparison , there is another method in string class -> equalsIngnoreCase() method 
        // this method is used to compare a specified string to another string, ignoring case considirations ie. lower and upper case , two string are considered equal ignoring case if they are of the same length and corresponding characters   are equal
        System.out.println(name.equalsIgnoreCase(name1)); // return true 
        String s4 = "A";
        String s5 = "a";
        System.out.println(s4.compareTo(s5)); // return in [int] ascii value [ascii value of A] - [ascii value of a]
        // if both have same ascii return 0
        System.out.println(s4.compareToIgnoreCase(s5)); // returns 0 , it ignore case differences
        // contatinations 
        System.out.println(name+name1); // returns yashYash 
        System.out.println(name+10); // returns yash10
        System.out.println(name+10+20); //returns yash1020
        System.out.println(10+20+name); // returns 30yash
        System.out.println(10+name+20); // returns 10yash20
        System.out.println(name+20/10); // returns yash2 [follows BODMAS]
        //concant() method concatenates one string to end of another string. this method returns a string with the value of string passed into the method, appended to the end of string.
        System.out.println(name.concat(name1)); // returns yashYash
        // join(charSequence delimiter, charSequence... elements) is the static method which concatenates the given elements with the delimiter and returns the concatenated string. it was included in jdk 1.8 version
        // note tf an element is null , then null is added and if delimiter is null then it will throw "java.lang.NullPointerException"
        System.out.println(String.join(",", name,name1)); // returns yash,Yash
        System.out.println(String.join("/", name,name1,name,name1)); // returns yash/Yash/yash/Yash
        // delimiter cant be null
        // sting slicing ..
        System.out.println(name.subSequence(1, 4));
        System.out.println(name.substring(2));
    }
}
