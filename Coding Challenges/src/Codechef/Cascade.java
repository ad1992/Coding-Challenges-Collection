package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Cascade {

	public Cascade() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;String s="",s1="";
		
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s," ");
				int N=Integer.parseInt(st.nextToken());
				int M=Integer.parseInt(st.nextToken());
				Cas arr[]=new Cas[N];
				for(int i=0;i<N;i++)
				{
					if((s1=br.readLine())!=null)
					{
						st=new StringTokenizer(s1," ");
					
						int id=Integer.parseInt(st.nextToken());
						int attr=Integer.parseInt(st.nextToken());
						int val=Integer.parseInt(st.nextToken());
						int pri=Integer.parseInt(st.nextToken());
						arr[i]=new Cas(id,attr,val,pri);
					}
				}
				int ids[]=new int[M];
				int attrs[]=new int[M];
				for(int i=0;i<M;i++)
				{
					if((s1=br.readLine())!=null)
					{
						st=new StringTokenizer(s1," ");
						ids[i]=Integer.parseInt(st.nextToken());
						attrs[i]=Integer.parseInt(st.nextToken());
					}
				}
				
				for(int i=0;i<M;i++)
				{
					int curid=ids[i];
					int curatr=attrs[i];
					int max=Integer.MIN_VALUE,pri=Integer.MIN_VALUE;
					for(int k=0;k<N;k++)
					{
						if(arr[k].id==curid && arr[k].attr==curatr)
						{
							if(arr[k].pri>=pri )
							{	max=arr[k].val;
								pri=arr[k].pri;
							}
							
						}
					}
					System.out.println(max);
				}
				
				
			}
		}
	

}
class Cas
{
	int id,val,attr,pri;
	public Cas(int id2, int attr2, int val2, int pri2) {
		// TODO Auto-generated constructor stub
		id=id2;
		attr=attr2;
		val=val2;
		pri=pri2;
	}

	
}
