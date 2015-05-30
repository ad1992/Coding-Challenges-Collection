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
public class Music {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		obr.flush();
		String s=br.readLine();
		//StringBuilder s1=new StringBuilder(s);
		StringTokenizer st=new StringTokenizer(s);
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());int i=0;
		s=br.readLine();
		st=new StringTokenizer(s);
		int arr[]=new int[n]; 
		while(i<n)
		{
			arr[i++]=Integer.parseInt(st.nextToken());
		}
		
		int arrcopy[]=new int[n];
		for(i=0;i<arr.length;i++)
		{
			arrcopy[i]=i+1;
		}
		mergesort(arr,arrcopy,0,n-1);
		i=0;int count=0;
		while(i<arr.length && k>=0)
		{
			 k=k-arr[i];
			if(k>=0)
			{
				count++;
			}
			i++;
		}
		obr.write(Integer.toString(count));
		obr.newLine();
		if(count>0)
		{
			for(i=0;i<count;i++)
			{
				obr.write(Integer.toString(arrcopy[i])+" ");
			}
		}
		obr.newLine();
		obr.close();
	}
	private static void mergesort(int[] arr,int[] arr1, int i, int j) {
		// TODO Auto-generated method stub
		int mid=0;
		if(i<j)
		{
			 mid=(i+j)/2;
			// System.out.println("mid="+mid);
			 mergesort(arr,arr1,i,mid);
			 mergesort(arr,arr1,mid+1,j);
			 merge(arr,arr1,i,mid,j);	
			
		}
		
	}

	private static void merge(int[] arr,int[] arr1, int i, int mid, int j) {
		// TODO Auto-generated method stub
		int temp[]=new int[arr.length];
		int temp1[]=new int[arr.length];
		int l=i;
		int  r=j;
		int m=mid+1;
		int k=l;
		long inv=0;		
		while(l<=mid && m<=r)
		{
			if(arr[l]<=arr[m])
			{
				temp[k]=arr[l];
				temp1[k]=arr1[l];
				k++;l++;
				
			}
			else
			{
				temp[k]=arr[m];
				temp1[k]=arr1[m];
				k++;m++;
				//inv+=mid-l+1;
				
			}
			
		}
		while(l<=mid){
			temp[k]=arr[l];
			temp1[k]=arr1[l];
			k++;l++;
		}
		while(m<=r){
			//System.out.println("m="+m);
			temp1[k]=arr1[m];			
			temp[k]=arr[m];		
			k++;m++;
		}
			
		for(int i1=i;i1<=j;i1++){
			arr[i1]=temp[i1];
			arr1[i1]=temp1[i1];
		}
		
		
		//return inv;
	}
}
