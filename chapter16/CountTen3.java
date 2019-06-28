package chapter16;

/**
 * 問題16-5<br>
 * CountTenA.java を参考に、新たなスレッドを1つだけ生成するのではなく、3つ生成して動作するプログラムに書き換える。<br>
 * その際、表示を行っているのがどのスレッドであるかを分かるようにする<br>
 */
public class CountTen3 extends Thread {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new CountTen3().start();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(currentThread().getName() + " main:i = " + i);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + " run:i = " + i);
        }
    }
}
