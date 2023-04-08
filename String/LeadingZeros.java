public class LeadingZeros {
    public static void main(String[] args) {
        String s = "00001234";
        removeLeadingZero(s);
        removeLeadingZeros(s);
    }
    // <--- remove leading zeros using regex -------> 
    public static void removeLeadingZero(String s){
        String result = s.replaceFirst("^0+(?!$)", "");
        //  (?!$) lookahead assertion is used to ensure that there are no more characters after the zeros
        System.out.println(result);
    }

    // <----- remove leading zeros -------> 
    public static void removeLeadingZeros(String s){
        int i =0;
    // Iterate through the string and increment the counter for each leading zero.
        while(i<s.length() && s.charAt(i)=='0'){
            i++;
        }
        String ans = (i==s.length())? "0" : s.substring(i);
        System.out.println(ans);
    }

    public static void removeLeadingZeroIfNegative(String s){
        String result = s.replaceFirst("^(-?)0+(?!$)", "$1");
        System.out.println(result);
    }
    public static String removeLeadingZerosIfNegative(String s){
        if (s == null || s.isEmpty()) {
            return "0";
        }
        
        int i = 0;
        boolean isNegative = false;
        if (s.charAt(0) == '-') {
            i++;
            isNegative = true;
        }
        while(i<s.length() && s.charAt(i)=='0'){
            i++;
        }
        if(i==s.length()) return isNegative? "-0" : "0";
        String result = s.substring(i);
        return isNegative? "-"+result : result;
    }
}
