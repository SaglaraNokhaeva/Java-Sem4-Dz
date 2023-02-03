// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите цифру 1, если необходимо поместить элемент в конец очереди, введите цифру 2, если необходимо вернуть первый элемент из очереди и удалить его, введите цифру 3, если необходимо вернуть первый элемент из очереди, не удаляя");
        String choice=scan.nextLine();
        
    }
}
