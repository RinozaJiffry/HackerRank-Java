/*
Sample Input

Hello world
I am a file
Read me until end-of-file.
Sample Output

1 Hello world
2 I am a file
3 Read me until end-of-file.
*/


//Code
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        int num = 0;
        while (scanner.hasNextLine()) {
            System.out.println(++num + " " + scanner.nextLine());
        }
    }
}
