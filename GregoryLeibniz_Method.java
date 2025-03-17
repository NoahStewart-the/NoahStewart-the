import java.util.Scanner;

public class GregoryLeibniz_Method {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double pi = 0;
		int sign = -1;

		System.out.print("How long do you want to calculate the infinite series(Max=2147483646)? ");
		int length = input.nextInt();

		for (int i=1; i<=length; i+=2) {
			pi += (4.0 / i) * sign;
			sign *= -1;
		}

		System.out.println(Math.abs(pi));
	}
}