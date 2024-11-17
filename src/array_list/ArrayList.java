package array_list;

import java.util.Arrays;

public class ArrayList<E> implements List<E>{

    // 默认大小
    private final int DEFAULT_CAPACITY=10;
    // 默认空数据
    private static final Object[] DEFAULT_CAPACITY_EMPTY_ELEMENT_DATA = {};
    // 默认缓冲区
    transient Object[] elementData;
    // array中的元素个数
    private int size;

    public ArrayList(){
        // 初始化为空
        elementData=DEFAULT_CAPACITY_EMPTY_ELEMENT_DATA;
    }
    @Override
    public boolean add(E e) {
        int min_container_size=size+1;
        int cur_container_size=elementData.length;
        min_container_size=Math.max(min_container_size,DEFAULT_CAPACITY);

        //空间不够
        if(cur_container_size-min_container_size<0){
            int new_len=cur_container_size+cur_container_size>>1;

            // 仍然不够
            if(new_len-min_container_size<0){
                new_len=min_container_size;
            }

            elementData= Arrays.copyOf(elementData,new_len);
        }

        elementData[size++]=e;
        return true;
    }

    @Override
    public E remove(int index) {
        if(index>=0 && index<size){
            System.arraycopy(elementData,index+1,elementData,index,size-index-1);
            elementData[--size]=null;
        }
        return null;
    }

    @Override
    public E get(int index) {
        if(index>=0 && index<size){
            return (E)elementData[index];
        }
        return null;
    }

    public void printList(){
        System.out.println("total size:: "+size);
        for(int i=0;i<size;i++){
            System.out.print(get(i)+" ");
        }

//        for (int i=0;i<elementData.length;i++) {
//            System.out.println(i+" "+elementData[i]);
//        }
    }
}
