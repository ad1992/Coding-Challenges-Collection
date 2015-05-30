package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class Profit {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while(true)
		{
			if((s=br.readLine())!=null)
			{
				int N=Integer.parseInt(s);
				int pc=Integer.parseInt(br.readLine());
				int arr[]=new int[N];
				for(int i=0;i<N;i++)
				{
					arr[i]=Integer.parseInt(br.readLine());
				}
				int profit[][]=new int[N][N];
				profit[0][0]=arr[0];int pro=arr[0]-pc;
				for(int i=1;i<N;i++)
				{
					profit[i][i]=arr[i];
					if(profit[i][i]-pc>pro)
						pro=profit[i][i]-pc;
					profit[0][i]=profit[0][i-1]+arr[i];
					if(profit[0][i]-(pc*(i+1))>pro)
						pro=profit[0][i]-(pc*(i+1));
				}
				for(int len=2;len<=N;len++)
				{
					int cosl=pc*len;
					for(int i=1,j=i+len-1;j<N;i++,j++)
					{
						profit[i][j]=profit[0][j]-profit[0][i-1];
						//System.out.print(profit[i][j]+" ");
						int newpro=profit[i][j]-cosl;
						if(pro<newpro)
							pro=newpro;
						
					}
				}
				/*for(int i=0;i<N;i++)
				{
					for(int j=0;j<N;j++)
					{
						System.out.print(profit[i][j]+"     ");
					}
					System.out.println();
				}*/
				pro=(pro<0)?0:pro;
				
				System.out.println(pro);
				
			}
			else
				break;
		}
		
	}

}
