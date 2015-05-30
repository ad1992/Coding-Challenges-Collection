package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class probability {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
		
		
		while(T-->0)
		{
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				int n=Integer.parseInt(st.nextToken());
				double p=Double.parseDouble(st.nextToken());
				int player=Integer.parseInt(st.nextToken());
				double deno=1- Math.pow(1-p,n);
				//System.out.println(deno);
				double first= Math.pow(1-p,player-1);
				//System.out.println(first);
				double finalpro=p*first/deno;
				if(p==0)
					finalpro=0;
				System.out.printf("%.4f\n",finalpro);
			}
		
				
		}

	}

}
