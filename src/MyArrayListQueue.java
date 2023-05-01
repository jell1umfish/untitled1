import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyArrayListQueue<T> {
    private ArrayList<T> list;

    public MyArrayListQueue() {
        list = new ArrayList<>();
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
        return list.remove(0);
    }
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.get(0);
    }
    public int size() {
        return list.size();
    }
}
