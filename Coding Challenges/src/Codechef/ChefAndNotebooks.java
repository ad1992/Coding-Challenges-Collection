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
public class ChefAndNotebooks {

	public static void main(String[] args)throws IOException,NumberFormatException {
		// TODO Auto-generated method stub
		String s;
		StringTokenizer st;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		obr.flush();
		int t=Integer.parseInt(br.readLine());
		boolean flag=false;
		while(t>0)
		{	
			s=br.readLine();
			flag=false;
			if(s!=null&& !s.isEmpty())
			{
				s=s.trim();						
				st=new StringTokenizer(s," ");
				int x=Integer.parseInt(st.nextToken());
				int y=Integer.parseInt(st.nextToken());
				int k=Integer.parseInt(st.nextToken());
				int n=Integer.parseInt(st.nextToken());
				int left=x-y;
				while(n>0)
				{
					s=br.readLine();
					if(s!=null&&!s.isEmpty())
					{
						s=s.trim();
						st=new StringTokenizer(s," ");
						int p=Integer.parseInt(st.nextToken());
						int c=Integer.parseInt(st.nextToken());
						if(p>=left&&c<=k)
						{
							flag=true;
							break;
						}
						n--;
					}						
				}
					if(flag)
					{
						obr.write("LuckyChef\n");
					}
					else
					{
						
						obr.write("UnluckyChef\n");
					}
					t--;
				
			}
		
		}
		obr.close();

	}

	}
