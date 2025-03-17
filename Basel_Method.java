import java.util.Scanner;

public class Basel_Method {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		double pi = 1;
		double sum = 0;

		System.out.print("How long do you want to calculate the infinite series(Max=9223372036854775806)? ");
		long length = user.nextLong();

		for (long i=1; i<=length; i++) {
			sum += 1.0 / (i * i);
		}

		sum *= 6;
		pi = Math.sqrt(sum);

		System.out.println(pi);
	}
}
