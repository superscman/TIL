package BackjunCoding;

import java.util.Scanner;

class Test {
    public static long sum(int[] a) {
        long result = 0;
        for(int i =0; i<=a.length-1; i++) {
            result += a[i];

        }
        System.out.println(result);
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Test.sum(arr);
    }
}