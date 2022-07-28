public class ws_18_StringConversion {
    public static void main(String[] args) {
        /*
         * toUpperCase() method converts all the characters of the string into a upper case letter
         */
        String s = "yash";
        System.out.println(s.toUpperCase()); // return -> YASH
        String s1 = "YASH";
        System.out.println(s1.toLowerCase()); // return -> yash
        // typeconversion methods ************
        //the valueOf() method converts different types of value into string, by the help of String.valueOf() method we can convert int or long or float or double or any any other type into string, valueOf() method is static class thats why method directly by string class.
        int a = 10;
        String cnvrt = String.valueOf(a);
        System.out.println(cnvrt); // int to string
        // the toCharArray() method converts the given string into sequence of characters , the return array length is equal to string length
        char c [] = s.toCharArray();
        System.out.println(c[2]);
        
    }
}
