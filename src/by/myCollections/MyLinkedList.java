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
        if (first.item == null) {
            first.item = elem;
        }
        else if (first == last) {
            last = new Node<>(first, elem, null);
            first.next = last;
            last.prev = last;
        }
        else {
            last = new Node<>(last, elem, null);
            last.prev.next = last;
        }
        size++;
    }

    public T get(int id) {
        if (first == null || id >= size) {
            return null;
        }
        Node<T> current = first;
        for (int i = 0; i < id; i++) {
            current = current.next;
        }
        return current.item;
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
