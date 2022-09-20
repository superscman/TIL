package BackjunCoding;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       int a = in.nextInt();

       int b = in.nextInt();

       int s1 = (a/100)+((a/10)*10)+((a%10)*100);

       int s2 = (b/100)+((b/10)*10)+((b%10)*100);

       if(s1 < s2) System.out.println(s2);
       if(s2 < s1) System.out.println(s1);

    }

}