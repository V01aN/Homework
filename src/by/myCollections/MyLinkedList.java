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

    public MyLinkedList(MyLinkedList<T> anotherList) {
        first = new Node<>(null, null, null);
        last = first;
        size = 0;
        for (int i = 0; i < anotherList.size; i++) {
            add(anotherList.get(i));
        }
    }

    public void add(T elem) {
        if (first.item == null) {
            first.item = elem;
            last = first;
        }
        else if (first == last) {
            last = new Node<>(first, elem, null);
            first.next = last;
        }
        else {
            last = new Node<>(last, elem, null);
            last.prev.next = last;
        }
        size++;
    }

    public T get(int id) {
        if (first == null || id >= size || id < 0) {
            return null;
        }
        Node<T> current = first;
        for (int i = 0; i < id; i++) {
            current = current.next;
        }
        return current.item;
    }

    private void set(T element, int pos) {
        Node<T> current = first;
        for (int i = 0; i < pos; i++) {
            current = current.next;
        }
        current.item = element;
    }

    public void remove(int id) {
        if (first == null || id >= size || id < 0) {
            return;
        }
        Node<T> current = first;
        for (int i = 0; i < id; i++) {
            current = current.next;
        }
        if (current == first) {
            first = current.next;
            first.prev = null;
        }
        else if (current == last) {
            last.prev.next = null;
            last = last.prev;
        }
        else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        current = null;
        size--;
    }

    public void addAll(MyLinkedList<T> anotherList) {
        Node<T> current = anotherList.first;
        for (int i = 0; i < anotherList.size; i++) {
            add(anotherList.get(i));
        }
    }

    public static void sort(MyLinkedList list) {
        Comparable temp;
        for (int i = 0, end = list.size; i < list.size; i++, end--) {
            boolean sorted = true;
            for (int j = 0; j < end - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    sorted = false;
                    temp = list.get(j);
                    list.set(list.get(j + 1), j);
                    list.set(temp, j + 1);
                }
            }
            if (sorted) break;
        }
    }

    private static class Node<T extends Comparable<T>> {
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
