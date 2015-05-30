package Codechef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class MikeTasks {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));		
		StringTokenizer st;
		String s;
		s=br.readLine();
		st=new StringTokenizer(s);
		int N=Integer.parseInt(st.nextToken());
		long arr[]=new long[N];
		long K=Long.parseLong(st.nextToken());
		s=br.readLine();
		st=new StringTokenizer(s);
		for(int i=0;i<N;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		//System.out.println(Math.ceil((double)1/2));
		long c=0;
		int i=0;
		int halftasks=0,correcttasks=0;
		long a=arr[i]/2+(arr[i]&1);
		while(c+a<=K)
		{
			c+=a;
			arr[i]-=a;			
			//System.out.println(c);
			halftasks++;
			i++;
			if(i==N)
				break;
			a=arr[i]/2+(arr[i]&1);
		}
		i=0;
		while(i<N && c+arr[i]<=K)
		{
			
			c+=arr[i];
			correcttasks++;
			i++;
			
		}
		int wrongtasks=N-halftasks;
		obr.write(wrongtasks+" "+correcttasks+"\n");
		obr.close();
	}
	

}
