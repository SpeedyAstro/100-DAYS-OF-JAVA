import java.lang.*;
import java.util.*;

public class ws_19_Strbuffer {
    /*
     * main difference between string and stringBuffer is - string objects are immutable ans StringBuffer objects are mutable
     * 
     * when to use string and stringBuffer
     * => if data do not changes or change one or two times only , use string
     * => if data is constantly or frequently changes like in notepad , calc , stringbuffer should be used
     * 
     */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // 16 charactersss
        StringBuffer sb1 = new StringBuffer("yash");
        System.out.println(sb1.capacity());
        StringBuffer sb2 = new StringBuffer(1000); // can provide intitial capacity of sb2 string
        System.out.println(sb2.capacity()); // 1000
        sb1.append("pandey");
        System.out.println(sb1);
        System.out.println(sb.capacity()); // print 16
        sb.append("yash"); //  char - 4 
        System.out.println(sb.capacity()); // print 16
        sb.append("pandey"); //  char - 6
        System.out.println(sb.capacity()); // print 16
        sb.append("Anubhav Pandey"); // char - 14 [total = 24] 
        System.out.println(sb.capacity()); // print 32 -> (old capacity * 2)+2  [old capacity = 16] 
        // capacity automatically increase when default capacity[16] is full 
    }
    
}
