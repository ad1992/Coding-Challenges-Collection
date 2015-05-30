package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class DfsConnectedComponents {
	static BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
	static State state[];
	static  LinkedList<Character> adj[];
	static boolean flag;
	static boolean path[];
enum State{
	unvisited,visiting,processed;
}
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		obr.flush();
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
                		
                		char  v1=s.charAt(0);
                		char v2=s.charAt(2);
                		
                		if(adj[v1-97]==null)
                		{
                			adj[v1-97]=new LinkedList<Character>();
                		}    
                		/*Iterator<Character> itr=adj[v1-97].iterator();int index=0;
                		while(itr.hasNext())
                		{
                			int c=itr.next();
                			if(c>v2)
                			{
                				break;
                			}
                			index++;
                		}*/
                		 adj[v1-97].add(v2);
                		 
                		 if(adj[v2-97]==null)
                 		{
                 			adj[v2-97]=new LinkedList<Character>();
                 		}
                		 
                		/* itr=adj[v2-97].iterator();index=0;
                 		while(itr.hasNext())
                 		{
                 			int c=itr.next();
                 			if(c>v1)
                 			{
                 				break;
                 			}
                 			index++;
                 		}*/
                 		 adj[v2-97].add(v1);
                		 i++;
                		 
                	 }
                }
             /*for( i=0;i<V;i++)
            	 System.out.println((char)(i+97)+" "+adj[i]);*/
             

               for(i=0;i<V;i++)
                {
            	   state[i]=State.unvisited;
                }
            
                
              i=0;
              flag=false;int count=0;
             path=new boolean[26];
              obr.write("Case #"+Case+":\n");
                while(i<V)
                {
                	
                	if(state[i]==State.unvisited)
                	{
                		//System.out.print(i+"-->");	
                		if(flag){
                			                			
                			String ans="";
                			for(int i1=0;i1<26;i1++)
                			{
                				if(path[i1])
                				{
                					ans+=(char)(i1+97)+",";
                				}
                			}obr.write(ans);
        					obr.newLine();
        					path=new boolean[26];
        					flag=false;
        				}
                		path[i]=true;	
                		Dfs_visit(i);
                		flag=true;
                		count++;
                		
                	}
                	              	
                		i++;
                
                	
                }
               	if(flag){
            			
            			String ans="";
            			for(int i1=0;i1<26;i1++)
            			{
            				if(path[i1])
            				{
            					
            					ans+=(char)(i1+97)+",";
            				}
            			}
            			obr.write(ans);
    					
    					path=new boolean[26];
    					flag=false;
    				
				}
                obr.newLine();
              obr.write(count+" connected components\n");
              obr.newLine();
            }
        }
        obr.close();

	}
	private static void Dfs_visit(int i) throws IOException {
		// TODO Auto-generated method stub
		state[i]=State.visiting;
	
				
		while(adj[i]!=null&&adj[i].peekFirst()!=null)
		{
			
			char t=adj[i].removeFirst();
			
			if(state[t-97]==State.unvisited)
			{
				
				path[t-97]=true;	
				
				Dfs_visit(t-97);
				
				//System.out.print(i+"-->");
			}
			else
			{
				//System.out.print(t+"-->");	
			}
			state[t-97]=State.processed;
		}
		
	}

}
