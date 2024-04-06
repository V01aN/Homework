package by.myCollections;

import java.util.LinkedList;

public class MyLinkedList<T extends Comparable<T>> {
    Node<T> node;

    public MyLinkedList() {
        node = new Node<>(null, null, null);
    }

    private static class Node<T> {
        T item;
        MyLinkedList.Node<T> next;
        MyLinkedList.Node<T> prev;

        Node(MyLinkedList.Node<T> prev, T element, MyLinkedList.Node<T> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
