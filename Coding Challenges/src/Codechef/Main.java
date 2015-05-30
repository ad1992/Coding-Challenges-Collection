package Codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Main {

	private static long[] factorial = new long[5001],
			inversefactorial = new long[5001];
	private static int N, K;
	private static long MOD = 1000000007l;

	private static void initialize() {
		factorial[0] = 1;
		for (int i = 1; i <= 5000; ++i)
			factorial[i] = (i * factorial[i - 1]) % MOD;
		inversefactorial[5000] = (new BigInteger(
				String.valueOf(factorial[5000]))).modInverse(
				new BigInteger(String.valueOf(MOD))).longValue();
		System.out.println(inversefactorial[5000]);
		for (int i = 5000; i > 0; --i)
			inversefactorial[i - 1] = (i * inversefactorial[i]) % MOD;
		for (int i = 0; i <= 5000; ++i)
			System.out.println(inversefactorial[i]);
	}

	private static long nCr(int n, int r) {
		return (((factorial[n] * inversefactorial[n - r] % MOD) * inversefactorial[r]) % MOD);
	}

	public static void main(String[] args) throws Exception {
		initialize();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		while ((N != 0) && (K != 0)) {

			long solution = (((nCr((N - 2), (K / 2)) * nCr((N - 2),
					((K - 1) / 2)) )) * 2) % MOD;
			pw.println(solution);
			System.out.println(solution);
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
		}
		pw.flush();
		pw.close();

	}

}
