import java.util.ArrayList;
import java.util.NoSuchElementException;
public class MyLinkedListQueue<T> {
    private ArrayList<T> list;

    public MyLinkedListQueue() {
        list = new ArrayList<>();
    }
    public void enqueue(T data) {
        list.add(data);
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }

}
