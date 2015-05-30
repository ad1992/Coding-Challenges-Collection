package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class LevelOrderTreeTraversal {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		String s;
		StringTokenizer st;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		int caser=1;
		while(T-->0)
		{
			int   n=Integer.parseInt(br.readLine());
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				Node root=null;
				for(int i=0;i<n;i++)
				{
					int  num=Integer.parseInt(st.nextToken());
					root=insertBST(num,root);
				}
				String ans=BFS(root,n);
				System.out.println("Case "+caser+":");				
				System.out.println(ans=ans.trim());
				System.out.println();
				caser++;
			}
			
		}
	}
	private static String  BFS(Node root,int V) {
		// TODO Auto-generated method stub
		
		Queue<Node> list=new LinkedList<>();
		
		list.add(root);
		String ans=" ";
		
		while(!list.isEmpty())
		{
			Node start=list.poll();
			ans+=" "+start.data;
			if(start.llink!=null)
			{
				list.add(start.llink);
			}
			if(start.rlink!=null)
			{
				list.add(start.rlink);
			}
		}
		return ans;
		
	}
	private static  Node insertBST(int num, Node root) {
		// TODO Auto-generated method stub
		if(root==null)
		{
			return new Node(num);
		}
		if(num<root.data)
		{
			root.llink= insertBST(num,root.llink);
		}
		if(num>root.data)
		{
			root.rlink=insertBST(num, root.rlink);
		}
		return root;
	}
	private static class Node
		{
			Node llink;
			Node rlink;
			int data;
			Node(int data)
			{
				this.data=data;
				llink=rlink=null;
			}
		}	
	}
