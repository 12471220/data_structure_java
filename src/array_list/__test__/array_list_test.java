package array_list.__test__;

import array_list.ArrayList;

public class array_list_test {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        arr.remove(3);
        arr.printList();
    }

}
