package task1;

import java.util.Arrays;

// ArrayQueueModule
public class ArrayQueueModule extends AbstractQueue{

    private static final ArrayQueueModule instance = new ArrayQueueModule();

    private ArrayQueueModule() {
        super();
    }

    public static ArrayQueueModule getInstance() {
        return instance;
    }

    public void printQueue() {
        for (int i = 0; i < size; ++i) {
            System.out.print(queue[i] + " ");
        }
    }

    public static void main(String[] args) {
        // Добавление элементов
        ArrayQueueModule queue = ArrayQueueModule.getInstance();

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

