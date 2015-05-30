package Codechef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Fombi2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
		while(T-->0)
		{
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				int N=Integer.parseInt(st.nextToken());
				int M=Integer.parseInt(st.nextToken());
				int Q=Integer.parseInt(st.nextToken());
				while(Q-->0){
				int r=Integer.parseInt(br.readLine());
				int l=N-r;
				int min=Math.min(l, r);
				int max=N-min;
				 int i=max+1;int cal=1;
					while(i<=N)
					{
						int num=i%M;
						int pow=i;int p=1;
						if(pow==0)
						{
							i++;
							continue;
						}
						while(pow>0)
						{
							if((pow&1)!=0)
							{
								p=(p*num)%M;
							}
							pow>>=2;
							num=(num*num)%M;
						}
						cal=(cal*p)%M;
						i++;
						
					}
					i=2;int cal1=1;
					while(i<=min)
					{
						int num=i%M;
						int pow=i*(M-2);int p=1;
						if(pow==0)
						{
							i++;
							continue;
						}
						while(pow>0)
						{
							if((pow&1)!=0)
							{
								p=(p*num)%M;
							}
							pow>>=2;
							num=(num*num)%M;
						}
						cal1=(cal1*p)%M;
						i++;
						
					}
					int fin=(cal*cal1)%M;
					obr.write(fin+"\n");
				}
				
			}
		}
		obr.close();

	}

}
