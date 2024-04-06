package by.myCollections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi!");
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(7);
        list.add(2);
        list.add(3);
        list.add(7);
        MyLinkedList<Integer> anotherList = new MyLinkedList<>(list);
        list.addAll(anotherList);
        for (int i = 0; i < list.size; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();;
        anotherList.add(5);
        list.add(1);
        list.addAll(anotherList);
        System.out.println();
        for (int i = 0; i < list.size; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
