package task1;

import java.util.Arrays;

public abstract class AbstractQueue {
    protected Object[] queue;
    protected int head;
    protected int tail;
    protected int size;

    public AbstractQueue() {
        queue = new Object[10];
        head = 0;
        tail = 0;
        size = 0;
    }

    public void enqueue(Object item) {
        ensureCapacity();
        queue[tail] = item;
        tail = (tail + 1) % queue.length;
        size++;
    }

    public Object element() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[head];
    }

    public Object dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        Object item = queue[head];
        queue[head] = null; // Avoid memory leak
        head = (head + 1) % queue.length;
        size--;
        return item;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        Arrays.fill(queue, null);
        head = 0;
        tail = 0;
        size = 0;
    }

    protected void ensureCapacity() {
        if (size == queue.length) {
            int newSize = queue.length * 2;
            queue = Arrays.copyOf(queue, newSize);
        }
    }

    public void printQueue() {
        for (int i = 0; i < size; ++i) {
            System.out.print(queue[i] + " ");
        }
    }
}

