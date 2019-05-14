
import java.util.Scanner;

public class Fibonachi2 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Введите число:");
        int d = in.nextInt();
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0+" "+n1+" ");
        for(int i = 0; i < d; i++){

            n2=n0+n1;
            if (n2>=d)
                break;

            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
        }
        System.out.println();
            }
        }