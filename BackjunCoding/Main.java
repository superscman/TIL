package BackjunCoding;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] arr = new String[N];


        for(int i=0; i<N; i++) {
            arr[i] = sc.next();
        }
        sc.close();
        for(int i=0; i<arr.length; i++) {
            int count = 0;
            int result = 0;
            for(int j =0; j<arr[i].length(); j++) {
                if(arr[i].charAt(j) == 'O') {
                    count++;
                }else count = 0;
                result += count;
            }
            System.out.println(result);

        }


        //배열 arr안에는 OX들이 들어있다. 이걸 charAt()으로 하나씩 살펴보면서 O면 카운트업 X면 초기화, 그 숫자들을 더해야함.


    }
}
