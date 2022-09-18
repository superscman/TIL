package BackjunCoding;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main1546 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        double total = 0;

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
            total = total+arr[i];
        }

        int max = Arrays.stream(arr).max().getAsInt();


        double avg = total/max/N*100;


        System.out.println(avg);


    }
}
