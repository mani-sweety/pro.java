import java.io.*;
import java.util.*;
import java .lang.*;


class Pangram {

   public static final int n = 26; 

    public int check(String arr) {
        if (arr.length() < n) {
           return -1;
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            if ((arr.indexOf(c) < 0) && (arr.indexOf((char)(c + 32)) < 0)) {
               return -1;
            }
        }
        return 1;
    }  


public static void main(String[] args) {
    Scanner s1 = new Scanner(System.in);
    String s = s1.nextLine();
    Solution obj = new Solution();

    int d = obj.check(s);

    if (d == -1) {
        System.out.print("no");
    } else {
        System.out.print("yes");
    }
}
}
