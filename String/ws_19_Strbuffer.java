import java.lang.*;
import java.util.*;

public class ws_19_Strbuffer {
    /*
     * main difference between string and stringBuffer is - string objects are
     * immutable ans StringBuffer objects are mutable
     * 
     * when to use string and stringBuffer
     * => if data do not changes or change one or two times only , use string
     * => if data is constantly or frequently changes like in notepad , calc ,
     * stringbuffer should be used
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
        sb.append("yash"); // char - 4
        System.out.println(sb.capacity()); // print 16
        sb.append("pandey"); // char - 6
        System.out.println(sb.capacity()); // print 16
        sb.append("Anubhav Pandey"); // char - 14 [total = 24]
        System.out.println(sb.capacity()); // print 32 -> (old capacity * 2)+2 [old capacity = 16]
        // capacity automatically increase when default capacity[16] is full
        System.out.println(sb);
        System.out.println(sb.delete(0, 10)); // delete method // return Anubhav Pandey
        System.out.println(sb.deleteCharAt(3));
        // .equals() method in bufferclass do not override from object class , hence it
        // check if content is at same memory location or not unlikely equals() method
        // in string class
        StringBuffer s5 = new StringBuffer("Anubhav Pandey");
        System.out.println(sb);
        System.out.println(sb.equals(s5));
        System.out.println(sb.indexOf("t"));
        System.out.println(s5.insert(3, "dkdk"));
        System.out.println(s5.replace(3, 7, "gg"));
        System.out.println(s5.reverse());
        StringBuffer sk = new StringBuffer();
        System.out.println(sk.capacity()); // return 16
        sk.ensureCapacity(100); //
        System.out.println(sk.capacity()); // return 100
        System.out.println(sk.append("yash pandey"));
        sk.setCharAt(1, 'y');
        sk.setLength(4);
        System.out.println(sk);
        System.out.println(sk.capacity());
        sk.trimToSize();
        System.out.println(sk.capacity());

    }

}
