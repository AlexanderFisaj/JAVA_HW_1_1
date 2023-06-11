// Задача 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class task1 {
    public static void main(String[] args) {
        int n = 5;
        int triangularNumber = 0;
        int factorial = 1;
  
        // Вычисление n-ого треугольного числа
        for (int i = 1; i <= n; i++) {
           triangularNumber += i;
        }
  
        // Вычисление факториала n
        for (int i = 1; i <= n; i++) {
           factorial *= i;
        }
  
        System.out.println("n-ое треугольное число: " + triangularNumber);
        System.out.println("n! : " + factorial);
    }
}
