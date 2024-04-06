package by.myCollections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi!");
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(2);
        list.add(9);

        MyArrayList.sort(list);
    }
}
