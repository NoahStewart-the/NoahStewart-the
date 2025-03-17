import java.util.Scanner;

public class WallisProduct_Method {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		double pi = 1;

		System.out.print("How long do you want to calculate the infinite series(Max=2147483646)? ");
		int length = user.nextInt();

		for (int i=1; i<=length; i++) {
			double factor = (4.0 * i * i) / (4.0 * i * i - 1);
			pi *= factor;
		}
		pi *= 2;

		System.out.println(pi);
	}
}
