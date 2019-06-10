package chapter13;

/**
 * 問題13-4 10の階乗を求めるプログラム<br>
 * 以下の誤りを直す<br>
 * <pre>{@code
 * public class FactorialTest {
 *     public static void main(String[] args) {
 *         System.out.println(factorial(10));
 *     }
 *     public static int factorial(int n) {
 *         return n * factorial(n - 1);
 *     }
 * }
 * }</pre>
 */
public class FactorialTest {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    public static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }
}
