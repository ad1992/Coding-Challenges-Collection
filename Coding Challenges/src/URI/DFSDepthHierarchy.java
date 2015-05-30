package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class DFSDepthHierarchy {
	static State state[];
	static  LinkedList<Integer> adj[];
enum State{
	unvisited,visiting,processed;
}
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        StringTokenizer st;
        int T=Integer.parseInt(br.readLine());
        int Case=0;
        while(T-->0)
        {
           
           Case++;
         
            if((s=br.readLine())!=null)
            {
                st=new StringTokenizer(s);
                int V=Integer.parseInt(st.nextToken());
                int E=Integer.parseInt(st.nextToken());
               adj=new LinkedList[V];int i=0;
               state=new State[V];
                while(i<E)
                {
                	 if((s=br.readLine())!=null)
                     {
                		st=new StringTokenizer(s);
                		int v1=Integer.parseInt(st.nextToken());
                		int v2=Integer.parseInt(st.nextToken());
                		state[v1]=state[v2]=State.unvisited;
                		if(adj[v1]==null)
                		{
                			adj[v1]=new LinkedList<Integer>();
                		}
                		Iterator<Integer> itr=adj[v1].iterator();int index=0;
                		while(itr.hasNext())
                		{
                			int c=itr.next();
                			if(c>v2)
                			{
                				break;
                			}
                			index++;
                		}
                		adj[v1].add(index,v2);
                		i++;
                     }
                }
            /* for( i=0;i<V;i++)
            	 System.out.println(i+" "+adj[i]);*/
             

               /* for(i=0;i<V;i++)
                {
                	System.out.println(i+ " "+ state[i]);
                }*/
               String blank="  "; int flag=0;
                System.out.println("Caso "+Case+":");
                for(i=0;i<V;i++)
                {
                	if(state[i]==State.unvisited)
                	{
                		
                		flag++;
                		if(flag>1){
                		System.out.println();
                		}
                		Dfs_visit(i,blank);
                		
                	}
                }
                System.out.println();
            }
        }

	}
	private static void Dfs_visit(int i,String blank) {
		// TODO Auto-generated method stub
		state[i]=State.visiting;
		//System.out.println(i+" "+adj[i]);
				
		while(adj[i]!=null&&adj[i].peekFirst()!=null)
		{
			//System.out.println(i+" "+adj[i]);
			int t=adj[i].removeFirst();
			
			if(state[t]==State.unvisited)
			{
				System.out.println(blank+i+"-"+t+" pathR(G,"+t+")");				
				Dfs_visit(t,blank+"  ");
			}
			else
			{
				System.out.println(blank+i+"-"+t);
			}
			state[t]=State.processed;
		}
		
	}


}
	