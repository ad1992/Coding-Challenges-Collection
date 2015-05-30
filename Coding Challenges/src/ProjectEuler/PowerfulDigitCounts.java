package ProjectEuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class PowerfulDigitCounts {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		//int N=Integer.parseInt(br.readLine().trim());
		int c=0;int a=0;int N=1;
		while(a<10){
			a=(int)Math.ceil(Math.pow(10, (N-1.0)/N));
			c+=10-a;
			System.out.println(a+" "+N);
			N++;
		
		}
		System.out.println(c);

	}

}
