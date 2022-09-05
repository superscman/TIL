import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class StarcraftTxt {
    public static void main(String[] args) throws InterruptedException {
        // 객체생성 -> 유닛생성 -> 유닛정보출력 -> 문자열 정수 전환 -> 유닛공격
        Scanner sc = new Scanner(System.in);
        Unit star = new Unit();

        System.out.println("[안내] TRPG 스타크래프트 시작합니다.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("[안내] 자신의 유닛 정보를 입력할 차례입니다.");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("[시스템] 유닛 [이름] 을 입력해 주세요 \n - 유닛이름: ");
        String Unit = sc.nextLine();
        star.MakeUnit(Unit,100,10,1000);
        System.out.println("[안내] 상대방의 유닛 정보를 입력할 차례입니다.");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("[시스템] 유닛 [이름] 을 입력해 주세요 \n - 유닛이름: ");
        String UrUnit = sc.nextLine();
        star.MakeUnit(UrUnit,20,5,50);

        System.out.print(" >>>> 공격하시려면 Y , 종료하시려면  N를 입력하세요 \n 선택: ");

        for (int i = 0; i < 2; i++) {
            String yesno_cheek = sc.next();
            if (yesno_cheek.equals("y") || yesno_cheek.equals("Y")) {
                System.out.println("공격하겠습니다.");
                star.Attack(Unit, UrUnit);
                System.out.println("[안내] TRPG 스타크래프트를 이용해주셔서 감사합니다.");
            } else if (yesno_cheek.equals("n") || yesno_cheek.equals("N")) {
                System.out.println("때리면 아프잖아요 싫어요.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("[안내] TRPG 스타크래프트를 이용해주셔서 감사합니다.");
                System.exit(0);
            } else {
                System.out.println("다시 입력해 주세요");
            }
        }



    }
}
class Unit {
    String Unit; // 유닛이름
    int UnitHp; // 에너지
    int UnitSp; // 방어력
    int UnitAp; // 공격력

    public static void MakeUnit(String Unit, int UnitAp, int UnitSp, int UnitHp) throws InterruptedException {

        System.out.println("[안내] 생성된 유닛 정보는 다음과 같습니다.");
        TimeUnit.SECONDS.sleep(2);
        System.out.printf("[안내] %s 유닛이 게임에 참여하였습니다.\n", Unit);
        TimeUnit.SECONDS.sleep(2);
        System.out.println("[공격력] :" + UnitAp);
        System.out.println("[방어력] :" + UnitSp);
        System.out.println("[체력] :" + UnitHp);
        System.out.println("==================================");
        TimeUnit.SECONDS.sleep(2);
    }
    public static void Attack(String Unit, String UrUnit) throws InterruptedException {
        System.out.println("**********************************");
        TimeUnit.SECONDS.sleep(2);
        System.out.printf("[안내] %s이 %s을 [공격] 하였습니다.\n",Unit,UrUnit);
        TimeUnit.SECONDS.sleep(2);
        System.out.println("[안내] 상대 유닛의 남은 [체력]은 0 입니다.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("[안내] 더 이상 공격할 수 없습니다.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("[안내] 상대유닛이 제거당했습니다.");
        TimeUnit.SECONDS.sleep(2);
    }
}