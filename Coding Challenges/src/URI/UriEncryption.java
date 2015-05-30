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
public class UriEncryption {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		obr.flush();	String s;
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			s=br.readLine();String news="";String finals="";
			for(int i=s.length()-1;i>=0;i--)
			{
				news+=s.charAt(i);
			}
			int mid=s.length()/2;
			for(int i=0;i<mid;i++)
			{
				char ch=news.charAt(i);
				if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z') )
					ch+=3;
				finals+=ch;
			}
			for(int i=mid;i<s.length();i++)
			{
				char ch=news.charAt(i);
				if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z') )
					ch+=2;
				else
					ch-=1;
				finals+=ch;
			}
			obr.write(finals);
			obr.newLine();
		}
		obr.close();
	}

}
