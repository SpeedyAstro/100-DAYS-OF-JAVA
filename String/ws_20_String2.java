public class ws_20_String2 {
    public static void main(String[] args) {
        // String str1 = new String("YASH");
        byte [] b = {97};
        String str2 = new String(b);
        System.out.println(str2); // returns - a (ascii value of a is 97)
        byte [] b1 = {65, 78 ,85, 66, 72, 65, 86 };
        String str3 = new String(b1);
        System.out.println(str3);
        byte [] b3 = {97 ,110, 117, 98 ,104 ,97 ,118 };
        String str4 = new String(b3);
        System.out.println(str4);
        char [] c = {'a','n','u'};
        String str5 = new String(c);
        System.out.println(str5);

        /*
         * tempelete for validating User Input
         * = length() 
         * = isEmpty()
         * = trim() removes spaces 
         */
        /*
         * Tempelete for Comparing two string 
         * = equals()
         * = equalsIgnoreCase()
         * = compareTo()
         * = compareToIgnoreCase()
         */
        /*
         * Concatination of two string
         * = '+' operator
         * = concat() = concats string
         */
        /*
         * Get substring from string
         * = subString()
         * = subSequence()
         */
        /*
         * Replacing or removing character
         * = replace()
         * = replaceFirst()
         * = replaceAll()
         */
        /*
         * Searching character in string
         * = indexOf()
         * = lastIndexOf()
         * = contains()
         * = charAt()
         * = endsWith()
         * = startsWith()
         */
    }
}
