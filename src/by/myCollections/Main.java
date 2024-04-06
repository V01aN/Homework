package by.myCollections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi!");
        MyArrayList<Integer> list = new MyArrayList<Integer>();
        MyArrayList<Integer> anotherList = new MyArrayList<>();
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(9);
        anotherList.add(2);
        anotherList.add(2);
        list.addAll(anotherList);
        System.out.println();
        MyArrayList.sort(list);
        for(int i = 0; i < list.size; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
