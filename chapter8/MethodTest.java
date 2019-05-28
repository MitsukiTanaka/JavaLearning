package chapter8;

/**
 * List 8-6 ２つの値を返すメソッド
 */
public class MethodTest {
    public static void main(String[] args) {
        String[] name = getYourName();
        System.out.println("苗字は" + name[0]);
        System.out.println("名前は" + name[1]);
    }

    public static String[] getYourName() {
        String[] arr;
        arr = new String[2];
        arr[0] = "結城";
        arr[1] = "浩";
        return arr;
    }
}
