package BackjunCoding;

import java.util.Scanner;

public class Main11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int sum = 0;
       String str = sc.next();
       for(int i =0; i<str.length(); i++) {
           sum += Character.getNumericValue(str.charAt(i));
       }
        System.out.println(sum);
    }
}
