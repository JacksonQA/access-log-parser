import java.math.BigDecimal;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        System.out.println("Результат метода fraction: " + fraction(5.3));
//        System.out.println("Результат метода sumLastNums: " + sumLastNums(4568923));
//        System.out.println("Результат метода charToNum: " + charToNum('5'));
//        System.out.println("Результат метода is2Digits: " + is2Digits(10));
        System.out.println("Результат метода isUpperCase: " + isUpperCase('a'));
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
    public static int charToNum(char x){
      int res = x - 48;
        return res;
    }
    public static boolean is2Digits(int x){
        boolean res = x > 9;
        return res;
    }
    public static boolean isUpperCase(char x){
        boolean res = x < 91;
        return res;
    }
}
