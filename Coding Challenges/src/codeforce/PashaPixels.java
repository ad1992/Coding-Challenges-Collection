package codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class PashaPixels {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		String s=br.readLine();
		StringTokenizer st=new StringTokenizer(s);
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		boolean arr[][]=new boolean[n+1][m+1];int c=0;boolean flag=false;;
		while(k-->0)
		{
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				c++;
				int i=Integer.parseInt(st.nextToken());
				int j=Integer.parseInt(st.nextToken());
				if(!arr[i][j]){
					arr[i][j]=true;
					
					if(c>=4)
					{
						if(i-1>=1&&j-1>=1)
						{
							if(arr[i][j-1]&&arr[i-1][j-1]&&arr[i-1][j])
							{
								flag=true;
								break;
							}
							
						}
						 if(i+1<=n && j-1>=1)
						{
							if(arr[i][j-1]&&arr[i+1][j-1]&&arr[i+1][j])
							{
								flag=true;
								break;
							}
							
						}
						 if(i-1>=1&& j+1<=m)
						{
						
							if(arr[i-1][j]&&arr[i-1][j+1]&& arr[i][j+1])
							{
								flag=true;
								break;
							}
								
						}
						 if(i+1<=n&&j+1<=m)
						{
							//System.out.println(i+" "+j);
							if(arr[i][j+1]&&arr[i+1][j]&&arr[i+1][j+1])
							{
								flag=true;
								break;
							}
						}
					}
				
				
			}
		}
		}
		if(!flag)
		{
			System.out.println(0);
		}
		else
		{
			System.out.println(c);
		}
		/*for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}*/
	
	
}	
}
		
	


