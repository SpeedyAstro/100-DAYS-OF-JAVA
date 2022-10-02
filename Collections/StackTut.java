//package Collections;

import java.util.Stack;

public class StackTut {
    public static void main(String[] args) {
        /*
         * Stack is the child class of Vector class present in java.util package
         * Syntax : public class Stack extends Vector { - }
         * Stack was introduced in JDK 1.0 version
         * Stack is also known as legacy class (legacy class is the class which was reengineered or restrctured in newer version)
         * 
         */
        Stack<String> s = new Stack<String>();
        s.push("hello");
        s.push("world");
        s.push("Anubhav");
        s.push("Pandey");
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
    }
}
