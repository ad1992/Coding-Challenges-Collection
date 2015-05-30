package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class Fibonacci {
	static int counter;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		//br.close();
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			int num=Integer.parseInt(br.readLine());
			counter=-1;
			int c=fibo(num);
			System.out.printf("fib(%d) = %d calls = %d\n",num,counter,c);;
		}
	}

	private static int fibo(int num) {
		// TODO Auto-generated method stub
		counter++;
		if(num==1||num==0)
		{
			
			return num;
		}
		
		return fibo(num-1)+fibo(num-2);	
		
		
		
	}

}
