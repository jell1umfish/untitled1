import java.util.LinkedList;
import java.util.NoSuchElementException;
public class MyLinkedListQueue<T> {
    private LinkedList<T> list;

    public MyLinkedListQueue() {
        list = new LinkedList<>();
    }
    public void enqueue(T data) {
        list.add(data);
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.removeFirst();
    }
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.getFirst();
    }
}
