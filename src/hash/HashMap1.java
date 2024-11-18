package hash;

public class HashMap1<K,V> implements Map<K,V>{
    // 没有拉链的版本
    public Object[] table=new Object[8];

    @Override
    public void put(K key, V value) {
        int ind = key.hashCode() & (table.length-1);

        table[ind]=value;
    }

    @Override
    public V get(K key) {
        int ind=key.hashCode()&(table.length-1);

        return (V) table[ind];
    }
}
