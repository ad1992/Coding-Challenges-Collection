package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Physics {

	public Physics() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		StringTokenizer st;String s,s1;
		while(T-->0)
		{
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s," ");
				int  N=Integer.parseInt(st.nextToken());
				int F=Integer.parseInt(st.nextToken());
				int arr[]=new int[N];
				int count=0;
				if((s1=br.readLine())!=null)
				{
					st=new StringTokenizer(s1," ");
					for(int i=0;i<N;i++)
					{
					arr[i]=Integer.parseInt(st.nextToken());
					}
					for(int i=0;i<N;i++)
					{
						
						
						for(int j=0;j<N;j++)
						{
							if(arr[j]<arr[i])
							{
								double a=arr[i];
								while(a>arr[j])
								{
									a=a/F;
									if(a==arr[j])
									{
										count++;
										break;
									}
									
									
									
								}
							
						
								
						}
							else if(arr[j]==arr[i] && j>i)
								count++;
						}
				}
				System.out.println(count);
			}
		}
	}

	}}
