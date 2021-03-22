package com.example.two;

public class Node<D> {

    Node<D> next;
    D data;

    public Node(D newData){
        this.data = newData;
        this.next = null;
    }

    public Node(D newData, Node newNext){
        this.data = newData;
        this.next = newNext;
    }

    public D getData(){
        return data;
    }

    public Node<D> getNext(){
        return next;
    }

    public void setData(D newData){
        data = newData;
    }

    public void setNext(Node<D> newNode){
        next = newNode;
    }


}




























