package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Cards {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		String s;StringTokenizer st;
		while(t-->0)
		{
			if((s=br.readLine()) != null)
			{
				st=new StringTokenizer(s);
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st.nextToken());
				int min=Math.min(a, b);
				int max=Math.max(a, b);
				int c=findgcd(max,min);
				System.out.println(c);
			}
		}
	}

	private static int findgcd(int a, int b) {
		// TODO Auto-generated method stub
		
		if(b==0)
		{
			return a;
		}
		return findgcd(b,a%b );
	}

}
