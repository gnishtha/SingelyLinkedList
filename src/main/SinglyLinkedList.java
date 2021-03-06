package main;

public class SinglyLinkedList {

    private Node head = null;
    private int size=0;

    //method to insert a new node at the head
    public void insert(int value){
       head = new Node(value,head);
       size++;
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        //String is immutable whereas StringBUilder is mutable
        Node temp = head;
        System.out.print ("[");
        while(temp != null){//next dose not point to null
            result.append ( temp.data );
            if(temp.next != null){
                result.append ( " => " );
            }
            temp=temp.next;
        }
        return result.append ( "]" ).toString();
    }

    private static class Node{
        private int data;
        private Node next;

        public Node ( int data , Node next ) {
            this.data = data;
            this.next = next;
        }

        public Node ( int data ) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main ( String[] args ) {
        SinglyLinkedList linkedList = new SinglyLinkedList ();
        for (int i = 0; i < 5; i++) {
            linkedList.insert ( i+1 );
        }
        System.out.println (linkedList);
    }
}
