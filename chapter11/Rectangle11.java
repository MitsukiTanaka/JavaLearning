package chapter11;

/**
 * 問題11-7<br>
 * widthフィールドが123で、heightフィールドが45であるような
 * Rectangleのインスタンスを表示したとき、<br>
 * 　　Rectangle(123,45)<br>
 * と表示されるようにしたい。どのようなプログラムを書けば良いか。
 */
public class Rectangle11 {
    int width;
    int height;

    Rectangle11(int width, int height) {
        setSize(width, height);
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle(" + width + ", " + height + ")";
    }

    public static void main(String[] args) {
        Rectangle11 r = new Rectangle11(123, 45);
        System.out.println(r);
    }
}
