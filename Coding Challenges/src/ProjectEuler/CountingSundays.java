package ProjectEuler;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class CountingSundays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int month[]={31,28,31,30,31,30,31,31,30,31,30,31};
		String days[]={"sun","mon","tue","wed","thu","fri","sat"};
		int y=1900;int d=0;int first=1;int sun=0;
		if(checkleap(y)){
			month[1]=29;
			System.out.println("leap"+y);
		}
		while(y<=2000)
		{
			int day=month[d];
			int rem=day%7;
			while(rem>0)
			{
				if(first==6)
					first=0;
				else
					first++;
				rem--;
			}
			//System.out.println(days[first]);
			if(first==0&&y>=1901)
				sun++;
			if(d==11)
			{
				y++;
				if(checkleap(y)){
					month[1]=29;
					
				}
				else{
					month[1]=28;
				}
				d=0;
			}
			else{
			d++;
			}
			
		}
		System.out.print(sun);
		
	}

	private static boolean checkleap(int y) {
		// TODO Auto-generated method stub
		return((y%100!=0&&y%4==0)||y%400==0);
		
		
	}

}
