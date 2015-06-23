package HackerRank.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         Calvin is driving his favorite vehicle on the 101 freeway. He notices
 *         that the check engine light of his vehicle is on, and he wants to
 *         service it immediately to avoid any risks. Luckily, a service lane
 *         runs parallel to the highway. The length of the service lane is N
 *         units. The service lane consists of N segments of equal length and
 *         different width.
 * 
 *         Calvin can enter to and exit from any segment. Let's call the entry
 *         segment as index i and the exit segment as index j. Assume that the
 *         exit segment lies after the entry segment (i≤j) and 0≤i. Calvin has
 *         to pass through all segments from index i to index j (both
 *         inclusive).
 * 
 *         Calvin has three types of vehicles - bike, car, and truck -
 *         represented by 1, 2 and 3, respectively. These numbers also denote
 *         the width of the vehicle.
 * 
 *         You are given an array width of length N, where width[k] represents
 *         the width of the kth segment of the service lane. It is guaranteed
 *         that while servicing he can pass through at most 1000 segments,
 *         including the entry and exit segments.
 * 
 *         If width[k]=1, only the bike can pass through the kth segment. If
 *         width[k]=2, the bike and the car can pass through the kth segment. If
 *         width[k]=3, all three vehicles can pass through the kth segment.
 * 
 *         Given the entry and exit point of Calvin's vehicle in the service
 *         lane, output the type of the largest vehicle which can pass through
 *         the service lane (including the entry and exit segments).
 * 
 *         Input Format
 * 
 *         The first line of input contains two integers, N and T, where N
 *         denotes the length of the freeway and T the number of test cases. The
 *         next line has N space-separated integers which represent the width
 *         array.
 * 
 *         T test cases follow. Each test case contains two integers, i and j,
 *         where i is the index of the segment through which Calvin enters the
 *         service lane and j is the index of the lane segment through which he
 *         exits.
 * 
 *         Constraints 2≤N≤100000 1≤T≤1000 0≤i<j<N 2≤j−i+1≤min(N,1000)
 *         1≤width[k]≤3,where 0≤k<N
 * 
 *         Output Format
 * 
 *         For each test case, print the number that represents the largest
 *         vehicle type that can pass through the service lane.
 * 
 *         Note: Calvin has to pass through all segments from index i to index j
 *         (both inclusive).
 * 
 */
public class Service_Lane {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s;		
		StringTokenizer st;
		s=br.readLine();
		st=new StringTokenizer(s);	
		int N=Integer.parseInt(st.nextToken());
		int T=Integer.parseInt(st.nextToken());		
		int arr[]=new int[N];
		s=br.readLine();
		st=new StringTokenizer(s);	
		for(int i=0;i<N;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
		}
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);	
				int i=Integer.parseInt(st.nextToken());
				int j=Integer.parseInt(st.nextToken());
				int max=arr[i];
				int min=arr[i];
				for(int k=i+1;i<=j;i++)
				{
					max=arr[i];
					min=Math.min(min, max);
				}
				out.println(min);
				T--;
			}
		}
		out.close();

	}

}
