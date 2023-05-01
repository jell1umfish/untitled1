import java.util.ArrayList;

public class MyArrayListStack<T> {
    private ArrayList<T> list;

    public MyArrayListStack() {
        list = new ArrayList<>();
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public void push(T data) {
        list.add(data);
    }
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.remove(list.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.get(list.size() - 1);
    }
}