package LinkedList;

public class ReverseLinkedList {
    Node head;
    static class Node {
        int number;
        Node next;

        Node(int num) {
            this.number = num;
            this.next = null;
        }
    }  // end Node
    private static Node reverse(Node head, int left, int right) {
        Node currentNode = head;
        int currentPos = 1;
        Node start = head;

        while(currentPos < left){
            start = currentNode;
            currentNode = currentNode.next;
            currentPos++;
        }

        Node newList = null;
        Node tail = currentNode;

        while(currentPos <= right) {
            Node next = currentNode.next;
            currentNode.next = newList;
            newList = currentNode;
            currentNode = next;

            currentPos++;
        }

        start.next = newList;

        tail.next = currentNode;

        if(left > 1)
            return head;
        else return newList;
    }

    public static void insert(ReverseLinkedList list, int num) {

        Node new_node = new Node(num);

        if(list.head == null) {
            list.head = new_node;
        }
        else{
            // Start from the head
            Node node = list.head;
            while(node.next != null) {
                node = node.next;
            }
            node.next = new_node;
        }
    }

    public static void main(String[] args) {

        ReverseLinkedList list = new ReverseLinkedList();
        for(int i = 1; i <= 3; i++) {
            insert(list, i);
        }

        print(list.head);

        Node resultList = reverse(list.head, 3,3 );

        print(resultList);
    }

    private static void print(Node head) {

        while(head != null) {
            System.out.print(head.number + " ");
            head = head.next;
        }
        System.out.println();
    }
}