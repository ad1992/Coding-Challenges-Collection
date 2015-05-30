package Codechef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author Aakansha Doshi
 *
 */
public class ConstructPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		long T;
		try {
			obr.flush();
			T = Long.parseLong(br.readLine());
			while(T-->0)
			{
				String s=br.readLine();
				StringBuffer s1=new StringBuffer(s);
				char pal[]=s.toCharArray();
				int n=s.length();
				int left=0;
				int right=n-1;boolean count=false;;
				while(right>=left)
				{
					if(s.equals(s1.reverse()))
					{
						break;
					}
					else if(pal[left]!=pal[right])
					{
												
						
						if((!count && (check(left,right-1,pal)|| check(left+1,right,pal))))
						{
							
							break;
						}
						else
						{
							count=true;
							break;
						}
							
								
							
					}
					else
					{
						left++;
						right--;
					}
					
				}
				if(!count)
				{
					obr.write("YES"+"\n");
				}
				else
					obr.write("NO"+"\n");
			}
			obr.close();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}

	private static boolean check(int left, int right, char[] pal) {
		// TODO Auto-generated method stub
		int i=left;
		int j=right;
		while(right>=left)
		{
			if(pal[left]!=pal[right])
				return false;
			right--;
			left++;
		}
		return true;
		
	}

}
