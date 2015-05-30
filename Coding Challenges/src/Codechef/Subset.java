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
public class Subset {

	public Subset() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		int N=Integer.parseInt(br.readLine());
		int arr[]=new int[N];		
		String s;
		if((s=br.readLine())!=null){
		StringTokenizer st=new StringTokenizer(s);int i=0;
		while(i<N)
		{
			arr[i]=Integer.parseInt(st.nextToken());
			i++;
		}
		int num=(int)Math.pow(2, N);int tsum=0,sum=0;
		for(int j=0;j<N;j++)
		{
			tsum+=arr[j];
		}
		if(tsum%2==0){
		tsum/=2;boolean flag=false;
		for(int i1=0;i1<num;i1++)
		{
			sum=0;
			for(int j=0;j<N;j++)
			{
				if((i1 & 1<<j)>0)
				{
					obr.write(arr[j]+" ");
					sum=sum+arr[j];
				}	
					
				
			}
			if(sum==tsum)
			{
				flag=true;
				break;
			}
			obr.write("\n");
			
		}
		if(flag)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
		else
		{
			System.out.println("No");
		}
		obr.close();
	}

}}
