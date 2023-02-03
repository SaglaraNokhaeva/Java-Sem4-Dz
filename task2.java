// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(
                "Введите цифру 1, если необходимо поместить элемент в конец очереди, введите цифру 2, если необходимо вернуть первый элемент из очереди и удалить его, введите цифру 3, если необходимо вернуть первый элемент из очереди, не удаляя");
        int choice = scan.nextInt();
        LinkedList<Integer> list_initial = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list_initial.add(i);
        }
        System.out.println(list_initial);

        if (choice == 1) {
            System.out.println("Введите новый элемент(целое число): ");
            Integer new_item = scan.nextInt();
            System.out.println(Enqueue(list_initial, new_item));
        }
        if (choice == 2) {
            System.out.println(list_initial.getFirst());
            System.out.println(Dequeue(list_initial));
        }
        if (choice == 3) {
            System.out.println(list_initial.getFirst());
            System.out.println(First(list_initial));            
        }
        // scan.close();

    }

    private static LinkedList<Integer> Enqueue(LinkedList<Integer> list1, Integer new_element) {
        LinkedList<Integer> transp_list = new LinkedList<>();
        transp_list.addAll(list1);
        transp_list.add(new_element);
        return transp_list;
    }

    private static LinkedList<Integer> Dequeue(LinkedList<Integer> list1) {
        LinkedList<Integer> transp_list = new LinkedList<>();
        transp_list.addAll(list1);
        transp_list.removeFirst();
        return transp_list;
    }

    private static LinkedList<Integer> First(LinkedList<Integer> list1) {
        LinkedList<Integer> transp_list = new LinkedList<>();
        transp_list.addAll(list1);
        return transp_list;
    }

}
