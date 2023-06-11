// Задача 2. Вывести все простые числа от 1 до 1000

public class task2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
               if (i % j == 0) {
                  isPrime = false;
                  break;
               }
            }
            if (isPrime) {
               System.out.println(i);
            }
         }
    }
}
