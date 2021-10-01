package Wk3;
/*
Describe an algorithm to remove a loop from a linked list
 */
public class RemoveCircular {
    public static boolean detectAndRemove (LinkedList.Node node) {
       LinkedList.Node slow = node, fast = node;
       //Floyed algo
        while(slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            //Fast and slow ,eet ad the samepoint
            if(slow == fast) {
                removeLoop(slow,node);
                return true;
            }
        }
        return false;
    }

    public static void removeLoop(LinkedList.Node loopNode, LinkedList.Node head) {
        LinkedList.Node p1 = loopNode;
        LinkedList.Node p2 = loopNode;
        int k = 1, i;

        while (p1.next != p2) {
            p1 = p1.next;
            k++;
        }
        //1 pointer fix in the head
        p1 = head;
        p2 = head;
        for(i = 0; i < k; i ++) {
            p2 = p2.next;
        }

        while(p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        //Get the pointer to the last node
        while(p2.next != p1) {
            p2 = p2.next;
        }
        //Set the ending node to null
        p2.next = null;
    }

    // Function to print the linked list
    static void printList(LinkedList.Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        //Generate data to test
        for(int i = 0; i < 5; i ++) {
            l1.addNode(i);
        }
       //Uncomment to test
//        printList(l1.head);
        detectAndRemove(l1.head);
        printList(l1.head);
    }
}
