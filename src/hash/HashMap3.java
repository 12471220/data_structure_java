package hash;

// 开放寻址，不引入链表数据结构
public class HashMap3<K,V> implements Map<K,V>{

    private static final int MAX_SIZE = 8;
    private final Node<K,V>[] table =new Node[MAX_SIZE];

    public HashMap3(){
        // 不需要init.
    }
    @Override
    public void put(K key, V value) {
        int ind = key.hashCode()&(table.length-1);

        for(;ind<table.length;ind++){
            if(table[ind]==null){
                table[ind]=new Node<>(key,value);
                break;
            }
        }
        if(ind==table.length){
            System.out.println("full, can't insert..");
        }
    }

    @Override
    public V get(K key) {
        int ind = key.hashCode()&(table.length-1);

        for(;ind< table.length;ind++){
            if(table[ind]!=null)
                return table[ind].value;
        }
        return null;
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
