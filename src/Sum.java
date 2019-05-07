
import java.util.Scanner;

public class Sum {
    public static void main( String args []) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Введите число:");
        long n = in.nextLong();
        long m = n;
        long r = 0;
        System.out.println(" Cума цифр числа " + n + " = ");
        while (m != 0) {

            r += m%10;
            m /= 10;

        }
        System.out.println(r);
    }
}
