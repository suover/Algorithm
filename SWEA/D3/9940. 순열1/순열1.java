import java.util.Scanner;
import java.io.FileInputStream;
import java.util.HashSet;
import java.util.Set;

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
			Set<Integer> set = new HashSet<>();
			boolean isPermutation = true;

			for (int i = 0; i < N; i++) {
				int num = sc.nextInt();
				if (num < 1 || num > N || !set.add(num)) {
					isPermutation = false;
				}
			}

			System.out.println("#" + test_case + " " + (isPermutation ? "Yes" : "No"));
		}
	}
}