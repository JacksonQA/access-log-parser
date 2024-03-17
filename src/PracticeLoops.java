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

}
