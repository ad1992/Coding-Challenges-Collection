package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class Gcd1307 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());String s1,s2;		
		int count=0;
		while(T-->0)
		{
			count++;
			if(((s1=br.readLine())!=null)&&((s2=br.readLine())!=null))
			{
				int num1=0,num2=0;int c=0;
				for(int i=s1.length()-1;i>=0;i--)
				{
					if(s1.charAt(i)=='1')
					{
						num1+=Math.pow(2, c);
					}
					c++;
				}
				c=0;
				for(int i=s2.length()-1;i>=0;i--)
				{
					if(s2.charAt(i)=='1')
					{
						num2+=Math.pow(2, c);
					}
					c++;
				}
				//System.out.println(num1+" "+num2);
				int max=Math.max(num1, num2);
				int min=Math.min(num1,num2);
				if((  gcd(max,min))!=1)
				{
					System.out.println("Pair #"+count+": All you need is love!");
				}
				else
				{
					System.out.println("Pair #"+count+": Love is not all you need!");
				}
			}
		}

	}

	private static int gcd(int max, int min) {
		// TODO Auto-generated method stub
		
		if(min==0)
			return max;
		return gcd(min,max%min);
		
		
	}

}
