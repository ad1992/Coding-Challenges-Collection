package ProjectEuler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Aakansha Doshi
 *
 */
public class NameScores {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//FileReader f = new FileReader("/home/aakansha/Documents/student paper/names.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		String s;
		String arr[]=new String[5001];String s1="";
		s1=br.readLine();
		arr=s1.split(",");
		Arrays.sort(arr);
		long ans=0l;
		for(int i=0;i<5001;i++)
		{
			int sum=0;
			for(int j=1;j<arr[i].length()-1;j++)
			{
				long ch=arr[i].charAt(j)-64;
				//System.out.println(ch+" "+(char)(ch+64));
				sum+=ch;
				
			}
			sum*=(i+1);
			ans+=(long)sum;
			System.out.println(arr[i]+" "+sum);
		
		}
		System.out.println(ans);
		br.close();
	}

}
