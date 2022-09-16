public class ThreadExample2 {
    public static void main(String[] args) {
        // Thread 클래스를 상속받은 클래스를 인스턴스화하여 스레드를 생성
        ThreadTask2 thread2 = new ThreadTask2();

        // 작업 스레드를 실행시켜, run() 내부의 코드를 처리하도록 합니다.
        thread2.start();

        // 반복문 추가
        for (int i = 0; i < 100; i++) {
            System.out.print("@");
        }
    }
}

// Thread 클래스를 상속받는 클래스 작성
class ThreadTask2 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("#");
        }
    }
}