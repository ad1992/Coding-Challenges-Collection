package URI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Treefrominorderpreorder {
static int preindex;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringTokenizer st;
		while(true)
        {
            s=br.readLine();
            if(s!=null&&s.length()>0){		
				st=new StringTokenizer(s);				
				String preorder=st.nextToken();
				String inorder=st.nextToken();
				char in[]=new char[inorder.length()];
				char pre[]=new char[preorder.length()];
				for(int i=0;i<in.length;i++)
				{
					pre[i]=preorder.charAt(i);
					in[i]=inorder.charAt(i);
					
					
				}
				preindex=0;
				Tree root=buildTree(in,pre,0,in.length-1);
				postorder(root);
				System.out.println();
			}
            else 
            	break;
        }
				
		
	}

	private static Tree buildTree(char[] in, char[] pre, int i, int j) {
		// TODO Auto-generated method stub
		if(i>j)
		{
			return null;
		}
		
		Tree root=createRoot(pre[preindex++]);
		/*if(i==j)
			return root;*/
		
		int index=search(i,j,in,root.data);
		
		//System.out.println("start "+i+" end "+j+" preindex "+preindex+" i "+i+" j "+j+" index "+index);
		
		root.llink=buildTree(in,pre,i,index-1);
		root.rlink=buildTree(in,pre,index+1,j);
			
		
		return root;
	}

	private static int search(int i, int j, char[] in, char data) {
		// TODO Auto-generated method stub
		for(int start=i;start<=j;start++)
		{
			if(in[start]==data)
				return start;
		}
		return -1;
	}

	private static Tree createRoot(char c) {
		// TODO Auto-generated method stub
		return new Tree(c);
	}
	private static void postorder(Tree root) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		
		postorder(root.llink);		
		postorder(root.rlink);
		System.out.print(root.data);
		
	}

}
/*class Tree
{
	char data;
	Tree llink;
	Tree rlink;
	Tree(char d)
	{
		data=d;
		llink=null;
		rlink=null;
	}
}*/