public class ThreadExample3 {
    public static void main(String[] args) {

        // 익명 Runnable 구현 객체를 활용하여 스레드 생성
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.print("#");
                }
            }
        });

        thread1.start();

        // 익명 Thread 하위 객체를 활용한 스레드 생성
        Thread thread2 = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.print("^");
                }
            }
        };

        thread2.start();

        for (int i = 0; i < 100; i++) {
            System.out.print("@");
        }
    }
}