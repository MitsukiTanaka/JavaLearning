package chapter12;

/**
 * 問題12-5<br>
 * 問題12-4のPlacedRectangleを、Rectangleのサブクラスとしてではなく、<br>
 * Rectangle型のインスタンス変数を持つクラスとして宣言する。
 */
public class PlacedRectangle2 {
    int x;
    int y;
    Rectangle4 r;

    /* コンストラクタ(1) 引数なし */
    PlacedRectangle2() {
        setLocation(0,0);
        r = new Rectangle4();
    }

    /* コンストラクタ(2) 位置付き */
    PlacedRectangle2(int x, int y) {
        setLocation(x, y);
        r = new Rectangle4();
    }

    /* コンストラクタ(3) 位置と大きさ付き */
    PlacedRectangle2(int x, int y, int width, int height) {
        setLocation(x, y);
        r = new Rectangle4(width, height);
    }

    /* setLocationメソッド */
    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[ (" + x + ", " + y + ") " + r + " ]";
    }

    public static void main(String[] args) {
        PlacedRectangle2 a = new PlacedRectangle2();
        PlacedRectangle2 b = new PlacedRectangle2(12, 34);
        PlacedRectangle2 c = new PlacedRectangle2(12, 34, 123, 45);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
