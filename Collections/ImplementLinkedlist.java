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
    public void printLL(LinkNode head){
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
        sll.printLL(sll.head);
        System.out.println("length of Linked List is : "+sll.length(sll.head));
        sll.insertFirst(35);
        sll.printLL(sll.head);
        System.out.println("length of Linked List is : "+sll.length(sll.head));
        sll.insertEnd(99);
        sll.printLL(sll.head);
    }
}
