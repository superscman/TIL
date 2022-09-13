class Phone {}

class IPhone extends Phone {}
class Galaxy extends Phone {}

class IPhone12Pro extends IPhone {}
class IPhoneXS extends IPhone {}

class S22 extends Galaxy {}
class ZFlip3 extends Galaxy {}

class User<T> {
    public T phone;

    public User(T phone) {
        this.phone = phone;
    }
}

class PhoneFunction {
    public static void call(User<? extends Phone> user) {
        System.out.println("-----------------------------");
        System.out.println("user.phone = " + user.phone.getClass().getSimpleName());
        System.out.println("모든 Phone은 통화를 할 수 있습니다.");
    }

    public static void faceId(User<? extends IPhone> user) {
        System.out.println("-----------------------------");
        System.out.println("user.phone = " + user.phone.getClass().getSimpleName());
        System.out.println("IPhone만 Face ID를 사용할 수 있습니다. ");
    }

    public static void samsungPay(User<? extends Galaxy> user) {
        System.out.println("-----------------------------");
        System.out.println("user.phone = " + user.phone.getClass().getSimpleName());
        System.out.println("Galaxy만 삼성 페이를 사용할 수 있습니다. ");
    }

    public static void recordVoice(User<? super Galaxy> user) {
        System.out.println("-----------------------------");
        System.out.println("user.phone = " + user.phone.getClass().getSimpleName());
        System.out.println("안드로이드 폰에서만 통화 녹음이 가능합니다. ");
    }
}