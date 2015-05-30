package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class ErasingAndWinning {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Locale.setDefault(Locale.US);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;StringTokenizer st;
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		obr.flush();
		while(true)
		{
			s=br.readLine();
			s=s.trim();
			if(!s.equals("0 0"))
			{
				//s=s.trim();
				st=new StringTokenizer(s," ");
			
			int N=Integer.parseInt(st.nextToken());
			int D=Integer.parseInt(st.nextToken());
			char arr[]=new char[N];
			if((s=br.readLine())!=null){
				s=s.trim();
				arr=s.toCharArray();
				int count=0;		
				int i=0;int curr=1;
				while(i<curr&&curr<N)
				{
					
					System.out.println("i"+i+" curr"+curr);
					if(arr[i]=='i')
						i++;					
					if(curr==i)
						curr++;
					if(arr[i]<arr[curr])
					{	
						count++;		
						arr[i]='i';
						i=0;						
						
						
					}
					else
					{
						i++;
						if(curr==i)
							curr++;
					
					}
					if(count==D)
						break;
					
				}
				i=N-1;
				
				while(count<D){
					arr[i]='i';							
					i--;
					count++;
				}
				 i=0;
				 while(i<N)
					{
					 if(arr[i]!='i')
					 {
						 obr.write(arr[i]);
					 }
					 i++;
					}
				obr.newLine();
				
			}
				 
			
			
		}
			else
			{
				break;
			}

	}
		obr.close();

	}
}
