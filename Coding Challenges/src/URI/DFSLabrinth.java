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
public class DFSLabrinth {

	static State state[];
	static  LinkedList<Integer> adj[];
	static int steps;
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
        while(T-->0)
        {
           
           int n=Integer.parseInt(br.readLine());
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
                		 adj[v1].add(v2);
                		 if(adj[v2]==null)
                 		{
                 			adj[v2]=new LinkedList<Integer>();
                 		}       
                		adj[v2].add(v1);
                		 i++;
                		 
                	 }
                }
             /*for( i=0;i<V;i++)
            	 System.out.println(i+" "+adj[i]);*/
             

               int count=0;i=n;
                steps=0;
                while(count<V)
                {
                	
                	if(state[i]==State.unvisited)
                	{
                		//System.out.print(i+"-->");	
                		Dfs_visit(i);
                		
                	}
                	
                	if(i==V-1)
                		i=0;
                	else
                		i++;
                	count++;
                	
                }
               System.out.println(steps);
            }
        }

	}
	private static void Dfs_visit(int i) {
		// TODO Auto-generated method stub
		state[i]=State.visiting;
	
				
		while(adj[i]!=null&&adj[i].peekFirst()!=null)
		{
			
			int t=adj[i].removeFirst();
			
			if(state[t]==State.unvisited)
			{
				//System.out.print(t+"-->");	
				steps++;
				Dfs_visit(t);
				steps++;
				//System.out.print(i+"-->");
			}
			else
			{
				//System.out.print(t+"-->");	
			}
			state[t]=State.processed;
		}
		
	}


}
	
