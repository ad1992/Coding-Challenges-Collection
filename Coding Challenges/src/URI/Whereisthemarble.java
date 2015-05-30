package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Whereisthemarble {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		String s;StringTokenizer st;int c=1;
		while(true)
		{
				
				if(!(s=br.readLine()).equals("0 0")){
				st=new StringTokenizer(s);
				int N=Integer.parseInt(st.nextToken());
				int Q=Integer.parseInt(st.nextToken());
				int marble[]=new int[N];int i=0;
				int query[]=new int[Q];
				while(i<N)
				{
					marble[i]=Integer.parseInt(br.readLine());
					i++;
				}
				i=0;
				while(i<Q)
				{
					query[i]=Integer.parseInt(br.readLine());
					i++;
				}
				mergesort(marble,0,N-1);
				
				//Arrays.sort(marble);				
				System.out.println("CASE# "+c+":");i=0;
				while(i<Q)
				{
					int n=query[i];
					int pos=binarysearch(marble,0,N-1,n);
					
					if(pos==-1)
					{
						System.out.println(n +" not found");
					}
					else
					{
						System.out.println(n+" found at "+(pos+1));
					}
					i++;
					
				}
				c++;
				}
				else
					break;
			}
			
		
	}

	private static int binarysearch(int[] marble, int i, int j,int num) {
		// TODO Auto-generated method stub
		if(i>j)
			return -1;
		int mid=(i+j)/2;
		if(marble[mid]==num)
		{
			int c=mid;
			while(c>-1 && marble[c]==num)
				c--;
			return c+1;
		}
			
		if(marble[mid]>num)
			return binarysearch(marble, i, mid-1, num);
		else
			return binarysearch(marble, mid+1, j, num);
		
	}

	private static void mergesort(int[] marble, int i, int j) {
		// TODO Auto-generated method stub
		if(i<j)
		{
			int mid=(i+j)/2;
			mergesort(marble,0,mid);
			mergesort(marble,mid+1,j);
			merge(marble,i,mid,j);
		}
		
	}

	private static void merge(int[] marble, int i,int mid, int j) {
		// TODO Auto-generated method stub
		int[] temp=new int[marble.length];
		int i1=0;int j1=mid+1;int k1=0;
		while(i1<=mid&&j1<=j)
		{
			if(marble[i1]<=marble[j1])
			{
				temp[k1]=marble[i1];
				i1++;
			}
			else
			{
				temp[k1]=marble[j1];
				j1++;
			}
			k1++;
		}
		while(i1<=mid)
		{
			temp[k1]=marble[i1];
			k1++;
			i1++;
		}
		while(j1<=j)
		{
			temp[k1]=marble[j1];
			k1++;
			j1++;
		}
		for(int i11=0;i11<=j;i11++)
		{
			marble[i11]=temp[i11];
			//System.out.println(marble[i11]);
		}
	}
		
}
