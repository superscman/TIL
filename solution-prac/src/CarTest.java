public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();

        car1.instanceV = "나는야 instance 변수야!";
        System.out.println(car1.instanceV);
        System.out.println(car2.instanceV);

    }
}


class Car {
    public String instanceV = "나는 인스턴스 변수";

    public static String classV = "나는 클래스 변수";

    public Car() {
        //생성자임.
    }

    public static void classM() {
//        System.out.println(instanceV);
        System.out.println(classV);
    }

    public void instanceM(){
        System.out.println(instanceV);
        System.out.println(classV);
    }
}