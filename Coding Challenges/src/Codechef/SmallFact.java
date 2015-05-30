package Codechef;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class SmallFact {
	public SmallFact() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;int N;int arr[]=new int[200];int fin[]=new int[200],fin2[]=new int[200];
		//st=new StringTokenizer(br.readLine());
		int T=Integer.parseInt(br.readLine());
		int c=0,f=1;
		
		while(T-->0)
		{
			N=Integer.parseInt(br.readLine());
			int i=1;f=1;
			level:{
			while(i<=N && i<13)
			{	
				f*=i;
				if(i==N)
				{
					System.out.println(f);
					break level;
				}
				i++;
			}	
			int copy=i;c=0;
			for(int i1=0;f>0;i1++)
			{
				arr[i1]=f%10;
				c++;
				f=f/10;
			}
			
			while(copy<100 && copy<=N)
			{							
				int carry=0,ans=0,start=0;int a=copy;				
						i=a%10;;carry=0;
						for(int i1=0;i1<c;i1++)
						{
							ans=arr[i1]*i+carry;
							
							fin[start]=ans%10;
							
							start++;
							carry=ans/10;
						}
						if(carry!=0)
							fin[start]=carry;
						
						
						a=a/10;
						i=a%10;start=0;carry=0;fin2[0]=0;
						
						for(int i1=0;i1<c;i1++)
						{
							ans=arr[i1]*i+carry;
							fin2[++start]=ans%10;
							carry=ans/10;
						}
						if(carry!=0)
							fin2[++start]=carry;
					
						c=start+1;
						carry=start=ans=0;
						for(int i1=0;i1<c;i1++)
						{
							ans=fin[i1]+fin2[i1]+carry;
							arr[start++]=ans%10;
							carry=ans/10;
						}
						if(carry!=0)
						{
							arr[start]=carry;							
							c=start+1;
						}
					copy++;
					i=copy;
					
				}
			if(N==100)
			{
				for(int i1=c+1;i1>=2;i1--)
				{
					arr[i1]=arr[i1-2];
				}
				arr[1]=arr[0]=0;
				c+=2;
			}
			display(arr,c);			
			System.out.flush();
			Arrays.fill(arr, 0);
			}
		}
		
	}

	private static void display(int arr[],int c) {
		// TODO Auto-generated method stub
		for(int i=c-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}

