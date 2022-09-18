package BackjunCoding;

import java.io.IOException;
import java.util.Scanner;

public class Main2562 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        int max = 0;
        int count = 0;

        for(int i=0; i<9; i++) {
            arr[i] = sc.nextInt();
            if(max <= arr[i]) {
                max = arr[i];
                count = i+1;
            }
        }
        System.out.println(max);
        System.out.println(count);


    }
}
