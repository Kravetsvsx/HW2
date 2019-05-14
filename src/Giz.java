import java.util.Scanner;

public class Giz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество дней:");
        int a = in.nextInt();
        System.out.println("Введите количество осадков в день:");
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int sum;
        int col;
        int max;
        sum=(b+c+d)*a;
        col=(b+c+d)/3;
        max=(b+c+d)*a;
            System.out.println("Количество дней" + " " + a);
            System.out.println("Сумма осадков" + " " + sum);
            System.out.println("Среднее колличество осадков" + " " + col);
            System.out.println("Максимальное колличество осадков" + " " + max);


        }

    }
