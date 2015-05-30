package Codechef;

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
public class DynamicInversion {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		/*String s;
		StringTokenizer st;
		s=br.readLine();
		st=new StringTokenizer(s);
		int N=Integer.parseInt(st.nextToken());
		int Q=Integer.parseInt(st.nextToken());
		s=br.readLine();
		st=new StringTokenizer(s);*/
		int i=1;int N=100000;
		int arr[]=new int[N+1];
		
		while(i<=N)
		{
			arr[i]=Integer.parseInt(br.readLine());
			i++;
		}
		long inversions=mergesort(arr,1,N);
		System.out.println(inversions);
		
		/*while(Q-->0)
		{
			if((s=br.readLine())!=null)
			{
				
				inversions=inversions==0?1:0;
				System.out.println(inversions);
			}
			
		}*/
		
		
	}

	private static long mergesort(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int mid=0;long inv=0;
		if(i<j)
		{
			 mid=(i+j)/2;
			// System.out.println("mid="+mid);
			 inv=mergesort(arr,i,mid)+mergesort(arr,mid+1,j)+merge(arr,i,mid,j);	
			
		}
		return inv;
	}

	private static long merge(int[] arr, int i, int mid, int j) {
		// TODO Auto-generated method stub
		int temp[]=new int[arr.length];
		int l=i;
		int  r=j;
		int m=mid+1;
		int k=l;
		long inv=0;		
		while(l<=mid && m<=r)
		{
			if(arr[l]<=arr[m])
			{
				temp[k++]=arr[l++];
			}
			else
			{
				temp[k++]=arr[m++];
				inv+=mid-l+1;
				
			}
			
		}
		while(l<=mid)
			temp[k++]=arr[l++];
		while(m<=r){
			//System.out.println("m="+m);
			temp[k++]=arr[m++];			
		}
			
		for(int i1=i;i1<=j;i1++){
			arr[i1]=temp[i1];
		}
		
		
		return inv;
	}

}
