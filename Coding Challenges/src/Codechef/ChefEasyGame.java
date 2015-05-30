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
public class ChefEasyGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		StringTokenizer st;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			obr.flush();
			int T=Integer.parseInt(br.readLine());
			while(T-->0)
			{
				int N=Integer.parseInt(br.readLine());
				if((s=br.readLine())!=null)
				{
					st=new StringTokenizer(s);
					int arr[]=new int[N];
					for(int i=0;i<N;i++)
					{
						arr[i]=Integer.parseInt(st.nextToken());
					}
					Arrays.sort(arr);long count=0;
					int i=N-1;
					while(i>=0)
					{
						count+=arr[i];
						i-=2;
					}
					obr.write(count+"\n");
						
				}
			}
			obr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
