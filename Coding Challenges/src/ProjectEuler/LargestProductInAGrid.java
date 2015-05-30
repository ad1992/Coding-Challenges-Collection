package ProjectEuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class LargestProductInAGrid {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int arr[][]=new int[20][20];
		String s;
		StringTokenizer st;
		for(int i=0;i<20;i++)
		{
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				for(int j=0;j<20;j++)
				{
					arr[i][j]=Integer.parseInt(st.nextToken());
				}
			}
		}
		long max=Long.MIN_VALUE;		
		for(int i=0;i<20;i++)
		{
			for(int j=0;j<20;j++)
			{
				long prod=1l;
				if(j+3<20)
				{
					prod=arr[i][j]*arr[i][j+1]*arr[i][j+2]*arr[i][j+3];
					if(prod>max)
						max=prod;
				}
				if(i+3<20)
				{
					prod=arr[i][j]*arr[i+1][j]*arr[i+2][j]*arr[i+3][j];
					if(prod>max)
						max=prod;
				}
				if(i+3<20&&j+3<20)
				{
					prod=arr[i][j]*arr[i+1][j+1]*arr[i+2][j+2]*arr[i+3][j+3];
					if(prod>max)
						max=prod;
				}
				if((i+3)<20&&(j-3)>=0)
				{
					prod=arr[i][j]*arr[i+1][j-1]*arr[i+2][j-2]*arr[i+3][j-3];
					if(prod>max)
						max=prod;
				}
			}
		}
		System.out.println(max);
	}

}
