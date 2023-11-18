package task2;

import java.util.LinkedList;

public class LinkedQueue<T> implements Queue<T> {
    private LinkedList<T> list = new LinkedList<>();

    @Override
    public void enqueue(T item) {
        list.addLast(item);
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.removeFirst();
    }

    @Override
    public T element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.getFirst();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void clear() {
        list.clear();
    }

    public void printQueue() {
        for (T item : list) {
            System.out.print(item + " ");
        }
    }

    public static void main(String[] args) {
        LinkedQueue<String> queue = new LinkedQueue<>();

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        System.out.print("Очередь: ");
        queue.printQueue();
        System.out.println();

        // Вывод текущего состояния
        System.out.println("Размер: " + queue.size()); // Ожидаемый результат: 3
        System.out.println("Очередь пуста?: " + queue.isEmpty()); // Ожидаемый результат: false
        System.out.println("Первый элемент в очереди: " + queue.element()); // Ожидаемый результат: A
        System.out.println();
        // Удаление и вывод элементов
        System.out.println("Тестирование метода dequeue(удаление и возврат)");
        System.out.println("Dequeue: " + queue.dequeue()); // Ожидаемый результат: A
        System.out.println("Dequeue: " + queue.dequeue()); // Ожидаемый результат: B

        // Вывод текущего состояния после удаления
        System.out.println("Размер: " + queue.size()); // Ожидаемый результат: 1
        System.out.println("Очередь пуста?: " + queue.isEmpty()); // Ожидаемый результат: false
        System.out.println("Первый элемент в очереди: " + queue.element()); // Ожидаемый результат: C
        System.out.println();

        System.out.println("Очистка очереди");
        queue.clear();
        // Вывод текущего состояния после очистки
        System.out.println("Размер: " + queue.size()); // Ожидаемый результат: 0
        System.out.println("Очередь пуста?: " + queue.isEmpty()); // Ожидаемый результат: true
        // Т.к. очередь пуста, вызов ArrayQueueModule.element() или ArrayQueueModule.dequeue() вызовет IllegalStateException
    }
}
