import java.util.StringTokenizer;

public class ws_21_StringBuilder {
    public static void main(String[] args) {
        /*
         * Difference between StringBuffer and StringBuilder
         * 1 StringBuffer methods are synchronized
         *   StringBuilder methods are non-syncronized
         * 
         * 2  StringBuffer follow sequential execution
         *    StringBuilder follows parallel execution
         * 
         * 3 StringBuffer take more execution time
         *   StringBuilder take less execution time
         * 
         * 4 Application performance is slow in StringBuffer
         *   Appilcation performance is fast in case of StringBuilder
         * 
         * 5 StringBuffer is thread safe 
         *   StringBuilder is not thread safe
         * 
         * 6 provides data consistency in stringBuffer
         *   do not provides data consistency in stringBuilder
         * 
         * 7 StringBuffer came in JDK 1.0v 
         *   StringBuilder came in JDK 1.5v
         * 
         */
        /*
         * StringTokenizer - is a class which is used to divide the string  into token
         *  methods - hasMoreToken() - boolean
         *          - countToken()
         */
        StringTokenizer s = new StringTokenizer("This is java SE");
        System.out.println(s.countTokens()); // return 4
        while(s.hasMoreTokens()){
            System.out.println(s.nextToken());
        }
    }
}
