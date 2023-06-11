/* Задача 3. Реализовать простой калькулятор
+ - / *

Введите первое число: A \n
Введите знак: *
Введите второе число: B
Результат: A*B

sc.next() -- считывает символ
sc.nextLine() -- считывает всю строчку
sc.nextInt() -- считывает число, но без перехода на след. строчку
 */
import java.util.Scanner;

public class task3 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Введите первое число: ");
      double num1 = sc.nextDouble();
      System.out.print("Введите знак (+, -, *, /): ");
      char operator = sc.next().charAt(0);
      System.out.print("Введите второе число: ");
      double num2 = sc.nextDouble();
      sc.close();
      
      double result;
      switch (operator) {
         case '+':
            result = num1 + num2;
            break;
         case '-':
            result = num1 - num2;
            break;
         case '*':
            result = num1 * num2;
            break;
         case '/':
            result = num1 / num2;
            break;
         default:
            System.out.println("Некорректный знак операции");
         return;
      }
      System.out.println("Результат: " + result);
   }
}
