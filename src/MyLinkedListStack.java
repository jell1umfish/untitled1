import java.util.LinkedList;

public class MyLinkedListStack<T> {
    private LinkedList<T> list;

    public MyLinkedListStack() {
        list = new LinkedList<>();
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
    public boolean isEmpty() {
        return list.isEmpty();
    }
}