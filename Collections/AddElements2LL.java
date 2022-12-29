package Collections;
import static Collections.SinglyLinkedList.*;
// Q. Given two non-empty linked list representing two non-negative numbers integers. The digits are
// stored in reverse order, and each of their nodes contains a single digit. add the two numbers and return the sum
// as a linked list.
// you may assume the two numbers do not contain any leading zero, except the number 0 itself.
// for eg. -
// a  -->   [3 | ] -> [4 |] -> [3 |] -> null
// b  -->   [5 |] -> [6 |] -> [4 |] -> null
// res-->  [8 |] -> [0 |] -> [8 |] -> null
public class AddElements2LL {
    public  LinkNode add(LinkNode a , LinkNode b){
        LinkNode dummy = new LinkNode(0);
        LinkNode tail = dummy;
        int carry = 0;
        while (a!=null || b!=null){
            int x = (a!=null) ? a.data : 0;
            int y = (b!=null) ? b.data : 0;
            int sum = carry + x +y;
            carry = sum / 10;
            tail.next = new LinkNode(sum%10);
            if(a!=null) a =a.next;
            if(b!=null) b =b.next;
        }
    }
}
