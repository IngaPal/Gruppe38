package insertionSort_21_12_Recrusion;

public class Home4 {
    /* Напишите рекурсивный метод
    для печати чисел от 1 до n.
    n надо получить через аргументы. */
    public static void print(int n) { // void не возвращает никакого значения
        if (n == 1) {
            System.out.println(n);
            return;
        }
        print(n - 1);
            System.out.println(n);
    }
    }