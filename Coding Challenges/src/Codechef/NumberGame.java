package Codechef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 * @author Aakansha Doshi
 *
 */
public class NumberGame {

	public NumberGame() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		String s;	
		StringTokenizer st;		
		obr.flush();	
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine());			
			int num;String name;
			int dup[]=new int[N];
			int j=0;
			Hashtable<Integer, String> cont=new Hashtable<>();
			for(int i=0;i<N;i++)
			{
				if((s=br.readLine())!=null)
				{
					st=new StringTokenizer(s);
					name=st.nextToken();
					num=Integer.parseInt(st.nextToken());
					if(cont.containsKey(num)){
						
						dup[j++]=num;
						
					}
						
					else
						cont.put(num, name);
				}
			}
			for(int i=0;i<j;i++)
			{
				
				cont.remove(Integer.valueOf(dup[i]));
				
			}
			String winner="Nobody wins.";int min=Integer.MAX_VALUE;
			//System.out.println(cont);
			Enumeration<Integer> keys=cont.keys();
			while(keys.hasMoreElements())
			{
				int key=keys.nextElement();
				if(key<min){
					min=key;
					winner=cont.get(key);
				}
					
			}
					
			
			obr.write(winner+"\n");
			
		}
		obr.close();
	}

}
 	

