import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int countZero=0;
        int countpositive=0;
        int countneg=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<0){
                countneg++;
            }else if(arr.get(i)>0){
                countpositive++;
            }else{
                countZero++;
            }
        }
        double p=arr.size();
        System.out.printf("%.6f\n",countpositive / p);
        System.out.printf("%.6f\n",countneg / p);
        System.out.printf("%.6f\n",countZero / p);


    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
