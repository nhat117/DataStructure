package Wk3;

public class LinkedList {
    public Node head;
    public Node tmp = null;
    int size = 0;

    public static class Node {
        int data;
        Node next;
        Node (int d) {
            data = d;
            next = null;
        }
    }
//Add a circular linled list node
    public void addNode(int data) {
        //If reach the limit
        Node newNode = new Node(data);
        //if linked list emplty
        if(head == null) {
            head = newNode;
        }else {
            tmp.next = newNode;
        }
        tmp = newNode;
        tmp.next = head;
        size ++;
        //Reach limit
    }
}
