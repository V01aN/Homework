package by.myCollections;

public class MySorter {
    public static void sorter(MyArrayList list) {
        for (int i = 0, end = list.size; i < list.size; i++, end--) {
            for (int j = 0; j < end; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {

                }
            }
        }
    }
}
