package Collections.circularLinkedList;

public class CircularLL {
    private ListNode last;
    private int length;

    private class ListNode{
        private ListNode next;
        private int data;
        public ListNode(int data){
            this.data = data;
        }
    }
    public CircularLL(){
        last = null;
        length = 0;
    }
    public int getLength(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void createCircularLL(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(1);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;
        last = fourth;
    }

    public static void main(String[] args) {
        CircularLL circularLL = new CircularLL();
        circularLL.createCircularLL();
    }
}
