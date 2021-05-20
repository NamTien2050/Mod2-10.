package bLinkedListClass;

import jdk.nashorn.internal.ir.WhileNode;

import javax.xml.soap.Node;

public class MyLinkedList {
    private Node hear;
    private int NumNodes;

    public MyLinkedList(Object data) {
        hear = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object data) {
        Node temp = hear;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        NumNodes++;
    }

    public void addFirst(Object data) {
        Node temp = hear;
        hear = new Node(data);
        hear.next = temp;
        NumNodes++;
    }

    public Node getHear(int index) {
        Node temp = hear;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void printlist(){
        Node temp=hear;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
