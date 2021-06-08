/*
Function Description
Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:
string s: a string
int k: the length of the substrings to find

Returns
string: the string ' + "\n" + ' where and are the two substrings

Input Format
The first line contains a string denoting .
The second line contains an integer denoting .

Sample Input 
welcometojava
3

Sample Output 
ava
wel
*/

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
         for(int i = 0; i <= s.length() - k; i++){
            String word = s.substring(i, i + k);
            if(word.compareTo(smallest) < 0) {
                smallest = word;
            }      
            if(word.compareTo(largest) > 0) {
                largest = word;
            } 
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
