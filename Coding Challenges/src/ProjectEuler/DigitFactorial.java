package ProjectEuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class DigitFactorial {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
		arr[0]=1;
		for(int i=1;i<=9;i++)
		{
			arr[i]=arr[i-1]*i;
		}
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int N=Integer.parseInt(br.readLine().trim());long nsum=0l;
		for(int i=10;i<2540160;i++)
		{
			int num=i;int sum=0;
			while(num>0)
			{
				sum+=arr[num%10];
				num/=10;
			}
			if(sum==i)
			{
				nsum+=i;
			}
		}
		System.out.println(nsum);
		
	}

}
