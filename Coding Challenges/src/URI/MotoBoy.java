package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class MotoBoy {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub]
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;StringTokenizer st;int orders;		
		while((orders=Integer.parseInt(br.readLine()))!=0)
		{
			
				int maxpizza=Integer.parseInt(br.readLine());
				int time[]=new int[orders];
				int quant[]=new int[orders];
				int i=0;
				while(i<orders)
				{
					if((s=br.readLine())!=null)
					{
						st=new StringTokenizer(s," ");
						time[i]=Integer.parseInt(st.nextToken());
						quant[i]=Integer.parseInt(st.nextToken());
						i++;
					}
					
				}
				int timer[][]=new int[orders+1][maxpizza+1];
				
				for(int j=0;j<=orders;j++)
				{
					for(int k=0;k<=maxpizza;k++)
					{
						if(j==0||k==0)
							timer[j][k]=0;
						else
						{
							//System.out.println(j);
							if(quant[j-1]<=k)
							{
								
								timer[j][k]=Math.max(time[j-1]+timer[j-1][k-quant[j-1]], timer[j-1][k]);
							}
							else
							{
								timer[j][k]=timer[j-1][k];
							}
						}
					}
				}
				
				System.out.println(timer[orders][maxpizza]+" min.");
						
			}
			
		}

	}


