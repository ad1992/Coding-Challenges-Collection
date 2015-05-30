package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class ContractRevision {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
	
		while(!(s=br.readLine()).equals("0 0"))
		{
			 char num=s.charAt(0);
			String orig=s.substring(2);
			char or[]=orig.toCharArray();
			int start=0;
			int end=orig.length()-1;String strnews=" ",endnews=" ";
			while(start<=end)
			{
				if(or[start]!=num)
				{
					strnews+=or[start];
				}
				if(start==end)
					break;
				if(or[end]!=num)
				{
					endnews=or[end]+endnews;					
				}
				start++;
				end--;
			}
			endnews=endnews.trim();
			strnews=strnews.trim();
					
			String news=strnews+endnews;
			int i=0;
			while(i<news.length() && news.charAt(i)=='0')
			{
				i++;
			}
			if(i<news.length())
			news=news.substring(i);
			else
				news="0";
			//System.out.println(news);
		
			for(i=0;i<news.length();i++)
			{
				
				System.out.print(news.charAt(i));
			}
			System.out.println();
		}
		
		
		

	}

}
