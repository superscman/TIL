package BackjunCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1712 {
    public static void main(String[] args) throws IOException {
        //고정 비용 A만원, 한대 노트북 생산당 가변비용 B만원, 노트북 가격은 C만원
        //총 수입(판매비용) > 총비용(고정비용+가변비용) 언젠간 많아짐.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Integer.parseInt(st.nextToken()); //고정비용
        long b = Integer.parseInt(st.nextToken()); // 가변 비용
        long c = Integer.parseInt(st.nextToken()); // 노트북 가격

        long count = 0; // 판매 대수
        long ce = c; // 판매된 총 매출
        long be = b; // 판매 될때 사용한 총 가변비용
        if(b>=c) System.out.println(-1); // 가변비용이 매출보다 크면 -1
        else if(a + b >= c) {
            while (a + be >= ce) {
                ++count;
                ce = c * count;
                be = b * count;
            }
            System.out.println(count);
        }else if(a + b < c && c >0) {
            System.out.println(1);
        }else System.out.println(-1);
    }
}