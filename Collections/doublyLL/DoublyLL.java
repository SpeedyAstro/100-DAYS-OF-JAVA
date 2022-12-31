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
        if(isEmpty()) return;
        ListNode temp = head;
        while (temp!=null){
            System.out.println(temp.data +" --> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public void  displayBackward(){
        if (isEmpty()) return;
        ListNode temp = tail;
        while (temp!=null){
            System.out.println(temp.data +" --> ");
            temp = temp.previous;
        }
    }
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()) tail = newNode;
        else head.previous = newNode;
        newNode.next = head;
        head = newNode;
        length++;
    }

    public static void main(String[] args) {
        DoublyLL doublyLL = new DoublyLL();
        doublyLL.insertFirst(1);
        doublyLL.displayForward();
    }
}
