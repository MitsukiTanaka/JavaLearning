package chapter16;

/**
 * 問題16-7<br>
 * 問題16-6のクラスを、Runnableインタフェースを実装して作る<br>
 */
public class PrintPattern2 {
    public static void main(String[] args) {
        PrintAsterisk2 pa = new PrintAsterisk2();
        PrintEqual2 pe = new PrintEqual2();
        Thread th1 = new Thread(pa);
        Thread th2 = new Thread(pe);
        th1.start();
        th2.start();
    }
}

class PrintAsterisk2 implements Runnable {
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

class PrintEqual2 implements Runnable {
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
