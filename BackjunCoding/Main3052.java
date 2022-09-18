package BackjunCoding;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main3052 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        int count = 0;

        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt()%42;
        }

        System.out.println(Arrays.stream(arr).distinct().count());


    }
}
