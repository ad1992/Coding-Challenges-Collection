package ProjectEuler;

/**
 * @author Aakansha Doshi
 * 
 * 
 *
 */
public class ProjectEuler27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[1000001];
		int prime[]=new int[1001];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i;
		}
		arr[0]=arr[1]=-1;
		
		int c=0;
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i]==i)
			{
				c++;
				for(int j=i;j<arr.length;j+=i)
				{
					arr[j]=i;
				}
			}
		}
	
		System.out.println(c);
			
		for(int i=-999;i<=1000;i++)
		{
			
			for(int j=-1;j<prime.length;j++)
			{
				int n=0;
				int exp=n*n+n*i+j;
				if(j==2&&(i&1)==0)
				{
					
				}
			}
		}

	}

}
