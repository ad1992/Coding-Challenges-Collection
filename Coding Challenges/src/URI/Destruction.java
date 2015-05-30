package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Destruction {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;StringTokenizer st;		
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine());
			int i=0;
			int power[]=new int[N];
			int weight[]=new int[N];
			while(i<N)
			{
				if((s=br.readLine())!=null)
				{
					st=new StringTokenizer(s);
					power[i]=Integer.parseInt(st.nextToken());
					weight[i]=Integer.parseInt(st.nextToken());
					i++;
				}
			}
			int maxcap=Integer.parseInt(br.readLine());
			int pow=Integer.parseInt(br.readLine());
			int misile[][]=new int[N+1][maxcap+1];
			for(i=0;i<=N;i++)
			{
				for(int j=0;j<=maxcap;j++)
				{
					if(i==0||j==0)
						misile[i][j]=0;
					else
					{
						if(weight[i-1]<=j)
						{
							misile[i][j]=Math.max(power[i-1]+misile[i-1][j-weight[i-1]],misile[i-1][j]);
						}
						else
							misile[i][j]=misile[i-1][j];
					}
				}
			}
			if(misile[N][maxcap]>=pow)
			{
				System.out.println("Missao completada com sucesso");
			}
			else
				System.out.println("Falha na missao");
		}

	}

}
