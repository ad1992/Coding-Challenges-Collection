package URI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class BST {
	static String pre="";
	static String in="";
	static String post="";
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        String s;
	        StringTokenizer st;
	        int T=Integer.parseInt(br.readLine());
	        int Case=0;
	        while(T-->0)
	        {
	            Case++;
	            int n=Integer.parseInt(br.readLine());           
	            if((s=br.readLine())!=null)
	            {
	                st=new StringTokenizer(s);
	                Treee root=null;
	                for(int i=0;i<n;i++)
	                {
	                    int num=Integer.parseInt(st.nextToken());
	                    root=createBst(root,num);
	                }	               
	                
	                System.out.print("Case "+Case+":\n");
	                System.out.print("Pre.: ");
	                pre="";
	                prerder(root);
	                System.out.print(pre=pre.trim()+"\n");
	               System.out.print("In..: ");
	                in="";
	                inorder(root);
	                System.out.print(in=in.trim()+"\n");
	                System.out.print("Post: ");
	                post="";
	                postorder(root);   
	                System.out.print(post=post.trim()+"\n");
	                System.out.print("\n");
	                 
	                 
	            }
	        }
	 
	    }
	 
	    private static Treee createBst(Treee root, int n) {
	        // TODO Auto-generated method stub
	         
	      if(root==null)
	    	  return new Treee(n);
	        if(n<root.data)
	         root.llink=  createBst(root.llink,n);
	         
	        else
	         root.rlink=   createBst(root.rlink,n);
	         return root;
	    }
	 
	   
	     
	    private static void inorder(Treee root) {
	        // TODO Auto-generated method stub
	        if(root==null)
	            return;
	        inorder(root.llink);
	        in+=" "+root.data;
	        inorder(root.rlink);
	         
	         
	    }
	    private static  void prerder(Treee root) {
	        // TODO Auto-generated method stub
	        if(root==null)
	            return  ;
	        pre+=" "+root.data;
	        prerder(root.llink);
	         
	        prerder(root.rlink);
	         
	         
	    }
	    private static void postorder(Treee root) {
	        // TODO Auto-generated method stub
	        if(root==null)
	            return ;
	        postorder(root.llink);
	         
	        postorder(root.rlink);
	        post=post+" "+root.data;
	         
	    }
	 
	}
	class Treee
	{
	    int data;
	    Treee llink;
	    Treee rlink;
	    Treee(int d)
	    {
	        data=d;
	        llink=rlink=null;
	         
	         
	    }
	}