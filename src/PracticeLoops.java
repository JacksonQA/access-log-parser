public class PracticeLoops {

    public static String listNums(int x){
        String q = "";
        for (int i = 0; i <= x; i++) {
            q += i +" ";
        }
        return q;
    }
    public static String reverseListNums(int x){
        String q = "";
        for (int i = x; i >= 0; i--) {
            q += i +" ";
        }
        return q;
    }
    public static String chet(int x){
        String q = "";
        for (int i = 0; i <= x; i+= 2) {
            q += i +" ";
        }
        return q;
    }
    public static int pow(int x, int y){
        int q = 1;
        for (int i = 0; i < y; i++) {
            q *= x;
        }
        return q;
    }
    public static int numLen(long x){
        int q = 0;
        for (int i = 0; x > 0; i++) {
            x /= 10;
            q += 1;
        }
        return q;
    }
    public static boolean equalNum(int x){
        int y = x % 10;
            while (x >= 10){
            x /= 10;
            int z = x % 10;
            if (z != y) return false;
            else continue;
        }
        return true;
    }
    public static void square(int x){
        for (int i = 0; i < x; i++){
            System.out.println("");
            for (int j = 0; j < x; j++){
                System.out.print("*");

            }
        }
    }
    public static void leftTriangle(int x){
        for (int i = 0; i <= x; i++){
            System.out.println("");
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
        }
    }
}
