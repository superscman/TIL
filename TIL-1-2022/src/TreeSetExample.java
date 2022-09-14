import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 1; treeSet.size() < 6; i++) {
            int num = (int) (Math.random() * 6) + 1;

            System.out.println("오늘의 인도자는 " + num);

            try { Thread.sleep(1000); } catch (Exception e) {}

            treeSet.add(num);
        }

        System.out.println("당첨 번호는 : " + treeSet);
    }
}