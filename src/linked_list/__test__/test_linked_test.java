package linked_list.__test__;

import linked_list.LinkedList;

public class test_linked_test {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        boolean res = ll.remove(3);
        System.out.println("remove res:" + res);
        ll.printLinkList();
    }


}
