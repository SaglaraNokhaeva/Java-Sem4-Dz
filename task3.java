// В калькулятор добавьте возможность отменить последнюю операцию.
// Пример

// 1
// +
// 2
// ответ:
// 3

// +
// 4
// ответ:
// 7

// Отмена
// 3
// *
// 3

// ответ:
// 9

import java.util.Scanner;
import java.util.Stack;

public class task3 {

    public static void main(String[] args) {
        Stack<Float> stack = new Stack<>();
        stack.push(Calcul());
        // System.out.println(stack);
        Scanner scan = new Scanner(System.in);
        String str = "";
        while (!str.equals("exit")) {
            System.out.println("Введите команды:'exit' для выхода из программы;'cancel' для отмены последней операции; 'calc' для продолжения работы в калькуляторе: ");
            str = scan.nextLine();
            if (str.equals("calc")) {
                stack.push(Calcul());
            }
            if (str.equals("cancel")) {
                System.out.println(stack.pop());
            }
        }
        scan.close();
    }

    private static Float Calcul() {

        Scanner iScanner = new Scanner(System.in);

        System.out.printf("Введите первое число = ");
        float number1 = iScanner.nextInt();

        System.out.printf("Введите второе число = ");
        float number2 = iScanner.nextInt();

        System.out.printf("Введите действие (+, -, * или /): ");
        Character act = iScanner.next().charAt(0);
        Float rezult = (float) 0;

        if (act == '+') {
            rezult = number1 + number2;
            System.out.printf("%f + %f = %f", number1, number2, rezult);
        }

        if (act == '-') {
            rezult = number1 - number2;
            System.out.printf("%f - %f = %f", number1, number2, rezult);
        }
        if (act == '*') {
            rezult = number1 * number2;
            System.out.printf("%f * %f = %f", number1, number2, rezult);
        }
        if (act == '/') {
            rezult = number1 / number2;
            System.out.printf("%f : %f = %f", number1, number2, rezult);
        }
        iScanner.close();
        System.out.println();
        return rezult;
    }

}
