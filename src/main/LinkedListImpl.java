package main;

import java.util.*;

public class LinkedListImpl {
    Node head;
    static class Node {
        int number;
        Node next;

        Node(int num){
            this.number = num;
            this.next = null;
        }

    }   // end Node

    public static void insert(LinkedListImpl list, int num) {

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
    }   //end insert

    public static void main(String[] args) {

        Random random = new Random();

        LinkedListImpl list1 = new LinkedListImpl();

         for(int i = 0; i < 5; i++) {
             insert(list1, random.nextInt(10));
         }

         LinkedListImpl list2 = new LinkedListImpl();
        for(int i = 0; i < 5; i++) {
            insert(list2, random.nextInt(10));
        }

         printIntersection(list1, list2);

    }   //end main

    static void printIntersection(LinkedListImpl list1, LinkedListImpl list2) {

        Node head1 = list1.head;
        Node head2 = list2.head;

        List<Integer> tempList = new ArrayList<>();

        while(head1 != null) {
            tempList.add(head1.number);

            head1 = head1.next;
        }

        while(head2 != null) {
            // if we found intersection, print
            if(tempList.contains(head2.number)){
                System.out.print(head2.number + " ");
            }
            head2 = head2.next;
        }

    }   // end print

}   // end java class