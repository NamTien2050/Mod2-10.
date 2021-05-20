package bLinkedListClass;

import javax.xml.soap.Node;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList n = new MyLinkedList(10);
        n.addFirst(11);
        n.addFirst(10);
        n.addFirst(13);
        n.add(4, 9);
        n.add(6, 8);
        n.printlist();
    }
}
