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
public class Books {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
				BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
				obr.flush();
				int T=Integer.parseInt(br.readLine());
				obr.flush();String s;
				StringTokenizer st;		
				while(T-->0)
				{
					if((s=br.readLine())!=null){
					st=new StringTokenizer(s);
					int n=Integer.parseInt(st.nextToken());
					int m=Integer.parseInt(st.nextToken());
					int arr[]=new int[n];
					if((s=br.readLine())!=null)
					{
						st=new StringTokenizer(s);
						for(int i=0;i<n;i++)
						{
							arr[i]=Integer.parseInt(st.nextToken());
						}
					}
					Arrays.sort(arr);long first=0;long second=0;
					
					int start=0;
					int end=n-1;long ans=0;
					for(int i=0;i<m;i++)
					{
						ans+=arr[end]-arr[start];
						end--;
						start++;
					}
					for(int i=end;i>=m;i--)
					{
						ans+=arr[i];
					}
					obr.write(ans+"\n");
					}
				}
				obr.close();
				
	}
}