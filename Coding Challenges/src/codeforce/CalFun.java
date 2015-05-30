package codeforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author Aakansha Doshi
 *
 */
public class CalFun {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		obr.flush();
		
		long N=Long.parseLong(br.readLine());
		long s=0;
		if((N&1)==0)
		{
			s=N/2;
		}
		else
			s=N/2-N;
		obr.write(String.valueOf(s)+"\n");
		obr.close();
	}

}
