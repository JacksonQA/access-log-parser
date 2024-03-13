public class Conditions {
    public static int abs(int x){
        if (x >= 0) return x;
        return (x * -1);
    }
    public static int safeDiv(int x, int y){
        if (y == 0) return 0;
        return (x / y);
        }
    public static int max(int x, int y){
       return (x > y)?x: y;
    }
//    public static String makeDecision(int x, int y){
//        if (x > y) return
//        else if (x < y) return System.out.println(x + '<' + y);
//        else if (x == y) return System.out.println(x + "==" + y);
//    }
    public static String makeDecision(int x, int y){
        String result = "";
        if (x > y) {
           return  result =x + " > " + y;
        } else if (x < y) {
           return result =x + " < ";
        } else {
           return result = x + " == " + y;
        }
    }
    public static int max3(int x, int y, int z){
        if (x > y && x >= z) return x;
        else if (y > x && y >= z) return y;
        else return z;
    }
    public static boolean sum3(int x, int y, int z){
        return (x + y == z)  || (x + z == y) || (z + y == x);
    }

}
