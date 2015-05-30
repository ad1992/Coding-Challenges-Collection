package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class CommonSubstring {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s1,s2;
		
		
		while((s1=br.readLine())!=null && ((s2=br.readLine())!=null))
		{
			Math.min(s1.length(), s2.length());
			int lcs[][]=new int[s1.length()+1][s2.length()+1];
			char[] firststring=s1.toCharArray();
			char[] secondstring=s2.toCharArray();int result=0;
			for(int i=0;i<=s1.length();i++)
			{
				for(int j=0;j<=s2.length();j++)
				{
					if((i==0)||(j==0))
						lcs[i][j]=0;
					else if(firststring[i-1]==secondstring[j-1])
					{
						lcs[i][j]=lcs[i-1][j-1]+1;
						result=Math.max(result, lcs[i][j]);
					}
					else
					{
						lcs[i][j]=0;
					}
				}
			}
		
			System.out.println(result);
		}

	}

	
}
