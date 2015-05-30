package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class Parenthesis {
static char arr[];
static int top;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		String s;
		while(true)
		{
			if((s=br.readLine())!=null)
			{
				 top=-1;boolean flag=false;
				arr=new char[s.length()/2];
				for(int i=0;i<s.length();i++)
				{
					if(s.charAt(i)=='(')
					{
						arr[++top]='(';
					}
					else if(s.charAt(i)==')')
					{
						if(top>-1&&arr[top]=='(')
							top--;
						else
						{
							flag=true;
							break;
						}
					}
				}
				if(top==-1 && !flag)
				{
					System.out.println("correct");
				}
				else
					System.out.println("incorrect");
			}
			else
				break;
		}

	}
	
}
