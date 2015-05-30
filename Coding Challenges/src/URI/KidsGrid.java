package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
/**
 * @author Aakansha Doshi
 *
 */
public class KidsGrid{ 
	 public static void main(String[] args) throws NumberFormatException, IOException{
	        // TODO Auto-generated method stub
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        String s;
	        StringTokenizer st;
	        int T;        
	        int caser=1;
	        T=Integer.parseInt(br.readLine().trim());
	       // System.out.println(T);
	        try{
	        while(T>0)
	        {
	            String first="",second="";
	            
	            if((s=br.readLine().trim())!=null&&!s.isEmpty())
	            {                
	                st=new StringTokenizer(s);                
	                int H=Integer.parseInt(st.nextToken());
	                int W=Integer.parseInt(st.nextToken());
	               // System.out.println(s+"jhjhj");
	                char arr[][]=new char[H+1][W+1];
	                for(int i=1;i<=H;)
	                {
	                    if((s=br.readLine().trim())!=null&&!s.isEmpty())
	                    {
	                        //System.out.println(s);
	                        for(int j=1;j<=W;j++)
	                        {
	                            arr[i][j]=s.charAt(j-1);
	                        }
	                        i++;
	                    }
	                }                
	                if((s=br.readLine().trim())!=null&&!s.isEmpty())
	                {
	                  
	                    st=new StringTokenizer(s);        
	                    int N=Integer.parseInt(st.nextToken());
	                    int x=Integer.parseInt(st.nextToken());
	                    int y=Integer.parseInt(st.nextToken());
	                    first+=arr[x][y];
	                   // System.out.println(s);;
	                    if((s=br.readLine().trim())!=null&&!s.isEmpty())
	                    {
	                                                          
	                        for(int i=1;i<=N;i++)
	                        {
	                              
	                            switch(s.charAt(i-1))
	                            {
	                            case 'N':
	                            x--;
	                            break;
	                            case 'S':
	                                x++;
	                                break;
	                            case 'W':
	                                y--;
	                                break;
	                            case 'E':
	                                y++;
	                                break;
	                            }
	                            first+=arr[x][y];
	                              
	                        }
	                          
	                    } 
	                     
	                                 
	                        if((s=br.readLine().trim())!=null&&!s.isEmpty())
	                        {
	                            
	                            st=new StringTokenizer(s);        
	                            N=Integer.parseInt(st.nextToken());
	                            x=Integer.parseInt(st.nextToken());
	                            y=Integer.parseInt(st.nextToken());
	                            second+=arr[x][y];
	                           // System.out.println(s);;
	                            if((s=br.readLine().trim())!=null&&!s.isEmpty())
	                            {
	                                 //System.out.println(s);;
	                                for(int i=1;i<=N;i++)
	                                {
	                              
	                                    switch(s.charAt(i-1))
	                                    {
	                                    case 'N':
	                                        x--;
	                                        break;
	                                        case 'S':
	                                            x++;
	                                            break;
	                                        case 'W':
	                                            y--;
	                                            break;
	                                        case 'E':
	                                            y++;
	                                            break;
	                                    }
	                                    second+=arr[x][y];
	                              
	                                }
	                              
	                            }
	                              
	                            }
	                            //System.out.println(first+ " "+second);                                    
	                         char  fir[]=first.toCharArray();
	                           char sec[]=second.toCharArray();
	                            
	                                int lcs[][]=new int[fir.length+1][sec.length+1];
	                                for(int i=0;i<=fir.length;i++)
	                                {
	                                    for(int j=0;j<=sec.length;j++)
	                                    {
	                                        if(i==0||j==0)
	                                            lcs[i][j]=0;
	                                        else if(fir[i-1]==sec[j-1])
	                                            lcs[i][j]=lcs[i-1][j-1]+1;
	                                        else
	                                            lcs[i][j]=Math.max(lcs[i][j-1],lcs[i-1][j]);
	                              
	                                    }
	                      
	                                }
	                           // System.out.println("Common"+ lcs[fir.length][sec.length]);
	                                int a=fir.length-lcs[fir.length][sec.length];
	                                int b=sec.length-lcs[fir.length][sec.length];
	                                System.out.print("Case "+caser+": "+a+" "+b+"\n");
	                                caser++;
	                                T--;
	                            }
	                        }     //System.out.println("T="+T);
	               
	                              
	            
	        }
	     
	        }
	    catch(Exception e)
	    {
	        //System.out.println(e.getStackTrace());
	    }
	          
         
    }
}
         
                                    