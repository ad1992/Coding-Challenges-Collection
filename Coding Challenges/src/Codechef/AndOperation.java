package Codechef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author Aakansha Doshi
 *
 */
public class AndOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
			
		try {
			obr.flush();			
			int N=Integer.parseInt(br.readLine());
			int arr[]=new int[N];
			boolean check[]=new boolean[N];
			for(int i=0;i<N;i++)
			{
				arr[i]=Integer.parseInt(br.readLine());	
			
			}
			long ans=0;
			for(int i =30;i>=0;i--)
			{
				int count=0;
				for(int j=0;j<N;j++)
				{
					if((!check[j])&&(arr[j]&(1<<i))!=0)
					{
						count++;
						
					}				
					
				}
				
				if(count>=2)
					ans+=1<<i;
				else
					continue;
				for(int j=0;j<N;j++)
				{
					if((arr[j]&(1<<i))==0)
					{
						check[j]=true;
					}
				}
			}
			obr.write(ans+"\n");
			obr.close();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
