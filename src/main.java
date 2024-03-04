import java.math.BigDecimal;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Результат 1 метода: " + fraction(5.3));
        System.out.println("Результат 1 метода: " + sumLastNums(4568923));
    }
    public static double fraction(double x) {
        double res = Math.round(x%1 * 1000.0) / 1000.0 ;
        return res;
    }
    public static int sumLastNums(int x) {
        int first= x%10;
        int second = (x/10)%10;
        return first + second;
    }
}
