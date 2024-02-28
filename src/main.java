import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
       int number1 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
       int number2 = new Scanner(System.in).nextInt();
        System.out.println("Сумма двух чисел: " + (number1 + number2));
        System.out.println("Разность двух чисел: " + (number1 - number2));
        System.out.println("Произведение двух чисел: " + (number1 * number2));
        System.out.println("Частное двух чисел: " + ((double)number1 / number2));
    }
}
