package by.myCollections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi!");
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(2);
        list.add(9);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        for (int i = 0; i < list.size; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        list.remove(1);
        list.remove(1);
        //list.remove(2);
        //list.remove(2);
        for (int i = 0; i < list.size; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
