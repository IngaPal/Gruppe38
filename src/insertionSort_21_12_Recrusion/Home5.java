package insertionSort_21_12_Recrusion;

public class Home5 {
    /* Напишите рекурсивный метод
    для печати чисел от n до 1.
    n надо получить через аргументы.*/
    public static void printl(int n) {
        if (n == 1){
            return;
        }
        System.out.println(n);
        printl(n - 1);
    }
}
