package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class DancingSentence {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while(true)
		{
			if((s=br.readLine())!=null)
			{
				String output="";int c=0;
				for(int i=0;i<s.length();i++)
				{
					char ch=s.charAt(i);
					if(ch==' ')
					{
						output+=ch;
					}
					else
					{
						if(c==0)					
						{
							if(ch>='A' && ch<='Z')
							{
								output+=ch;
							}
							else
							{
								ch=(char) (ch-32);
								output+=ch;
							}
							
						}
						else if(c==1)
						{
							if(ch>='a' && ch<='z')
							{
								output+=ch;
							}
							else
							{
								ch=(char) (ch+32);
								output+=ch;
							}
							
						}
						c^=1;
					
					}
				}
				//output=output.trim();
				System.out.println(output);
			}
			else
				break;
		}
	}

}
