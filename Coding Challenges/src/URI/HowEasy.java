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
public class HowEasy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		String s;
		while(true)
		{
			
			int sum=0,words=0;
			if((s=br.readLine())!=null)
			{
				s=s+" ";				
				String sent[]=s.split(" ");	
				for(int i=0;i<sent.length;i++)
				{
					boolean flag=false;
					int len=sent[i].length();
					if(len>0 && sent[i].charAt(len-1)=='.')
					{
					
						sent[i]=sent[i].substring(0,sent[i].length()-1);
					}
					for(int j=0;j<sent[i].length();j++)
					{
						char ch=sent[i].charAt(j);
						if((ch=='.')||(ch>='0' && ch<='9'))
						{
							flag=true;
						}												
						
					}
					if(!flag){
						sum+=sent[i].length();
						//System.out.println(sum);
						words++;
						//System.out.println(sent[i]);
						
					}
					
					
				}	
				
				if(words>0)
					sum=sum/words;
				if(sum<=3)
					obr.write("250\n");
				else if(sum<=5)
					obr.write("500\n");
				else
					obr.write("1000\n");
			}
			else
				break;
		}
		obr.close();
	}

}
