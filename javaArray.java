import java.util.Arrays;

public class javaArray {
    public static void main(String[] args) {

        // 오늘 배운 유용한 메소드 Arrays.toString()과 Arrays.copyOfRanger(), System.arraycopy()
        String family[] = {"아빠","엄마","부인","나","장모님","처남"};
        int num[] = {1,2,3,4,5,6};
        int num2[] = {7,8,9,10};

        System.out.println(Arrays.toString(num)); // 지금 나온 배열은 String 입니다.

        //저렇게 안하면 시스템아웃에 주소값만 나오네 ;; ㅋㅋ
        //코드가 무지 길어졌지만 어쨋든 Arrays.copyOfRange(복사할배열, 프럼부터, 투의 앞까지)
        System.out.println(Arrays.toString(Arrays.copyOfRange(family,2,4)));

        System.arraycopy(num2,
                0,
                num,
                0,
                num.length+num2.length);
        System.out.println(Arrays.toString(num));
        // 이거 왜안돼지 ㅋㅋㅋㅋ 당황스럽군...
    }
}
