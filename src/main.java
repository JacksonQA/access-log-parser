public class main {
    public static void main(String[] args) {
    Conditions.printDays("суббота");
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
    public static boolean isInRange(int a, int b, int num){
      boolean res1 = num <= a && num >= b;
      boolean res2 = num >= a && num <= b;
        return res1 | res2;
    }
    public static boolean isDivisor (int a, int b) {
        boolean res = (a%b == 0) || (b%a == 0);
        return res;
    }
    public static boolean isEqual (int a, int b, int c){
         boolean res = a == b && a == c;
        return res;
    }
    public static int lastNumSum(int a, int b){
        return (a%10)+(b%10);
    }
    public static boolean isPositive(int x){
        return x > 0;
    }
}
