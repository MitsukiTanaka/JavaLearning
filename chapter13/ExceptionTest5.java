package chapter13;

/**
 * 問題13-3<br>
 * 例外がどのメソッドから投げられているか、実行結果で判断できるようにmainメソッドを修正する<br>
 */
public class ExceptionTest5 {
    public static void main(String[] args) {
        try {
            method1(0);
            method2(0);
            method3(0);
        } catch (Exception e) {
            System.out.println("例外：" + e);
            e.printStackTrace();     /* ここを追加 */
        }
    }

    static void method1(int x) throws Exception {
        if (x < 0) {
            throw new Exception();
        }
    }

    static void method2(int x) throws Exception {
        if (x > 0) {
            throw new Exception();
        }
    }

    static void method3(int x) throws Exception {
        if (x == 0) {
            throw new Exception();
        }
    }
}
