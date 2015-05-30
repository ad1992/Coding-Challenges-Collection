package URI;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class TreefromPreandIn {
static int preindex=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringTokenizer st;
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			
			
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				int n=Integer.parseInt(st.nextToken());
				char pre[]=new char[n];
				char in[]=new char[n];
				String preorder=st.nextToken();
				String inorder=st.nextToken();
				for(int i=0;i<n;i++)
				{
					pre[i]=preorder.charAt(i);
					in[i]=inorder.charAt(i);
				}
				preindex=0;
				Tree root=buildTree(in,pre,0,n-1);
				inorder(root);
				System.out.println();
			}
		}
	}


private static void inorder(Tree root) {
	// TODO Auto-generated method stub
	if(root==null)
		return;
	inorder(root.llink);
	
	inorder(root.rlink);
	System.out.print(root.data);
	
}

private static Tree buildTree(char[] in, char[] pre, int start, int end) {
	// TODO Auto-generated method stub
	
	if(start>end)
		return null;
	
	Tree tnode=create(pre[preindex++]);
	int inindex=search(in,start,end,tnode.data);
	//System.out.println("inindex"+inindex+" data "+tnode.data);
	tnode.llink=buildTree(in,pre,start,inindex-1);
	tnode.rlink=buildTree(in, pre, inindex+1, end);
	return  tnode;
	
}

private static Tree create(char c) {
	// TODO Auto-generated method stub
	
	return new Tree(c);
}

private static int search(char[] in, int start, int end, char data) {
	// TODO Auto-generated method stub
	for(int i=start;i<=end;i++)
	{
		if(in[i]==data)
		{
			return i;
		}
	}
	return -1;
	
}

}
/*class Tree
{

char data;
Tree llink=null;
Tree rlink=null;
public Tree(char i) {
	// TODO Auto-generated constructor stub
	data=i;
	llink=rlink=null;
	
}

}*/