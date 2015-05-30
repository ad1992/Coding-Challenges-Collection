package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class FiboSum {
	FiboSum() throws NumberFormatException, IOException
	{
	}
static int sum=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
				int T=Integer.parseInt(br.readLine());
				while(T-->0)
				{
					int num=Integer.parseInt(br.readLine());
					sum=0;
					int c=fibo(num);
					
					System.out.println(c);
				}
			}

			private static int fibo(int num) {
				// TODO Auto-generated method stub
			
				if(num==1||num==0)
				{
					
					return num;
				}
				
				  return fibo(num-1)+fibo(num-2)+1;	
		
				 
				 
				
				
				
			}
	}


