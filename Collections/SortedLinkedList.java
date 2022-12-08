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
    //remove node
    public void deleteNode(int value){
        LinkNode newNode = new LinkNode(value);
        if(head==null) System.out.println("no linked list found!");
        LinkNode current = head;
        LinkNode temp = null;
        if(current!=null&&current.data==value) { head = current.next; return;}
        while (current!=null&&current.data!=newNode.data){
            temp = current;
            current = current.next;
        }
        if(current==null) return;
        temp.next = current.next;
    }
    // check to detect a loop in Singly Linked list
    public static boolean detectLoop(){
        LinkNode fastPtr = head;
        LinkNode slowptr = head;
        while (fastPtr!=null && fastPtr.next!=null){
            fastPtr = fastPtr.next.next;
            slowptr = slowptr.next;
            if(fastPtr==slowptr) return true;
        }
        return false;
    }

    // return the first / start node of loop in sll
    // Floyd's Cycle Detection algorithm
    public LinkNode getLoopStartingNode(){
        LinkNode fastptr = head;
        LinkNode slowptr = head;
        while (fastptr!=null && fastptr.next!=null){
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            if (fastptr==slowptr) return loopNode(slowptr);
        }
        return fastptr;
    }
    public LinkNode loopNode(LinkNode slowptr){
        LinkNode temp = head;
        while (slowptr!=temp){
            temp = temp.next;
            slowptr = slowptr.next;
        }
        return temp;
    }
}
