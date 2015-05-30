package ProjectEuler;

/**
 * @author Aakansha Doshi
 *
 */
public class EightDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		for(long i=1000001l;i<=1000000000000l;i++)
		{
			int sqrt=(int) Math.sqrt(i);
			int j=2;int sum=2;
			while(j<=sqrt)
			{
				if(i%j==0)
				{
					sum+=2;
					if(sum>8)
						break;
				
				}
				j++;
			
			}
		
			if(sqrt*sqrt==i) 
				sum--;
			if(sum==8)
				c++;
			//System.out.println(c);	
				
	}
		System.out.println(c);	

}
}