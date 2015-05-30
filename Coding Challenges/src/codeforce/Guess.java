package codeforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Guess {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		obr.flush();
		String s=br.readLine();
		//StringBuilder s1=new StringBuilder(s);
		StringTokenizer st=new StringTokenizer(s);
		int h=Integer.parseInt(st.nextToken());
		int n=Integer.parseInt(st.nextToken());
		int nodes=(int) Math.pow(2, (h+1));
		int arr[]=new int[nodes];
		boolean check[]=new boolean[nodes];
		for(int i=1;i<arr.length;i++)
		{
			arr[i]=i;
		}
		int start=1;int c=0;int next=0;int count=1;int skip;	skip=0;
		while(true)
		{
			
		
			if(c==0)
			{
				if(start*2<nodes)
				{
					next=start*2;
					if(check[next])
					{
						c=c^1;
						skip++;
						if(skip<=2)
						continue;
					}
					if(skip==3)
					{
						next=start/2;
						skip=0;
						start=next;
						continue;
							
					}
					}
				else{
					start=start/2;
					skip=0;
					continue;
				}
				check[next]=true;
				start=next;				
				count++;		
				skip=0;
				if(next==n)
					break;
			}
			else
			{
				if(start*2+1<nodes)
				{
					next=start*2+1;
					if(check[next])
					{
						c=c^1;
						skip++;
						if(skip<=2)
						continue;
					}
					if(skip==3)
					{
						next=start/2;
						skip=0;
						start=next;
						continue;
							
					}
				}
				else{
					start=start/2;
					skip=0;
					continue;
				}
				check[next]=true;
				start=next;				
				count++;		
				skip=0;
				if(next==n)
					break;
			}
			//System.out.println(start);

			c=c^1;

		}
		System.out.println(count);

	}

}
