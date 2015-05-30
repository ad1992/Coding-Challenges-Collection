package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class Army {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());String s;
		while(T-->0)
		{
			if((s=br.readLine())!=null)
			{
				int visited[]=new int[91];
				for(int i=0;i<s.length();i++)
					visited[i]=-1;
			
				int curr=0;int maxlen=1;
				for(int i=0;i<s.length();i++)
				{
					char ch=s.charAt(i);
					int previous=visited[ch];
					if(previous==-1||i-curr>previous)
					{
						curr++;
					}
					else
					{
						if(maxlen<curr)
							maxlen=curr;
						curr=i-previous;
					}
					visited[ch]=i;
					
					
				}
				if(curr>maxlen)
					maxlen=curr;
					
				System.out.println(maxlen);
				
			}
		}
	}
		
	}


