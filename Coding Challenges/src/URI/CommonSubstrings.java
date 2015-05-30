package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author Aakansha Doshi
 *
 */
public class CommonSubstrings {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		obr.flush();	String s;
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			int Q=Integer.parseInt(br.readLine());
			String arr[]=new String[Q];int index=0;
			while(Q-->0)
			{
				int start,end;
				start=end=-1;
				if((s=br.readLine())!=null)
				{
					int type=Integer.parseInt(s.substring(0,1));
					String sub=s.substring(2);
					if(type==1)
					{
						arr[index]=sub;
						index++;
					}
					else
					{
						int i=0;int j=index-1;
						while(i<index)
						{
							if(arr[i].equals(sub))
							{
								start=i+1;
								break;
							}
							i++;
						}
						while(j>=i)
						{
							if(arr[j].equals(sub))
							{
								end=j+1;
								break;
							}
							j--;
						}
						System.out.println(start+" "+end);
						
					}
				}
			}
			
		}
		

	}
	

}
