public class listNode<E> {
    E data;
    listNode<E> next;

    public listNode(E data) {
        this.data = data;
        this.next = null;
    }
    public E getData(){
        return data;
    }
}
