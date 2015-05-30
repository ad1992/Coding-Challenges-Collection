package hackerEarth;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class JigarAndStrings {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
		
		while(T-->0)
		{
			if((s=br.readLine())!=null)
			{
				int arr[]=new int[26];
				for(int i=0;i<s.length();i++)
				{
					int ch=s.charAt(i)-97;
					arr[ch]++;
				}
				int min=Integer.MAX_VALUE;
				for(int i=1;i<=s.length();i++)
				{
					int totalchange=0;
					for(int j=0;i<26;j++)
					{
						if(arr[j]>0){
						int change=Math.abs(arr[j]-i);
						totalchange+=change;
						
						}
					}
					if(totalchange<min)
						min=totalchange;
				}
				System.out.println(min);
			}
		}

	}

}
