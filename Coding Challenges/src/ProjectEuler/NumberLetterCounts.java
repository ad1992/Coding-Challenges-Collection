package ProjectEuler;

/**
 * @author Aakansha Doshi
 *
 */
public class NumberLetterCounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String units[]={"","one","two","three","four","five","six","seven","eight","nine","ten"};
		String teens[]={"","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String tens[]={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		
		long len=0l;
		for(int i=1;i<=1000;i++)
		{
			if(i<=10)
			{
				len+=units[i].length();
				System.out.println(units[i]);
			}
			else if(i<=19)
			{
				int ind=i%10;
				len+=teens[ind].length();	
				System.out.println(teens[ind]);
			}
			else if(i<=99)
			{
				
				len+=tens[i/10].length()+units[i%10].length();
				System.out.println(tens[i/10]+units[i%10]);
			}
			else if(i<=999)
			{
				String s=String.valueOf(i);
				String h=units[s.charAt(0)-48]+"hundred";
				if(!s.substring(1).equals("00"))					
				{
					h+="and";
				}
				if((s.charAt(1)-48)==0)
				{
					
					h+=units[s.charAt(2)-48];
				}
				else if((s.charAt(1)-48)==1)
				{
					h+=teens[s.charAt(2)-48];
					if((s.charAt(2)-48)==0)
						h+="ten";
				}
				else
				{
					h+=tens[s.charAt(1)-48]+units[s.charAt(2)-48];
				}
				System.out.println(h);
				len+=h.length();
					
			}
			else
			{
				len+=11;
				System.out.println("onethousand");
			}
		}
		System.out.println(len);
				
		}

	

}
