
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        System.out.println("-----깜짝 위생 검사-----");
        hashMap.put("조영현", 3);
        hashMap.put("이호세아", 3);
        hashMap.put("주현주", 4);
        hashMap.put("최민혁", 7);
        hashMap.put("김시영", 7);
        hashMap.put("유형찬", 0);

        // SET으로 변환하여 순회
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator1 = entrySet.iterator();

        while (iterator1.hasNext()) {
            Map.Entry entry = iterator1.next();
            System.out.println("이름 : " + entry.getKey() + ", 머리 감는 횟수 : " + entry.getValue());
        }

        // 참여자 명단 뽑기
        Set<String> keySet = hashMap.keySet();
        System.out.println("조사 참여자 : " + keySet);

        // 평균 구하기 -> value 합계 / size
        int total = 0;

        Collection values = hashMap.values();
        Iterator<Integer> iterator2 = values.iterator();

        while (iterator2.hasNext()) {
            Integer num = iterator2.next();
            total += num.intValue();
        }

        System.out.println("평균 : " + (float) total / keySet.size() + "회");

        // 최대값 구하기
        System.out.print("가장 많이 감은 사람 : ");
        iterator1 = entrySet.iterator();

        while (iterator1.hasNext()) {
            Map.Entry<String, Integer> entry = iterator1.next();
            if (entry.getValue() == Collections.max(values)) System.out.print(entry.getKey() + " ");
        }

    }
}

