import java.math.BigDecimal;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Результат: " + fraction(5.3));
    }
    public static double fraction(double x) {
        double res = Math.round(x%1 * 1000.0) / 1000.0 ;
        return res;
    }
}
