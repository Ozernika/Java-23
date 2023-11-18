package task1;

public interface ArrayQueueADTI {
    void enqueue(Object item);
    Object element();
    Object dequeue();
    int size();
    boolean isEmpty();
    void clear();
    void printQueue();
}
