package by.myCollections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi!");
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(2);
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(7);
        for (int i = 0; i < list.size; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
