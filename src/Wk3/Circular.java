package Wk3;
public class Circular {
    public static final int LIMIT = 5;
    //Node component of the Data Structure
    public class Node {
        int index;
        int data;
        Node next;
        public Node(int data, int index) {
            this.data = data;
            this.index = index;
        }
    }
//
    public Node head = null;
    public Node tmp = null;
    public int newest = 0;
    public int oldest = 0;
    public int size = 0;
    //Add new node at the end of the list
    public void addNode(int data) {
        //If reach the limit
        if(size == LIMIT) {
            if (oldest == LIMIT - 1) {
                newest = oldest;
                oldest = 0;
            } else {
                newest = oldest;
                oldest ++;
            }
            changeData(data,newest);
            return;
        }


        Node  newNode = new Node(data, newest);
        size ++;
        newest ++;
        //if linked list emplty
        if(head == null) {
            head = newNode;
        }else {
            tmp.next = newNode;
        }
        tmp = newNode;
        tmp.next = head;
        //Reach limit
    }
    //Print newwest and oldest
   public void printNewestOldest() {
       System.out.printf("Newest %d \nOldest %d\n ", this.printData(newest), this.printData(oldest));
   }
    //Print index
    public int printData(int index) {
	    Node current = head;
        while (current != null) {
            //If the items are equal return the index
            if (current.index == index ) {
                return current.data;
            }
            //Set current to the next and increment the index
            current = current.next;
        }
        return 0;
    }
    //Index of
    public int indexOf(int data) {
        int index = 0;
        Node current = head;
        //While we haven't reached the end of the list
        while (current != null) {
            //If the items are equal return the index
            if (current.data == data) {
                return current.index;
            }
            //Set current to the next and increment the index
            current = current.next;
        }
        return -1;
    }

    public void changeData(int data, int index) {
        Node current = head;
        //While we haven't reached the end of the list
        while (current != null) {
            //If the items are equal return the index
            if (current.index == index ) {
                current.data = data;
                break;
            }
            //Set current to the next and increment the index
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Circular list = new Circular();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        System.out.println("Size : " +list.size);

        for(int i = 0; i < LIMIT  ; i ++) {
            System.out.println(list.printData(i));
        }

        System.out.printf("\nNewest %d, Oldest %d",list.printData(list.newest),list.printData(list.oldest));
    }
    //Find the element

}
