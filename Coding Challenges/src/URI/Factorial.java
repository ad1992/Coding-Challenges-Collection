package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Factorial {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;StringTokenizer st;
		long arr[]=new long[21];
		arr[0]=1;
		for(int i=1;i<=20;i++)
		{
			arr[i]=arr[i-1]*i;
		}
		while(true)
		{
			if((s=br.readLine())!=null&&!s.isEmpty())
			{
				st=new StringTokenizer(s);			
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st.nextToken());
				long c=arr[a]+arr[b];
				System.out.print(c+"\n");
			}
			else
			{
				break;
			}
		}
	}

	/*private static long fact(int a) {
		// TODO Auto-generated method stub
		if(a==0)
		return 1;
		return a*fact(a-1);
	}*/

}
