package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Aakansha Doshi
 *
 */
public class Kaprekar {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		int caser=1;
		while(T-->0)
		{
			String  num=br.readLine();
			int c=0;
			
			while(!num.equals("6174"))
			{
				char arr[]=num.toCharArray();
				if(num.equals("0")||num.equals("00")||num.equals("000")||num.equals("0000"))
				{
					c=-1;
					break;
				}
				Arrays.sort(arr);
				//System.out.println(arr.length);
				String large="",small="";
				for(int i=arr.length-1;i>=0;i--)
				{
					
						large+=arr[i];
						small=arr[i]+small;		
						//System.out.println("large "+large+" small "+small);
					
				}
				while(large.length()<4)
					large+="0";
				
					//System.out.println("large "+large+" small "+small);
					large=large.trim();
					small=small.trim();
				int diff=Integer.parseInt(large)-Integer.parseInt(small);
				num=Integer.toString(diff);
				
				c++;
				
			}		
			
			System.out.println("Caso #"+caser+": "+c);
			caser++;
			}
	
			
	}
}
