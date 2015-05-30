package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class ModularMove {
	static long fact[], inverse[];
	static long mod = 1000000007l;

	public ModularMove() {
		// TODO Auto-generated constructor stub
		fact=new long[5001];
		
		inverse=new long[5001];
		fact[0]=1;
		
		for(int i=1;i<=5000;i++)
		{
			fact[i]=(i*fact[i-1])%mod;			
			
		}
		inverse[5000]=((new BigInteger(String.valueOf(fact[5000]))).modInverse(new BigInteger(String.valueOf(mod)))).longValue();
		
		for(int i=5000;i>0;i--)
		{
			inverse[i-1]=(i*inverse[i])%mod;
		}
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int cases = 0;
		ModularMove ob = new ModularMove();
		while (cases <= 5000) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int turns = Integer.parseInt(st.nextToken());
			if (N == 0 && turns == 0)
				break;

			long ans =(((ncr((N - 2), (turns / 2)) * ncr((N - 2),
					((turns - 1) / 2)) )) * 2) % mod;
			System.out.println(ans);
			cases--;

		}

	}

	private static  long ncr(int i, int j) {
		// TODO Auto-generated method stub
		return (((fact[i] * inverse[i - j] % mod) * inverse[j]) % mod);

	}

}
