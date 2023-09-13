public class Reduce {
    public static void main(String[] args) {
        int a = 100;
        int x = 0;

        while ( a > 0 ) {
            if (a % 2 == 0) {
                a = a / 2;
            }
            else {
                a = a - 1;
            }
            x++;
        }
        System.out.println(x);
    }
}
