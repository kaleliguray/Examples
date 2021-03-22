package com.example.two;

import java.util.LinkedList;

public class LinkedListUs<D> {

    Node<D> head;
    int count;

    public LinkedListUs(Node<D> newHead){
        this.head = newHead;
        this.count = 1;
    }



    public void add(D newData){
        Node<D> temp = new Node(newData);
        Node<D> current = head;
        while (current.getNext() !=  null){
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    public D get(int index){
        Node<D> current = head;
        for (int i=1; i<index; i++){
            current = current.getNext();
        }
        return current.getData();
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void remove(){
        Node<D> current = head;
        while (current.getNext().getNext() != null){
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }

    public static void main(String[] args) {

        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Alice");
        System.out.println(linkedlist);
        linkedlist.add("Alicey");
        System.out.println(linkedlist);


    }







}


































