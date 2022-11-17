package Collections;

import java.util.HexFormat;

import Collections.SinglyLinkedList.LinkNode;

class SinglyLinkedList{
    public LinkNode head;
    public static class LinkNode{
        public int data;
        public LinkNode next;
        LinkNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void printLL(){
        LinkNode current = head;
        while (current!=null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public int length(LinkNode head){
        LinkNode current = head;
        int count = 0;
        while(current!=null){
            count++;
            current = current.next;
        }
        return count;
    }
    public void insertFirst(int value){
        LinkNode newNode = new LinkNode(value);
        newNode.next = head;
        head = newNode;
    }
    public void insertEnd(int value){
        LinkNode newNode = new LinkNode(value);
        LinkNode curreNode = head;
        while(curreNode.next!=null){
            curreNode =curreNode.next;
        }
        curreNode.next = newNode;
    }
    public void insertPosi(int position , int value){
        LinkNode node = new LinkNode(value);
        if(position == 1){
            node.next = head;
            head = node;
        }else{
            LinkNode previous = head;
            int count = 0;
            while(count<position-1){
                previous = previous.next;
                count++;
            }
            node.next = previous.next;
            previous.next = node;
        }
    }
    public void deleteFirstNode(){
        if(head.next==null) System.out.println("There is single node in the linked list");
        else {
            LinkNode temp = head;
            head = head.next;
            temp.next = null; // deleting the head
        }
    }
    public void deleteLastNode(){
        if(head==null||head.next==null) System.out.println(head);
        else {
            LinkNode current = head;
            LinkNode LastNode = head;
            while (current.next != null) {
                LastNode = current;
                current = current.next;
            }
            LastNode.next = null;
            current = null;
        }
    }
    public void deleteNode(int position){
        if(position==1){
            head = head.next;
        } else if (head==null) {
            System.out.println("null");
        } else {
            LinkNode temp = head;
            int count = 1;
            while (count<position-1){
                temp = temp.next;
                count++;
            }
            LinkNode nextNode = temp.next;
            temp.next = nextNode.next;
        }
    }
    public int SearchNode(int value){
        int count = 1;
        LinkNode temp = head;
        while (temp!=null){
            if(temp.data==value){
                return count;
            }
            count++;
            temp = temp.next;
        }
        return 0;
    }
    public void reverseLinkList(){
        LinkNode previous = null;
        LinkNode next = null;
        LinkNode current = head;
        while (current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }
    public int middleNode(){
        LinkNode slowptr = head;
        LinkNode fastptr = head;
        while (fastptr!=null&&fastptr.next!=null){
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
        return slowptr.data;
    }
    // to get the nth element from the end
    public int elementFromEnd(int n){
        if(n<=0) return 0 ;
        LinkNode refPtr = head;
        LinkNode mainPtr = head;
        int count = 1;
        while (count<n){
            count++;
            refPtr = refPtr.next;
        }
        while (refPtr!=null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return refPtr.data;
    }
    // remove duplicates from the sorted linked list
    public void removeDuplicatesInSortedLL(){
        LinkNode current = head;
        while (current!=null&&current.next!=null){
            if(current.data==current.next.data){
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }
    }
}

public class ImplementLinkedlist {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new LinkNode(10);
        LinkNode second = new LinkNode(2);
        LinkNode third = new LinkNode(31);
        LinkNode fourth = new LinkNode(4);
        // Now connect the nodes together to form a chain
        sll.head.next = second;
        second.next = third;
        third.next = fourth; // 10->2->31->4->null
        sll.printLL();
        System.out.println("length of Linked List is : "+sll.length(sll.head));
        sll.insertFirst(35);
        sll.printLL();
        System.out.println("length of Linked List is : "+sll.length(sll.head));
        sll.insertEnd(99);
        sll.printLL();
        sll.deleteFirstNode();
        sll.printLL();
        sll.deleteLastNode();
        sll.printLL();
        sll.deleteNode(2);
        sll.printLL();
        System.out.println(sll.SearchNode(4));
        sll.printLL();
        sll.reverseLinkList();
        sll.printLL();

    }
}
