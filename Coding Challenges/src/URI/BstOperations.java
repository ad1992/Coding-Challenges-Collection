package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class BstOperations {

	static String pre="";
	static String in="";
	static String post="";
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      String s;
	    Node root=null;
	      while(true)
	      {
	    	  if((s=br.readLine())!=null&&s.length()>0)
	            {
	              if(s.indexOf(' ')==1)
	              {
	            	  int ch=Integer.parseInt(s.substring(2));
	            	  if(s.charAt(0)=='I')
	            	  {
	            		 
	            		  root=insert(root,ch);
	            	  }
	            	  else if(s.charAt(0)=='R')
	            	  {
	            		  root=delete(root,ch);
	            	  }
	            	  else
	            	  {
	            	
	            		  if(search(root,ch))
	            		  {
	            			  System.out.println(ch+" existe");
	            		  }
	            		  else
	            			  System.out.println(ch+" nao existe"); 
	            	  }
	              }
	              else if(s.equals("PREFIXA"))
	              {
	            	  pre="";
		              Preorder(root);
		              System.out.println(pre=pre.trim());
	              }
	              else if(s.equals("INFIXA")) 
	              {
	            	  in="";
		              Inorder(root);
		              System.out.println(in=in.trim());
	              }
	              else if(s.equals("POSFIXA")) 
	              {
	            	 post="";
	            	 Postorder(root);
	            	 System.out.println(post=post.trim());
	              }
	            }
	    	  else 
	    		  break;
	      }
	      
	        
	}

	private static Node delete(Node root, int ch) {
		// TODO Auto-generated method stub
		if(root==null)
			return null;
		else if(ch>root.data)
		{
			root.rlink=delete(root.rlink, ch);
		}
		else if(ch<root.data){
			root.llink=delete(root.llink,ch);
		}
		else
		{
			if(root.llink==null)
			{
				root=root.rlink;
				return root;
			}
			else if(root.rlink==null)
			{
				root=root.llink;
				return root;
			}
			else
			{
				Node t=root;
				Node pred=findMax(root.llink);
				root.data=pred.data;
				root.rlink=t.rlink;
				root.llink=delete(root.llink, pred.data);
				
			
				
				
			}
		}
		return root;
	}

	private static Node findMax(Node r) {
		// TODO Auto-generated method stub
		if(r.rlink==null)
			return r;
		return findMax(r.rlink);
		
	}

	private static void Postorder(Node root) {
		// TODO Auto-generated method stub
		
		if(root==null){
			
			return ;
		}
				
			Postorder(root.llink);
			Postorder(root.rlink);
			post+=root.data+" ";
	
		
	}

	private static void Inorder(Node root) {
		// TODO Auto-generated method stub
		 if(root==null)
	            return;
	        Inorder(root.llink);
	        in+=root.data+" ";
	        Inorder(root.rlink);
	}

	private static void Preorder(Node root) {
		// TODO Auto-generated method stub
		  if(root==null)
	            return  ;
	        pre+=root.data+" ";
	        Preorder(root.llink);
	         
	        Preorder(root.rlink);
	}

	private static boolean search(Node root, int ch) {
		// TODO Auto-generated method stub
		if(root==null)
			return false;
		if(root.data==ch)
			return true;
		else if(ch<root.data)
			return search(root.llink,ch);
		else if(ch>root.data)
			return search(root.rlink,ch);
		return false;
		
	}

	private static Node insert(Node root, int ch) {
		// TODO Auto-generated method stub
		 if(root==null)
	    	  return new Node(ch);
		  if(ch<root.data)
	         root.llink=  insert(root.llink,ch);
	         
	        else
	         root.rlink=  insert(root.rlink,ch);
	         return root;
		
	}

}
class Node
{
	int data;
	Node llink;
	Node rlink;
	Node(int n)
	{
		data=n;
		llink=null;
		rlink=null;
	}
}