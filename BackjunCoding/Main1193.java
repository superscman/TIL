package BackjunCoding;

import java.util.Scanner;

public class Main1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int line = 0;//x번째가 있는 라인의 가장 높은 수
        int sum = 1;
        int limit = 1;
        while(x>=limit) { // x보다 line이 클때 종료
            limit += sum++;
            line++; // line이 분모가 됨.
        }

        int bm = limit -x;
        int bj = line +1 -bm;

        if((bm+bj)%2 ==0) {
            System.out.println(bm+"/"+bj);
        }else {
             System.out.println(bj+"/"+bm);
        }


    }
}
