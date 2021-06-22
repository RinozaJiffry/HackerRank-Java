/*
Sample Input
10
64630 11735 14216 99233 14470 4978 73429 38120 51135 67060

Sample Output
43900.6
44627.5
4978
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] X = new int[N]; 
        for(int i = 0;i < N;i++) {
            X[i] = sc.nextInt();
        }
        System.out.println(getMean(X));
        System.out.println(getMedian(X));
        System.out.println(getMode(X));
    }
    
    private static double getMean(int[] X) {
        double mean = 0;
        int sum = 0;
        int N = X.length;
        for(int i : X) {
            sum += i;
        }
        mean = (double) sum/N;
        return mean;
    }
    
    private static double getMedian(int[] X) {
        double median = 0;
        int N = X.length;
        int [] copy = X.clone();
        Arrays.sort(copy);
        if(N % 2 == 0)
            median = (double) (copy[N/2 - 1] + copy[N/2]) / 2;
        else {
            median = (double) copy[(N-1)/2];
        }
        return median;
    }
    
    private static int getMode(int[] X) {
        int mode = 0;
        int N = X.length;
        int [] copy = X.clone();
        Arrays.sort(copy);
        int count = 0, max = 0;
        int current = copy[0];
        for(int i = 0;i < N;i++) {
            if (copy[i] == current) {
                count++;
            } else {
                count = 1;
                current = copy[i];
            }
            if (count > max) {
                max = count;
                mode = copy[i];
            }
        }
        return mode;
    }
}
