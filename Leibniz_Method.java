import java.util.Scanner;
public class Leibniz_Method {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 1;
        double frac;
        int sign = -1;

        System.out.print("How long do you want to calculate the infinite series? ");
        long length = input.nextLong();

        for (long i=3; i<=length; i+=2) {
            frac = 1.0/i;
            pi += frac*sign;
            sign *= -1;
        }
        pi *= 4;

        System.out.println(pi);
    }
}
