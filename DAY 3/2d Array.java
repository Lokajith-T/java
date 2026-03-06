import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        List<Integer> results = new ArrayList<>();
        for(int i = 1; i<=4; i++){
             for(int j = 1; j<=4; j++){
                
                int mid = arr.get(i).get(j);
                
                int t1 = arr.get(i-1).get(j-1);
                int t2 = arr.get(i-1).get(j);
                int t3 = arr.get(i-1).get(j+1);

                int b1 = arr.get(i+1).get(j-1);
                int b2 = arr.get(i+1).get(j);
                int b3 = arr.get(i+1).get(j+1);
                
                int sum = t1+t2+t3+mid+b1+b2+b3;
                
                results.add(sum);
            }
        }
        
       int result = Collections.max(results);
       System.out.println(result);
        
        bufferedReader.close();
    }
}
