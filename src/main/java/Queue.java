import java.util.Collection;

public interface Queue<E> extends Collection {
    E pop (E e);
    int size(E e);
    void push(E e);
}
