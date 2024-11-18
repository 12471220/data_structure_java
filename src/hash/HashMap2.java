package hash;


import java.util.LinkedList;

public class HashMap2<K, V> implements Map<K, V>{

    // 多了不好测
    private static final int MAX_SIZE = 4;
    // 不用自己的版本是因为没有实现迭代器无法foreach.
    private final LinkedList<Node<K,V>>[] table = new LinkedList[MAX_SIZE];

    public HashMap2(){

        /*
        不能用这forEach初始化，因为forEach只是副本而不是引用
        for(LinkedList<Node<K,V>> ll:table)
            ll=new LinkedList<>();
         */

//        LinkedList 数组开始只有一个空壳，我们要对内部元素进行初始化
        for(int i=0;i<table.length;i++){
            table[i]=new LinkedList<>();
        }
    }

    @Override
    public void put(K key, V value) {
        int ind = key.hashCode()&(table.length-1);
        table[ind].add(new Node<>(key, value));
    }

    @Override
    public V get(K key) {
        int ind = key.hashCode()&(table.length-1);

        for(Node<K,V> node:table[ind]){
            if(node.key.equals(key)){
                return node.getValue(key);
            }
        }
        return null;
    }

    public void outputChain(){
        for(LinkedList<Node<K,V>> ll:table){
            for(Node<K,V> node:ll){
                System.out.printf(node.value+" ");
            }
            System.out.println();
        }
    }

    static class Node<K,V>{
        K key;
        V value;
        Node(K key,V value){
            this.key=key;
            this.value=value;
        }

        V getValue(K key){
            if(key==this.key){
                return value;
            }
            return null;
        }
    }

}