package linked_list;

public class LinkedList<E> implements List<E> {
    Node<E> first;
    Node<E> last;
    int size;


    public LinkedList(){
        first = null;
        last = null;
        size = 0;
    }
    @Override
    public boolean add(E e) {
        return addLast(e);
    }

    // 头插法
    @Override
    public boolean addFirst(E e) {
        Node<E> f = first;
        Node<E> newnode = new Node<>(e,null,f);

        first=newnode;

        if(f==null){
            last=newnode;
        }
        else{
            f.prev=newnode;
        }
        size++;
        return true;
    }

    @Override
    public boolean addLast(E e) {
        Node<E> l=last;
        Node<E> newnode = new Node<>(e,last,null);
        last=newnode;
        if(l==null){
            first=newnode;
        }
        else{
            l.next=newnode;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        // 顺序检索
        for(Node<E> p=first;p!=null;p=p.next){
            if(o.equals(p.element)){
                unlink(p);
                return true;
            }
        }
        return false;
    }

    /*
    E unlink(Node<E> n){
        final E element=n.element;
        final Node<E> prev=n.prev;
        final Node<E> next=n.next;

        if(prev!=null){
            prev.next=next;
        }
        else{
            // prev==null
            // 如果next为空，first.prev就会有异常。
            first=next;
            if(first!=null){
                first.prev=null;
            }
        }

        if(next!=null){
            next.prev=prev;
        }
        else {
            last=prev;
            // 同理
            if(last!=null){
                last.next=null;
            }
        }

        // recycle.
        n.element=null;
        size--;
        return element;
    }
    */

    E unlink(Node<E>x){
        E element=x.element;
        Node<E> next=x.next;
        Node<E> prev=x.prev;

        if(prev==null){
            first=next;
            if(first!=null){
                first.prev=null;
            }
        }
        else{
            prev.next=next;
            x.prev=null;
        }

        if(next==null){
            last=prev;
            if(last!=null){
                last.next=null;
            }
        }
        else{
            next.prev=prev;
            x.next=null;
        }

        size--;
        x.element=null;
        return element;
    }

    @Override
    public E get(int index) {
        // border judge.
        if(index<0||index>size){
            return null;
        }

        Node<E> pointer=this.first;
        for(int i=0;i<index;i++){
            pointer=pointer.next;
        }
        return pointer.element;
    }

    @Override
    public void printLinkList() {
        Node<E> pointer = first;
        while (null!=pointer){
            System.out.print(pointer.element);
            pointer=pointer.next;
            if(pointer!=null)
                System.out.print("  ->  ");
        }

    }

    // Node节点
    private static class Node<E>{
        E element;
        Node<E> next;
        Node<E> prev;

        Node(E element, Node<E>prev, Node<E>next){
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

    }
}
