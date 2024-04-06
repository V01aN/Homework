package by.myCollections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi!");
        MyLinkedList<Integer> list = new MyLinkedList<>();
        MyLinkedList<Integer> anotherList = new MyLinkedList<>();
        list.add(1);
        anotherList.add(4);
        anotherList.add(5);
        anotherList.add(6);
        list.addAll(anotherList);
        for (int i = 0; i < list.size; i++) {
            System.out.print(list.get(i) + " ");
        }
        anotherList.add(5);
        list.add(1);
        list.addAll(anotherList);
        System.out.println();
        for (int i = 0; i < list.size; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
