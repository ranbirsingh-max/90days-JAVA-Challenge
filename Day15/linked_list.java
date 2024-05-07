package Linked_list;

public class Linked_list_ {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    public Linked_list_(int value){
        Node newnode= new Node(value);
        head = newnode;
        tail= newnode;
        length=1;
    }
    public void getHead(){
        System.out.println("Head: " + head.value);
    }
    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

   public void append(int value){
        Node newnode=new Node(value);
        if(length==0){
            head=newnode;
            tail=newnode;
        }else {
            tail.next=newnode;
            tail=newnode;

        }
        length++;
   }

}


