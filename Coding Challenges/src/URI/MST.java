package URI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class MST {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
			String s;
			StringTokenizer st;		
			while(!(s=br.readLine().trim()).equals("0 0")&&!s.isEmpty())
			{
					st=new StringTokenizer(s);
					int n=Integer.parseInt(st.nextToken());
					int m=Integer.parseInt(st.nextToken());
					@SuppressWarnings("unchecked")
					LinkedList<G> adj[]=new LinkedList[n];int ans=0;;int totalw=0;
					//System.out.println(s);
					while(m>0)
					{
						if((s=br.readLine().trim())!=null&&!s.isEmpty())
						{
						
							st=new StringTokenizer(s);
							int ver1=Integer.parseInt(st.nextToken());
							int ver2=Integer.parseInt(st.nextToken());
							int w=Integer.parseInt(st.nextToken());
							
							totalw+=w;
							if(adj[ver1]==null)
			        		{
			        			adj[ver1]=new LinkedList<G>();
			        		}  
							if(adj[ver2]==null)
			        		{
			        			adj[ver2]=new LinkedList<G>();
			        		}  
			        		adj[ver1].add(new G(ver2,w));        		
			        		adj[ver2].add(new G(ver1,w));
			        		m--;
						}
					}
			
			
			int key[]=new int[n];
			boolean isTree[]=new boolean[n];
			int parent[]=new int[n];
			for(int i=0;i<n;i++)
			{
				key[i]=Integer.MAX_VALUE;
			}
			key[0]=0;int i=0;
			while(!isTree[i])
			{
				isTree[i]=true;
				LinkedList<G> p=adj[i];int j=0;
				
				while(adj[i]!=null&&j<adj[i].size())
				{
					int next=p.get(j).nextnode;
					int w=p.get(j).weight;
					
					if(w<key[next]&&!isTree[next])
					{
						key[next]=w;
						parent[next]=i;
						
						
					}
					j++;
				}
				
				j=0;int min=Integer.MAX_VALUE;;
				while(j<n)
				{
					if(!isTree[j]&&key[j]<min){
						min=key[j];
						i=j;
					}
					j++;
						
				}
				if(min<Integer.MAX_VALUE)
				ans+=min;
			}
			
			System.out.print(totalw-ans+"\n");

		}
		}
}
	class G
	{
		int nextnode,weight;
		
		G(int n1,int w1)
		{
			nextnode=n1;
			weight=w1;
			
			
		}

	}


