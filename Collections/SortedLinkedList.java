package Collections;

import static Collections.SinglyLinkedList.*;

public class SortedLinkedList {
    // remove duplicates from the sorted linked list
    public void removeDuplicates(){
        LinkNode current = head;
        while (current!=null&&current.next!=null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }
    // Insert node
    public void insertNode(int value){
        LinkNode newNode = new LinkNode(value);
        if (head == null) System.out.println("no linked list found!!");
        LinkNode current = head;
        LinkNode temp = null;
        while (current!=null && current.data<newNode.data){
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
    }
}
