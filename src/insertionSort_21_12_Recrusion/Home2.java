package insertionSort_21_12_Recrusion;

public class Home2 {
    /* Реализуйте метод,
    который умножает два числа с использованием рекурсии*/
    public static int number(int num1, int num2) {
        if (num1 == 1){
            return num2;
        }
        return num2 * number(num1 - 1, num2); // Однако, в вашем коде, вы передаете
                                             // аргументы в неправильном порядке при
                                            // рекурсивном вызове.
    }                                      //  return num2 * number(num2, num1 - 1);
}
