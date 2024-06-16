import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
			int[] incomes = new int[N];

			int sum = 0;
			for (int i = 0; i < N; i++) {
				incomes[i] = sc.nextInt();
				sum += incomes[i];
			}

			double average = (double) sum / N;
			int count = 0;

			for (int income : incomes) {
				if (income <= average) {
					count++;
				}
			}

			System.out.println("#" + test_case + " " + count);
		}
	}
}