package ProjectEuler;

import java.io.IOException;

/**
 * @author Aakansha Doshi
 *
 */
public class ProjectEuler78 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		long arr[]=new long[1000001];
		arr[0]=1l;		
		
		int cur=0,sign=1;
		while(arr[cur]!=0)
		{
			int m=0,p=1;
			cur++;
			while(p<=cur)
			{
				if((m%4)>1)
					sign=-1;
				else
					sign=1;
				arr[cur]=(arr[cur]+(sign*arr[cur-p]))%1000000l;
				m++;
				int k=((m&1)==0)?m/2+1:-(m/2+1);
				p=k*(3*k-1)/2;
				
			}
			
			//System.out.println(arr[cur]);

		}
		System.out.println(cur);
		
	}

}


