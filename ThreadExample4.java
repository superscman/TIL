public class ThreadExample4 {
    public static void main(String[] args) {
        /// 쓰레드 이름 찾기
        Thread thread3 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Get Thread Name");
            }
        });

        thread3.start();

        System.out.println("thread3.getName() = " + thread3.getName());


        // 쓰레드 이름 설정하기
        Thread thread4 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Set And Get Thread Name");
            }
        });

        thread4.start();

        System.out.println("thread4.getName() = " + thread4.getName());

        thread4.setName("Code States");

        System.out.println("thread4.getName() = " + thread4.getName());
    }
}