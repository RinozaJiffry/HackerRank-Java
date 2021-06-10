/*
In this problem you will be provided strings containing any combination of ASCII characters. You have to write a regular expression to find the valid IPs.

Just write the MyRegex class which contains a String pattern. The string should contain the correct regular expression.

(MyRegex class MUST NOT be public)

Sample Input
000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP

Sample Output
true
true
true
false
false
false
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex {
    String number = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = number + "." +  number + "." +  number + "." + number;
}
