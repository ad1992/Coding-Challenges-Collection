package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class LetterRange {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while(true)
		{
			s=br.readLine();
			if(s!=null){
			if(s.isEmpty())
				System.out.println();
			else
			{
				boolean arr[]=new boolean[123];
				for(int i=0;i<s.length();i++)
				{
					arr[s.charAt(i)]=true;
				}
				int i=97;String ans="";
				while(i<=122)
				{
					int count=-1;int z=i;
					if(arr[i])
					{
						while(i<=122 && arr[i])
						{
							i++;
							count++;
						}
						if(count==0)
						{
							ans+=(char)z+":"+(char)z+", ";
						}
						else if(count>0)
						{
							ans+=(char)z+":"+(char)(z+count)+", ";
						}
					}
					else
						i++;
				}
				ans=ans.trim();
				System.out.println(ans.substring(0,ans.length()-1));
			}
		
		}
		else
			break;
		}
	}

}
