package RecursiveCase;

public class PibonachiAndFactorial {
    public static void main(String[] args) {
        // 배열의 최대값을 가져온다

        System.out.println(factorial(5));
    }



    // 피보나치 수열
    public static int fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // 팩토리얼
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    // 꼬리 재귀 최적화가 되지 않은 재귀 함수
    int recursive(int n)
    {
        if(n==1) return 1;
        return n + recursive(n-1);
    }

    // 꼬리 재귀 최적화된 재귀 함수
    int tailRecursive(int n, int acc)
    {
        if(n==1) return acc;
        return tailRecursive(n-1, n + acc );
    }
}