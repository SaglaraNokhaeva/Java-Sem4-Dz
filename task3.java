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

        Scanner iScanner = new Scanner(System.in);
        Stack <Float> stack = new Stack<>();

        System.out.printf("Введите первое число = ");
        float number1 = iScanner.nextInt();

        System.out.printf("Введите второе число = ");
        float number2 = iScanner.nextInt();

        System.out.printf("Введите действие (+, -, * или /): ");
        Character act = iScanner.next().charAt(0);
        Float rezult=(float) 0;

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
        
        
        stack.push(rezult);





        iScanner.close();

    }
}
