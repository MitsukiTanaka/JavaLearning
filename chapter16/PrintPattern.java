package chapter16;

/**
 * 問題16-6<br>
 * 約3秒ごとに"***"を10回表示するスレッドと、約5秒ごとに"====="を10回表示するスレッドを、
 * それぞれひとつずつ動かすクラスをThreadクラスの拡張クラスとして作る。
 */
public class PrintPattern {
    public static void main(String[] args) {
        new PrintAsterisk().start();
        new PrintEqual().start();
    }
}

class PrintAsterisk extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("スレッドの割り込みが発生しました。");
                e.printStackTrace();
            }
            System.out.println("***");
        }
    }
}

class PrintEqual extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("スレッドの割り込みが発生しました。");
                e.printStackTrace();
            }
            System.out.println("=====");
        }
    }
}
