package by.myCollections;

public class MyLinkedList<T extends Comparable<T>> {
    Node<T> first;
    Node<T> last;
    int size;

    public MyLinkedList() {
        first = new Node<>(null, null, null);
        last = first;
        size = 0;
    }

    public void add(T elem) {
        if (first == null && last == null) {
            first = new Node<>(null, elem, null);
            last = first;
        }
        else if (first == last) {
            last = new Node<>(first, elem, null);
            first.next = last;
        }
        else last = new Node<>(last.prev, elem, null);
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
