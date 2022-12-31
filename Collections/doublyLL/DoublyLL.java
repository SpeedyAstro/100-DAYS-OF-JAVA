package Collections.doublyLL;
// it is called two-way linked list.
// Given a node, we can navigate list in both forward and backward direction, which is not possible in singly linked list.
// a node in singly linked list can only be deleted if we have a pointer to its previous node, but in doubly linked list we can delete the node even if we don't have pointer to its previous node.
//  <--[previous | data | next ]-->

public class DoublyLL {

    private ListNode head;
    private ListNode tail;
    private int length;
    private class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data){
            this.data = data;
        }
    }
    public DoublyLL(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public int getLength(){
        return length;
    }
    public void displayForward(){
        if(head==null) return;
        ListNode temp = head;
        while (temp!=null){
            System.out.println(temp.data +" --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void  displayBackward(){
        if (tail==null) return;
        ListNode temp = tail;
        while (temp!=null){
            System.out.println(temp.data +" --> ");
            temp = temp.previous;
        }
    }

}
