package BackjunCoding;

import java.util.Scanner;

public class Main2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 1;
        int i = 0;
        int result = 0;
        while(result<n-1){
            count ++;
            i += +6;
            result += +i;
        }
        System.out.println(count);
    }
}