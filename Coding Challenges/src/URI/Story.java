package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Story {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;StringTokenizer st;
		while(true)
		{
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				int words=Integer.parseInt(st.nextToken());
				int line=Integer.parseInt(st.nextToken());
				int chars=Integer.parseInt(st.nextToken());
				String story=br.readLine()+" ";
				int count=0;int lines=0;int start=0;int k=0;
				int length[]=new int[words];boolean c=false;
				for(int i=0;i<story.length();i++)
				{
				
					if(story.charAt(i)==' '&& !c)
					{
						length[k]=story.substring(start,i).length();
						//System.out.println("length"+length[k]);							
						start=i+1;
						k++;
						c=true;
												
					}
					else if(story.charAt(i)!=' ')
					{
						c=false;
					}
					
				}
				//String str[]=story.split(" ");
				for(int i=0;i<words;i++)
				{
					
					
					if(count+1+length[i]<=chars+1)
					{
						count+=length[i]+1;
					}
					else
					{
						count=length[i]+1;						
						lines++;
					}
					
				}
				lines++;
			 int pages=(lines+line-1)/line;
				System.out.println(pages);
				
			}
			else
				break;

	}
	}

}
