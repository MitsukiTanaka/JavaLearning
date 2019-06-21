package chapter16;

/**
 * 問題16-5<br>
 * CountTenA.java を参考に、新たなスレッドを1つだけ生成するのではなく、3つ生成して動作するプログラムに書き換える。<br>
 * その際、表示を行っているのがどのスレッドであるかを分かるようにする<br>
 */
public class CountTen3 extends Thread {
    public static void main(String[] args) {
        CountTen3 ct1 = new CountTen3();
        CountTen3 ct2 = new CountTen3();
        CountTen3 ct3 = new CountTen3();
        ct1.start();
        ct2.start();
        ct3.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " main:i = " + i);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " run:i = " + i);
        }
    }
}
