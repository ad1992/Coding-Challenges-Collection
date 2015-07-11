package ProjectEuler;

import java.io.IOException;

/**
 * @author Aakansha Doshi
 */
public class ProjectEuler76 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub	
		
		
		int ways[]=new int[101];
		ways[0]=1;
		for(int i=1;i<=99;i++)
		{
			for(int j=i;j<=100;j++)
				ways[j]+=ways[j-i];
		}
		System.out.println(ways[100]);	
			
			
	}
		

	
	
}
