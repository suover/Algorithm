import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();
		int arr[] = new int[T];

		for (int i = 0; i < T; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			arr[i] = A + B;
		}

		for (int sum : arr) {
			System.out.println(sum);
		}
	}
}