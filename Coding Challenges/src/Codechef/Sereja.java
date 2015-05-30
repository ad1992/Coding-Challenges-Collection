package Codechef;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * @author Aakansha Doshi
 *
 */
public class Sereja {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));			
		obr.flush();	
		int T=sc.nextInt();
		while(T-->0)
		{
			int N=sc.nextInt();int count=0;			
				int max=Integer.MIN_VALUE;
				for(int i=0;i<N;i++)
				{
					int num=sc.nextInt();
					if(num>max){
						max=num;
						count=0;
					}
					if(num==max)
						count=(count*2+1)%1000000007;
				}
				//System.out.println(max+" "+count);				
				obr.write(count+"\n");				
			}					
		obr.close();
		sc.close();
	}

}
