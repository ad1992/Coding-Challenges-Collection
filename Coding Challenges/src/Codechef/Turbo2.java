package Codechef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
 
/**
 * @author Aakansha Doshi
 *
 */
public class Turbo2 {
    public static void main(String... args)
    throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(input.readLine());
        int[] unsorted = new int[count];
        for(int i = 0; i < count; i++){
            unsorted[i] = Integer.parseInt(input.readLine());
        }
        output.write(unsorted.length);
        Arrays.sort(unsorted);
        for(int i = 0; i < count; i++){
            output.write("asas");
        }
        output.flush();
    }
} 