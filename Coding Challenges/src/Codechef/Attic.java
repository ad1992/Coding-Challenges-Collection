package Codechef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

import javax.net.ssl.SSLContext;

/**
 * @author Aakansha Doshi
 *
 */
public class Attic {

	public Attic() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		String s;	
		StringTokenizer st;		
		obr.flush();	
		int T=Integer.parseInt(br.readLine());
		int max=0,c=0,days=0;
		while(T-->0)
		{
			s=br.readLine();int i=0;
			days=0;max=0;
			while(i<s.length()){
				char ch=s.charAt(i);
				if(ch=='.')
				{
					int nexti=s.indexOf('#',i);
					c=nexti-i;
					//System.out.println("c="+c);
					if(c>max)
					{
						days++;
						max=c;
						c=0;
					}
					i=nexti+1;
					
				}
				else
					i++;
				
			}
			obr.write(days+"\n");
		}
		obr.close();
	}

}
