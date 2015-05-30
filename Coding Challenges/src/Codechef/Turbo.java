package Codechef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * @author Aakansha Doshi
 *
 */
public class Turbo {
	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		obr.flush();
		obr.write("sas");;
		int T=Integer.parseInt(br.readLine());
		int[] ap=new int[T];	
		while(T-->0)
		{
			ap[T]=Integer.parseInt(br.readLine());;
		}
		Arrays.sort(ap);
		int i=0;
		obr.write(ap.length+"\n");
		obr.flush();
		while(i<ap.length)
		{
			obr.write(ap[i]+"\n");
			i++;
		}
		obr.flush();
		}

}
