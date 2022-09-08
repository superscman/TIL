package com.codestates.seb.kiosk_program;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

// Kiosk_Program 클래스를 정의 합니다.
public class Kiosk_Program {
  //TODO:
  // 메뉴 입력 및 사용자의 수량을 입력하기 위해 Scanner 객체 생성
  static Scanner sc = new Scanner(System.in);
  /**
   * @menu_n_cost : 메뉴의 가격을 정의 합니다.
   * 메뉴의 가격은 변하지 않습니다.
   * 해당 기능은 자바독(javadoc) 기능입니다.
   */
  //TODO:
  final static int menu_1_cost = 13000;
  final static int menu_2_cost = 16000;
  final static int menu_3_cost = 25000;
  final static int menu_4_cost = 7000;

  public static int price;
  public static int choice;
  /**
   * 프로그램의 시작을 알리는 메서드입니다.
   * @.repeat() 메서드는 해당 문자를 반복해서 출력해주는 기능을 갖습니다.
   */
  public static void input_print() throws InterruptedException {
    //TODO:
    System.out.println("[안내] 안녕하세요. 차니마니고기집에 오신 것을 환영합니다.");
    System.out.println("-------------------------------------------");
    TimeUnit.SECONDS.sleep(2);
  }

  /**
   * 사용자가 원하는 메뉴를 번호로 입력받습니다.
   * @재귀함수 : 본 메서드가 동작할 때 메뉴에 없는 번호가 입력되면 자기 자신이 다시 실행되도록 합니다.
   * 해당 count() 메소드는 기능이 모두 구현되어 있습니다. Scanner 객체의 변수명만 확인해야 합니다.
   */
  public static int count() throws InterruptedException {

    System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
    TimeUnit.SECONDS.sleep(2);
    System.out.println("1) 삼겹살(13,000원) 2) 돼지갈비(16,000원) 3) 소갈비(25,000원) 4) 냉면(7,000원)");
    //sc == 최 상단에 입력받은 Scanner 객체
    //변수명이 다르다면 하단의 이름을 수정해야 합니다.
    int number = sc.nextInt();

    // 만약 사용자가 입력한 번호의 조건이 아래와 같다면,
    // 0 이하의 조건
    // 4 초과의 조건
    // 둘 중 하나라도 참 인경우 참의 값을 반환
    if (number <= 0 || number > 4) {
      // [경고] 문구를 출력합니다.
      System.out.println("[경고]메뉴에 포함된 번호를 입력하여 주세요.\n");
      // 그리고 다시 본 함수가 동작하여 다시 메뉴의 번호를 입력하도록 합니다.
      count();
    }

    // 이후 가격 연산을 위해
    // 가격(menu_n_cost)을 number 변수에 재할당 합니다.
    if (1 == number) {
      number = menu_1_cost;
    } else if (2 == number) {
      number = menu_2_cost;
    } else if (3 == number) {
      number = menu_3_cost;
    } else {
      number = menu_4_cost;
    }
    price = number;
    return number;
  }


  /**
   * 수량 입력 및 가격 연산을 진행하는 메서드를 정의합니다.
   * @수량 : 수량은 1 ~ 99 까지만 입력 받을 수 있도록 합니다.
   */
  public static void cost(int number) throws InterruptedException {
    // 안내 문구를 출력합니다.
    //TODO:
    System.out.println("-------------------------------------------");
    TimeUnit.SECONDS.sleep(2);
    System.out.println("[안내]선택하신 수량을 입력해주세요");
    TimeUnit.SECONDS.sleep(2);
    System.out.println("(※ 최대 주문 가능 수량 : 99");
    // 입력받은 수량을 변수에 저장합니다.
    //TODO:
    int Number = sc.nextInt();
    choice = Number;
    // 조건에 따라 문구 출력, 재입력을 진행합니다.
    // 조건은 다음과 같습니다.
    // 0 이하 || 99 초과
    // 두 조건 중 하나라도 참인경우 경고 문구 출력과 함께 다시 수량을 입력받을 수 있도록 합니다.
    //TODO:
    if(Number <=0) {
      System.out.println("[경고]"+Number+"개는 입력하실 수 없습니다.");
      System.out.println("[경고] 수량선택 화면으로 돌아갑니다");
      cost(number);
    }else if(Number > 99) {
      System.out.println("[경고]"+Number+"개는 입력하실 수 없습니다.");
      System.out.println("[경고] 수량선택 화면으로 돌아갑니다");
      cost(number);
    }

  }

  /**
   * 최종 가격과 종료 문구를 출력하는 메서드 입니다.
   */
  public static void output_print(int result) throws InterruptedException {
    //TODO:

    System.out.println("---------------------------------------------");
    TimeUnit.SECONDS.sleep(2);
    System.out.println("[안내]주문하신 메뉴의 가격은"+price+"이고, 개수는 "+choice+"입니다.");
    TimeUnit.SECONDS.sleep(2);
    System.out.println("[안내]주문하신 메뉴의 총 금액은 " + result+"원 입니다.");
    TimeUnit.SECONDS.sleep(2);
    System.out.println("더 주문하기 원하십니까?");
    String orderAdd = sc.next();
    if(orderAdd == "y" || orderAdd == "Y") count();
    else if(orderAdd == "x" || orderAdd == "X") System.out.println("이용해주셔서 감사합니다.");
    else {
      System.out.println("다시 입력해주시기 바랍니다.");
    }
  }

  /**
   * @main() 메서드 동작
   * 프로그램 실행 -> 메뉴 입력 -> 수량 입력 및 가격 계산 -> 가격 출력
   */

}
