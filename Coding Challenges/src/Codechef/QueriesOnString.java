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
public class QueriesOnString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s;StringTokenizer st;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		s=br.readLine();
		st=new StringTokenizer(s," ");
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		String num=br.readLine();
		while(M-->0)
		{
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s," ");
				int ch=Integer.parseInt(st.nextToken());
				if(ch==1)
				{
					int pos=Integer.parseInt(st.nextToken());
					int dest=Integer.parseInt(st.nextToken())+48;		
					//System.out.println(dest);
					char a[]=num.toCharArray();					
					a[pos-1]=(char)dest;					
					num=String.copyValueOf(a);
					long an=Math.round(10.98);
					System.out.print(an);
				}
				
				else
				{
					int start=Integer.parseInt(st.nextToken());
					int end=Integer.parseInt(st.nextToken());
					//System.out.println(num);
					int c=0;
					for(int i=start-1;i<end;i++)
					{
						for(int j=i+1;j<=end;j++)
						{
							String sub=num.substring(i,j);
							//System.out.println("i="+i+" "+"j="+j);
							//System.out.println("sub="+sub);
							int number=Integer.parseInt(sub);
							
							if(number%3==0)
							{
								c++;
								//System.out.println(c);
							}
							
							
						}	
					
						
					}
					
					obr.write(String.valueOf(c));
					obr.newLine();
				}
			}
	
		}
		obr.close();

	}
}

