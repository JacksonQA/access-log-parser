public class Conditions {
    public static int abs(int x) {
        if (x >= 0) return x;
        return (x * -1);
    }

    public static int safeDiv(int x, int y) {
        if (y == 0) return 0;
        return (x / y);
    }

    public static int max(int x, int y) {
        return (x > y) ? x : y;
    }

    public static String makeDecision(int x, int y) {
        String result = "";
        if (x > y) {
            return result = x + " > " + y;
        } else if (x < y) {
            return result = x + " < ";
        } else {
            return result = x + " == " + y;
        }
    }

    public static int max3(int x, int y, int z) {
        if (x > y && x >= z) return x;
        else if (y > x && y >= z) return y;
        else return z;
    }

    public static boolean sum3(int x, int y, int z) {
        return (x + y == z) || (x + z == y) || (z + y == x);
    }

    public static int sum2(int x, int y) {
        if (x + y <= 19 && x + y >= 10) return 20;
        return x + y;
    }

    public static boolean is35(int x) {
        return (x % 3 == 0 || x % 5 == 0) && x % 15 != 0;
    }

    public static boolean magic6(int x, int y) {
        if (x + y == 6 || x - y == 6 || y - x == 6 || x == 6 || y == 6) return true;
        return false;
    }

    public static String age(int x) {
        if (x % 10 == 1 && x != 11)
            return (x + " год");

        else if ((x % 10 == 2 || x % 10 == 3 || x % 10 == 4) && (x != 12) && (x != 13) && (x != 14))
            return (x + " года");
        else return (x + " лет");


    }

    public static void printDays(String x){
        switch (x){
            case ("понедельник"):
                System.out.println("понедельник");
            case ("вторник"):
                System.out.println("вторник");
            case ("среда"):
                System.out.println("среда");
            case ("четверг"):
                System.out.println("четверг");
            case ("пятница"):
                System.out.println("пятница");
            case ("суббота"):
                System.out.println("суббота");
            case ("воскресенье"):
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }
}
