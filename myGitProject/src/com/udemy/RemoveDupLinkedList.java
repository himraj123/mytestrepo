package com.udemy;

import java.util.HashSet;

public class RemoveDupLinkedList {

    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    Node head;

    public void addFront(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void removeDup(){
        Node current = head;
        Node previous = null;

        HashSet<Integer> set = new HashSet<Integer>();

        while(current!=null){
            if(set.contains(current.data)){
                previous.next = current.next;
            }
            else{
                set.add(current.data);
                previous = current;
            }
            current = current.next;
        }
    }

    void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println("");

    }
    public static void main(String[] args) {
        RemoveDupLinkedList list = new RemoveDupLinkedList();
        list.addFront(1);
        list.addFront(2);;
        list.addFront(1);

        list.printList();

        list.removeDup();

        list.printList();

    }
}

class LinkedList{

}

