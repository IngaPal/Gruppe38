package insertionSort_21_12_Recrusion;

public class Home3 {
    /* Напишите рекурсивный метод
    для вычисления факториала числа.*/
    public static int fac(int facNumb) {
        if (facNumb == 1) {
            return 1;
        }
        return facNumb * fac(facNumb - 1);
    }
}
