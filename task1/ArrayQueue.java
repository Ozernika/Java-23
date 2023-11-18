package task1;
import java.util.Arrays;

public class ArrayQueue extends AbstractQueue {

    public ArrayQueue() {
        super();
    }

    public void printQueue() {
        for (int i = 0; i < size; ++i) {
            System.out.print(queue[i] + " ");
        }
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.enqueue("D");
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
    }
}
