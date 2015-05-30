package Codechef;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import Codechef.RobertMovings.Direction;


/**
 * @author Aakansha Doshi
 *
 */
public  class RobertMovings {
	public enum Direction{
		r,b
	}
	public RobertMovings() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;int cases=0;
		while(cases<=5000)
		{
			st=new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
			int turns=Integer.parseInt(st.nextToken());			
			if(N==0&&turns==0)
				break;
			int arr[][]=new int[N][N];
			RobertMovings ob=new RobertMovings();			
			int ans=ob.calculate(arr,turns,0,0,null,null,arr.length);
			System.out.println(ans);
			cases--;
			
		}
	}

	private int calculate(int[][] arr, int turns, int x, int y,Direction d,Parent p,int len) {
		// TODO Auto-generated method stub
		Parent b=Parent.getInstance();		
		if(x==(len-1) && y==(len-1))
		{
			Parent node=new Parent(p,d);			
			b.insert(node);
			if(b.check(node)==turns)
			{
				
				return 1;
			}
			
			return 0;
		}
		if(x==len || y==len){
		
			return 0;
		}
			
		Parent node;
		if(d!=null)
		{
			
			if(p==null)
			{
				//	System.out.println(d.toString()+"null");
				node=new Parent(null,d);
				
	
			}	
		
		//System.out.println(p.d.toString());
			else
			{
				node=new Parent(p,d);
			}
			b.insert(node);
			p=node;
			
				
		}
		
		
		int k=calculate(arr,turns,x,y+1,Direction.b,p,len)+calculate(arr,turns,x+1,y,Direction.r,p,len);
		return k;
	}


	
}
class Parent{
	Parent p;
	Parent Link;
	Direction d;
	 static Parent instance;
	static Parent start=null;
	
	Parent(Parent p1,Direction d1)
	{
		p=p1;
		Link=null;
		d=d1;
	}
	static Parent getInstance()
	{
		if(instance==null)
			instance=new Parent(null,null);
		return instance;
	}
	void insert(Parent node)
	{
		node.Link=start;
		start=node;
	}
		int check(Parent node)
		{
			// TODO Auto-generated method stub
			String s="";
			while(node!=null)
			{
				s=s+node.d.toString();
				node=node.p;
			}
			int i=0;int l=s.length()-1;int c=0;
			while(i<l)
			{
				if(s.charAt(i)!=s.charAt(i+1))
				{
					c++;
				}
				i++;
			}
			return c;
			
		}
		
	
}
