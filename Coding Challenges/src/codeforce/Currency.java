package codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class Currency {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		String num=br.readLine();int smallpos=Integer.MAX_VALUE;int largepos=Integer.MIN_VALUE;
		int max=-1;int l=num.length();
		char odd=num.charAt(l-1);
		char smallest=odd,largest=odd;
		int start=0,end=num.length()-2;boolean flag1=false;boolean flag2=false;
		while(start<num.length()-1)
		{
			char c1=num.charAt(start);
			char c2=num.charAt(end);
			
			if(c1%2==0 &&c1<smallest && start<smallpos)
			{
				c1=smallest;
				smallpos=start;
				flag1=true;
				
			}
			if(c2%2==0 && c2>largest && end>largepos)
			{
				c2=largest;
				largepos=end;
				flag2=true;
			}
			end--;
			start++;
			
		}int finals = -1;
		if(!flag1&!flag2)
			finals=-1;
		else if(!flag1)
			finals=largepos;
		else if(!flag2)
			finals=smallpos;
		else if(flag1&&flag2)
		{
			if(smallpos>largepos)
			{
				finals=smallpos;
			}
			else
			finals=Math.min(smallpos,largepos);
		}
		String s1;long number;
				if(finals==-1)
					s1="-1";
				else{
				if(finals==0)
					s1=odd+num.substring(1,l-1)+num.charAt(finals);
				else
					s1=num.substring(0,finals)+odd+num.substring(finals+1,l-1)+num.charAt(finals);
			
				}
			
		
		System.out.println(s1);
		
	}

}
