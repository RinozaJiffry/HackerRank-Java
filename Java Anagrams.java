/*
Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive.
For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description
Complete the isAnagram function in the editor.

isAnagram has the following parameters:
string a: the first string
string b: the second string

Returns
boolean: If a and b are case-insensitive anagrams, return true. Otherwise, return false.

Sample Input 
anagram
margana

Sample Output 
Anagrams

Sample Input 1
anagramm
marganaa

Sample Output 1
Not Anagrams
*/

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toUpperCase();
        b=b.toUpperCase();
        boolean ret = false;
        StringBuilder x= new StringBuilder(b);

        if(a.length()==b.length()){
            for(int i=0; i<a.length();i++){
                for(int j=0; j<x.length();j++){
                    if(a.charAt(i)==x.charAt(j)){
                            x.deleteCharAt(j);
                        if(i==a.length()-1 && x.length()==0){
                            ret=true;
                            break;
                        }
                        break;

                    }

                }
            }
        }return ret;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
