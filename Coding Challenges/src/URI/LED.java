package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class LED {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int arr[]={6,2,5,5,4,5,6,3,7,6};
		int T=Integer.parseInt(br.readLine());
		String s;
		while(T-->0)
		{
			int sum=0;
			if((s=br.readLine())!=null)
			{
				for(int i=0;i<s.length();i++)
				{
					char ch=s.charAt(i);
					sum+=arr[ch-48];
					
				}
				System.out.println(sum+" leds");
			}
		}
		
	}

}
