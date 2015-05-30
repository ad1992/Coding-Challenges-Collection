package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author Aakansha Doshi
 *
 */
public class Diet {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
				boolean flag=false;				
				String diet=br.readLine();
				String bf=br.readLine();
				String lunch=br.readLine();
				int arr[]=new int[91];
				if(!diet.isEmpty())
				{
					for(int i=0;i<diet.length();i++)
					{
						arr[diet.charAt(i)]++;
					}
				}
				if(!bf.isEmpty())
				{
					for(int i=0;i<bf.length();i++)
					{
						if(arr[bf.charAt(i)]==0)
						{
							flag=true;
							break;
						}
						arr[bf.charAt(i)]--;
					}
				}
				if(!lunch.isEmpty())
				{					
					for(int i=0;i<lunch.length();i++)
					{
						if(arr[lunch.charAt(i)]==0)
						{
							flag=true;
							break;
						}
						arr[lunch.charAt(i)]--;
					}
				}
				String ans="";
				if(flag)
					obr.write("CHEATER\n");
				else
				{
					for(int i=65;i<=90;i++)
					{
						if(arr[i]!=0)
						{	
							
							ans+=(char)i;
						}
					}			
				
				if(ans.isEmpty())
					obr.newLine();
				else
					obr.write(ans+"\n");
				}
			}	
		obr.close();
		

	}

}
