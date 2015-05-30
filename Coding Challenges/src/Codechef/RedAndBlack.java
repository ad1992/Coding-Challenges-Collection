package Codechef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class RedAndBlack {
static int color=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		obr.flush();
		int Q=Integer.parseInt(br.readLine());
		String s;int x,y;
		StringTokenizer st; 
		
		while(Q-->0)
		{
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				char c=st.nextToken().charAt(1);
				switch(c)
				{
				case 'i':
				color=color^1;
				break;
				case 'b':
					 x=Integer.parseInt(st.nextToken());
					 y=Integer.parseInt(st.nextToken());
					 long blacknodes=getnodes(x,y,0);
					 obr.write(String.valueOf(blacknodes)+"\n");
					// System.out.println(blacknodes);
					break;
				case 'r':
					x=Integer.parseInt(st.nextToken());
					y=Integer.parseInt(st.nextToken());
					long rednodes=getnodes(x,y,1);
					obr.write(String.valueOf(rednodes)+"\n");
					// System.out.println(rednodes);
				}
				

				}
			}
		obr.close();
		}
	private static long getnodes(int x, int y, int c) {
		// TODO Auto-generated method stub
		int depthx=0,depthy=0,nodes=0;
		int X=x;int Y=y;
		while((X>>=1)>0)
		{
			depthx++;
		}
		while((Y>>=1)>0)
		{
			depthy++;
		}
		//depthx=(int)Math.floor(Math.log(X)/Math.log(2));
		//depthy=(int)Math.floor(Math.log(Y)/Math.log(2));
		int colorx=((depthx&1)==0)?color:color^1;
		int colory=((depthy&1)==0)?color:color^1;
		if(colorx==c)
			nodes++;
		if(colory==c)
			nodes++;
		//System.out.println("nodes"+nodes);
		X=x;
		Y=y;
		if(depthx>depthy)
		{
			while(depthx>depthy)
			{
				depthx--;
				X>>=1;
				colorx=colorx^1;
				if(colorx==c)
				{
					nodes++;
				}
			}		
		}
		else if(depthy>depthx)
		{
			while(depthy>depthx)
			{
				depthy--;
				Y>>=1;
				colory=colory^1;
				if(colory==c )
				{
					nodes++;
				}
			}		
		}
		//System.out.println("X "+X+" Y "+Y+" nodes "+nodes);
			while(X!=Y)
			{
				X>>=1;
				Y>>=1;
				colorx=colorx^1;
				if(colorx==c)
				{
					nodes+=2;
				}
			}
			if(colorx==c)
			{
			nodes--;
			}
		return nodes;
	}
	}


