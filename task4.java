/* Задача 4. (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
Требуется восстановить выражение до верного равенства.
Знаки вопроса - одинаковые цифры.
Предложить хотя бы одно решение или сообщить, что его нет. */

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите уравнение вида: '2? + ?5 = 69': "); 
        String equation = sc.nextLine();
        String msg = "Решения нет!";
        for (int i = 0; i < 10; i++) {
            String substitutionInEquation = equation.replace("?", Integer.toString(i));
            String[] elementsEquation = substitutionInEquation.split(" ");
            if (Integer.parseInt(elementsEquation[0]) + Integer.parseInt(elementsEquation[2]) == Integer.parseInt(elementsEquation[4]))
            msg = substitutionInEquation;
        }
        System.out.println(msg);
        sc.close();
    }
}
