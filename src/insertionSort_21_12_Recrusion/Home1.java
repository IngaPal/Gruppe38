package insertionSort_21_12_Recrusion;

public class Home1 {
   /* Напишите рекурсивный метод
   для вычисления суммы чисел от 1 до n.
   n надо получить через аргументы.*/
    public static int num(int n) {
        if (n == 1) {
            return 1; //  начать суммирование с 1
        }
        return n + num(n -1);
        }
    }