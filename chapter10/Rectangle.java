package chapter10;

/**
 * 問題10-2 「長方形」クラスを宣言
 */
public class Rectangle {
    int width;      // 幅 を表すフィールド
    int height;     // 高さ を表すフィールド

    // 幅と高さを指定するコンストラクタ
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // toStringメソッド
    @Override
    public String toString() {
        return "[ " + width + ", " + height + " ]";
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(123, 45);
        System.out.println(r);
    }
}
