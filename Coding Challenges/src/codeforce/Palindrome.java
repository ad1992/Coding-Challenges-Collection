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
public class Palindrome {

	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		obr.flush();
		String s=br.readLine();
		//StringBuilder s1=new StringBuilder(s);
		StringTokenizer st=new StringTokenizer(s);
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		m=m-1;int moves=0;
		String str=br.readLine();
		int k=n-1,i=0;int min,max;int maxl=0,maxr=0;
		min=0;int left=0,right=0;
		max=Integer.MIN_VALUE;
		while(k>=i )
		{
			char c1=str.charAt(i);
			char c2=str.charAt(k);
			if(c1!=c2){
				int c=Math.abs(c1-c2);
				if(i<=m)
				{
					left=i;
					right=k;
				}
				else
				{
					left=k;
					right=i;
				}
				int dist1=left-m;
				int dist2=right-m;
				min=Math.min(Math.abs(dist1),dist2);
				if(min==(dist1*-1)&&min>maxl&&i<=m )
				{
					maxl=min;
				}
				if(min==(dist2)&&min>maxr&&k>=m)
				{
					maxr=min;
				}
				if((c==25)&& c1=='a')
				{
					c=122;
					if(min!=0)
					moves++;
				}
				else if((c==25 && c1=='z'))
				{
					c=97;
					if(min!=0)
					moves++;
				}
				else
				{
					if(min!=0)
					moves+=c;
				}
				//char c3=c1;
				//s1=s1.insert(i, c3);
			}
			k--;
			i++;
		}
		//System.out.println("maxl="+maxl +"maxr="+maxr);
		int fin;
		int maxy=Math.max(maxl, maxr);
		//int finals=Math.min(ms,max);
		if(maxl!=maxr)
		{
			moves+=2*Math.min(maxl,maxr)+maxy;
		}
		else
			moves+=min;
		obr.write(moves+"\n");
		obr.close();
		
	}

}
