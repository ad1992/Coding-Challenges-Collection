package ProjectEuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class ProjectEuler82 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine().trim());
		long maze[][]=new long[N][N];		
		String s;
		StringTokenizer st;
	
		for(int i=0;i<N;i++)
		{
			
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				for(int j=0;j<N;j++)
				{
					maze[i][j]=Long.parseLong(st.nextToken());
				}
			}
		}
	}

}
