package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class LIS {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int n=Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		int lis[]=new int[n];
		for(int i=0;i<n;i++)
		{
		lis[i]=1;
		}
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[i]>arr[j]&&lis[i]<lis[j]+1)
				{
					lis[i]=lis[j]+1;
				}
			}
				
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(max<lis[i])
				max=lis[i];
		}
		System.out.println(max);
	}

}
