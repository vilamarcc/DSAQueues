public interface Queue<E> {
    public void push (E e) throws QueueFullException;
    public E pull() throws QueueEmptyException;
    public int size();
}
