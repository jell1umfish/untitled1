import java.util.ArrayList;

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
}
