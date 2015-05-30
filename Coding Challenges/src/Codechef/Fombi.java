package Codechef;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;
 
/**
 * @author Aakansha Doshi
 *
 */
public class Fombi {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
		obr.flush();
		while(T-->0)
		{
			
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				int N=Integer.parseInt(st.nextToken());
				long M=Long.parseLong(st.nextToken());
				int Q=Integer.parseInt(st.nextToken());int max,min;
				
				while(Q-->0)
				{	
				int r=Integer.parseInt(br.readLine());
				int l=N-r;
				if(l>r)
				{
					max=l;
					min=r;
				}
				else
				{
					max=r;
					min=l;
				}
				int i=max+1;BigInteger res = new BigInteger("1"),now;		
				while(i<=N)
				{
					now=new BigInteger(String.valueOf(i));
					res=res.multiply(now.pow(i));
					i++;
					
				}
				
				BigInteger res1 = new BigInteger("1");
				for(i=1;i<=min;i++)
				{
					now=new BigInteger(String.valueOf(i));
					res1=res1.multiply(now.pow(i));
				}
				
				BigInteger result=(res.divide(res1)).mod(new BigInteger(String.valueOf(M)));
				obr.write(result+"\n");
				}
			}
		}
		obr.close();
	}
}
 
 
