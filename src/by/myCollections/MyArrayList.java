package by.myCollections;

public class MyArrayList<T extends Comparable<T>>{
    public int size;
    private int maxSize;
    private Object[] arr;
    T data;

    public MyArrayList() {
        size = 0;
        maxSize = 2;
        arr = new Object[maxSize];
    }
    public MyArrayList(int initialSize) {
        size = 0;
        maxSize = initialSize;
        arr = new Object[maxSize];
    }

    public MyArrayList(MyArrayList list) {
        size = list.size;
        maxSize = list.maxSize + list.size / 2;
        arr = new Object[size];
        for (int i = 0; list.arr[i + 1] != null; i++) {
            this.arr[i] = list.arr[i];
        }
    }

    public void add(T element) {
        arr[size] = element;
        size++;
        if (maxSize == size) {
            int newSize = maxSize + maxSize / 2 + 1;
            Object[] newArr = new Object[newSize];
            for (int i = 0; i != maxSize; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
            maxSize = newSize;
        }
    }

    private void set(T element, int pos) {
        if (pos < size) {
            arr[pos] = element;
        }
    }

    public void remove(int id) {
        for (int i = id; i < size; i++) arr[i] = arr[i+1];
        size--;
    }

    public T get(int id) {
        return (T) arr[id];
    }

    public void addAll(MyArrayList<T> list) {
        for(int i = 0; i < list.size; i++) {
            add(list.get(i));
        }
    }

    public static void sort(MyArrayList list) {
        Comparable temp;
        for (int i = 0, end = list.size; i < list.size; i++, end--) {
            for (int j = 0; j < end - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    temp = list.get(j);
                    list.set(list.get(j + 1), j);
                    list.set(temp, j + 1);
                }
            }
        }
    }
}
