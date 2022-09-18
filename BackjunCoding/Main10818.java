package BackjunCoding;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main10818 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        int max = 0;
        int min = 1000000;

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.stream(arr).min().getAsInt()+" "+Arrays.stream(arr).max().getAsInt());


    }
}
